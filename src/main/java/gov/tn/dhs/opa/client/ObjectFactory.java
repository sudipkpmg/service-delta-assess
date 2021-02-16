
package gov.tn.dhs.opa.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.tn.dhs.opa.client package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AssessRequest_QNAME = new QName("http://oracle.com/determinations/server/12.2.1/rulebase/assess/types", "assess-request");
    private final static QName _AssessResponse_QNAME = new QName("http://oracle.com/determinations/server/12.2.1/rulebase/assess/types", "assess-response");
    private final static QName _ListGoalsRequest_QNAME = new QName("http://oracle.com/determinations/server/12.2.1/rulebase/assess/types", "list-goals-request");
    private final static QName _ListGoalsResponse_QNAME = new QName("http://oracle.com/determinations/server/12.2.1/rulebase/assess/types", "list-goals-response");
    private final static QName _ErrorResponse_QNAME = new QName("http://oracle.com/determinations/server/12.2.1/rulebase/assess/types", "error-response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.tn.dhs.opa.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RulebaseEventType }
     * 
     */
    public RulebaseEventType createRulebaseEventType() {
        return new RulebaseEventType();
    }

    /**
     * Create an instance of {@link ResponseOutcome }
     * 
     */
    public ResponseOutcome createResponseOutcome() {
        return new ResponseOutcome();
    }

    /**
     * Create an instance of {@link AssessRequest }
     * 
     */
    public AssessRequest createAssessRequest() {
        return new AssessRequest();
    }

    /**
     * Create an instance of {@link AssessResponse }
     * 
     */
    public AssessResponse createAssessResponse() {
        return new AssessResponse();
    }

    /**
     * Create an instance of {@link ListGoalsRequest }
     * 
     */
    public ListGoalsRequest createListGoalsRequest() {
        return new ListGoalsRequest();
    }

    /**
     * Create an instance of {@link ListGoalsResponse }
     * 
     */
    public ListGoalsResponse createListGoalsResponse() {
        return new ListGoalsResponse();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link ListGoalsEntityType }
     * 
     */
    public ListGoalsEntityType createListGoalsEntityType() {
        return new ListGoalsEntityType();
    }

    /**
     * Create an instance of {@link ListGoalsAttributeType }
     * 
     */
    public ListGoalsAttributeType createListGoalsAttributeType() {
        return new ListGoalsAttributeType();
    }

    /**
     * Create an instance of {@link AssessmentConfiguration }
     * 
     */
    public AssessmentConfiguration createAssessmentConfiguration() {
        return new AssessmentConfiguration();
    }

    /**
     * Create an instance of {@link OutcomeType }
     * 
     */
    public OutcomeType createOutcomeType() {
        return new OutcomeType();
    }

    /**
     * Create an instance of {@link UnknownValue }
     * 
     */
    public UnknownValue createUnknownValue() {
        return new UnknownValue();
    }

    /**
     * Create an instance of {@link UncertainValue }
     * 
     */
    public UncertainValue createUncertainValue() {
        return new UncertainValue();
    }

    /**
     * Create an instance of {@link ChangePoint }
     * 
     */
    public ChangePoint createChangePoint() {
        return new ChangePoint();
    }

    /**
     * Create an instance of {@link ListEventsType }
     * 
     */
    public ListEventsType createListEventsType() {
        return new ListEventsType();
    }

    /**
     * Create an instance of {@link DecisionReportType }
     * 
     */
    public DecisionReportType createDecisionReportType() {
        return new DecisionReportType();
    }

    /**
     * Create an instance of {@link AttributeNodeType }
     * 
     */
    public AttributeNodeType createAttributeNodeType() {
        return new AttributeNodeType();
    }

    /**
     * Create an instance of {@link RelationshipNodeType }
     * 
     */
    public RelationshipNodeType createRelationshipNodeType() {
        return new RelationshipNodeType();
    }

    /**
     * Create an instance of {@link AlreadyProvenNodeType }
     * 
     */
    public AlreadyProvenNodeType createAlreadyProvenNodeType() {
        return new AlreadyProvenNodeType();
    }

    /**
     * Create an instance of {@link ReferenceTagList }
     * 
     */
    public ReferenceTagList createReferenceTagList() {
        return new ReferenceTagList();
    }

    /**
     * Create an instance of {@link ReferenceTag }
     * 
     */
    public ReferenceTag createReferenceTag() {
        return new ReferenceTag();
    }

    /**
     * Create an instance of {@link ListCustomPropertiesType }
     * 
     */
    public ListCustomPropertiesType createListCustomPropertiesType() {
        return new ListCustomPropertiesType();
    }

    /**
     * Create an instance of {@link CustomPropertyType }
     * 
     */
    public CustomPropertyType createCustomPropertyType() {
        return new CustomPropertyType();
    }

    /**
     * Create an instance of {@link RelationshipType }
     * 
     */
    public RelationshipType createRelationshipType() {
        return new RelationshipType();
    }

    /**
     * Create an instance of {@link RelationshipTargetType }
     * 
     */
    public RelationshipTargetType createRelationshipTargetType() {
        return new RelationshipTargetType();
    }

    /**
     * Create an instance of {@link GlobalInstanceType }
     * 
     */
    public GlobalInstanceType createGlobalInstanceType() {
        return new GlobalInstanceType();
    }

    /**
     * Create an instance of {@link EntityType }
     * 
     */
    public EntityType createEntityType() {
        return new EntityType();
    }

    /**
     * Create an instance of {@link EntityInstanceType }
     * 
     */
    public EntityInstanceType createEntityInstanceType() {
        return new EntityInstanceType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link VersionInfoType }
     * 
     */
    public VersionInfoType createVersionInfoType() {
        return new VersionInfoType();
    }

    /**
     * Create an instance of {@link RulebaseEventType.Parameters }
     * 
     */
    public RulebaseEventType.Parameters createRulebaseEventTypeParameters() {
        return new RulebaseEventType.Parameters();
    }

    /**
     * Create an instance of {@link ResponseOutcome.Entity }
     * 
     */
    public ResponseOutcome.Entity createResponseOutcomeEntity() {
        return new ResponseOutcome.Entity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssessRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.com/determinations/server/12.2.1/rulebase/assess/types", name = "assess-request")
    public JAXBElement<AssessRequest> createAssessRequest(AssessRequest value) {
        return new JAXBElement<AssessRequest>(_AssessRequest_QNAME, AssessRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.com/determinations/server/12.2.1/rulebase/assess/types", name = "assess-response")
    public JAXBElement<AssessResponse> createAssessResponse(AssessResponse value) {
        return new JAXBElement<AssessResponse>(_AssessResponse_QNAME, AssessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListGoalsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListGoalsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.com/determinations/server/12.2.1/rulebase/assess/types", name = "list-goals-request")
    public JAXBElement<ListGoalsRequest> createListGoalsRequest(ListGoalsRequest value) {
        return new JAXBElement<ListGoalsRequest>(_ListGoalsRequest_QNAME, ListGoalsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListGoalsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListGoalsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.com/determinations/server/12.2.1/rulebase/assess/types", name = "list-goals-response")
    public JAXBElement<ListGoalsResponse> createListGoalsResponse(ListGoalsResponse value) {
        return new JAXBElement<ListGoalsResponse>(_ListGoalsResponse_QNAME, ListGoalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Error }{@code >}
     */
    @XmlElementDecl(namespace = "http://oracle.com/determinations/server/12.2.1/rulebase/assess/types", name = "error-response")
    public JAXBElement<Error> createErrorResponse(Error value) {
        return new JAXBElement<Error>(_ErrorResponse_QNAME, Error.class, null, value);
    }

}
