package gov.tn.dhs.opa.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import gov.tn.dhs.opa.client.ListGoalsRequest;
import gov.tn.dhs.opa.client.ListGoalsResponse;
import gov.tn.dhs.opa.client.OdsAssessServiceGeneric1221ServiceDelta;
import gov.tn.dhs.opa.client.OdsAssessServiceGeneric1221ServiceDeltaType;
import gov.tn.dhs.opa.config.AppProperties;
import gov.tn.dhs.opa.model.Goal;
import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Service
public class ListGoalsService extends BaseService {

    private static final Logger logger = LoggerFactory.getLogger(ListGoalsService.class);

    private static final QName SERVICE_NAME = new QName(
            "http://oracle.com/determinations/server/12.2.1/rulebase/assess/types",
            "odsAssessServiceGeneric1221_ServiceDelta"
    );

    public ListGoalsService(AppProperties appProperties) {
        super(appProperties);
    }

    public void process(Exchange exchange) {
        URL wsdlURL = null;
        try {
            wsdlURL = new URL("classpath:service_delta_assess.wsdl");
        } catch (MalformedURLException e) {
            setupError("500", "Service error");
        }
        OdsAssessServiceGeneric1221ServiceDelta ss = new OdsAssessServiceGeneric1221ServiceDelta(wsdlURL, SERVICE_NAME);
        OdsAssessServiceGeneric1221ServiceDeltaType port = ss.getOdsAssessServiceGeneric1221ServiceDeltaSOAP();
        logger.info("Invoking listGoals...");
        ListGoalsRequest listGoalsRequest = new ListGoalsRequest();
        ListGoalsResponse listGoalsResponse = null;
        try {
            listGoalsResponse = port.listGoals(listGoalsRequest);
        } catch (Exception e) {
            setupError("500", "Service error");
        }
        final ObjectMapper objectMapper = new ObjectMapper();
        try {
            String listGoalResponseStr = objectMapper.writeValueAsString(listGoalsResponse);
            logger.info("listGoals.result=" + listGoalResponseStr);
            JsonNode jsonNode = objectMapper.readValue(listGoalResponseStr, JsonNode.class);
            JsonNode goals = ((jsonNode.get("entity")).get(0)).get("attribute");
            logger.info(goals.toString());
            List<Goal> goalList = new LinkedList<>();
            if (goals.isArray()) {
                Iterator<JsonNode> jsonNodeIterator = goals.iterator();
                while (jsonNodeIterator.hasNext()) {
                    JsonNode goalNode = jsonNodeIterator.next();
                    Goal goal = new Goal();
                    goal.setId(goalNode.get("id").asText());
                    goal.setType(goalNode.get("type").asText());
                    goal.setText(goalNode.get("text").asText());
                    goalList.add(goal);
                }
            }
            setupResponse(exchange, "200", goalList);
        } catch (JsonProcessingException e) {
            setupError("500", "Service error");
        }
    }

}



