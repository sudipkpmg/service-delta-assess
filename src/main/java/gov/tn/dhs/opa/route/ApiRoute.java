package gov.tn.dhs.opa.route;

import com.fasterxml.jackson.core.JsonParseException;
import gov.tn.dhs.opa.config.AppProperties;
import gov.tn.dhs.opa.exception.ServiceErrorException;
import gov.tn.dhs.opa.model.SimpleMessage;
import gov.tn.dhs.opa.service.ListGoalsService;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Configuration
public class ApiRoute extends RouteBuilder {

    AppProperties appProperties;
    ListGoalsService listGoalsService;

    public ApiRoute(
            ListGoalsService listGoalsService,
            AppProperties appProperties
    ) {
        this.listGoalsService = listGoalsService;
        this.appProperties = appProperties;
    }

    @Override
    public void configure() {

        onException(JsonParseException.class)
                .handled(true)
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(400))
                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                .setBody(constant("{}"))
        ;

        onException(Exception.class)
                .handled(true)
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(500))
                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                .setBody(simple("${exception.message}"))
        ;

        onException(ServiceErrorException.class)
                .handled(true)
                .setHeader(Exchange.HTTP_RESPONSE_CODE, simple("${exception.code}"))
                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                .setBody(simple("${exception.message}"))
        ;

        restConfiguration()
                .enableCORS(true)
                .apiProperty("cors", "true") // cross-site
                .component("servlet")
                .port(appProperties.getServerPort())
                .bindingMode(RestBindingMode.json)
                .dataFormatProperty("prettyPrint", "true");

        rest()
                .post("/list_goals")
                .outType(List.class)
                .to("direct:listGoalsService")
        ;
        from("direct:listGoalsService")
                .log("received request to list all goals ...")
                .bean(listGoalsService)
                .endRest()
        ;

        rest()
                .get("/")
                .to("direct:runningStatus")
        ;
        from("direct:runningStatus")
                .log("runStatus property value is " + appProperties.getRunStatus())
                .process(exchange -> exchange.getIn().setBody(new SimpleMessage(appProperties.getRunStatus()), SimpleMessage.class))
                .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(200))
                .setHeader("Content-Type", constant("application/json"))
                .endRest()
        ;

    }

}
