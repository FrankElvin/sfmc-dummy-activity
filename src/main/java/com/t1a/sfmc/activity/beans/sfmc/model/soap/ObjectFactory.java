
package com.t1a.sfmc.activity.beans.sfmc.model.soap;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.t1a.sfmc.activity.beans.sfmc.model.soap package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _CreateOptions_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "CreateOptions");
    private static final QName _UpdateOptions_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "UpdateOptions");
    private static final QName _DeleteOptions_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "DeleteOptions");
    private static final QName _ContentValidation_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "ContentValidation");
    private static final QName _MinutelyRecurrence_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "MinutelyRecurrence");
    private static final QName _HourlyRecurrence_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "HourlyRecurrence");
    private static final QName _DailyRecurrence_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "DailyRecurrence");
    private static final QName _WeeklyRecurrence_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "WeeklyRecurrence");
    private static final QName _MonthlyRecurrence_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "MonthlyRecurrence");
    private static final QName _YearlyRecurrence_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "YearlyRecurrence");
    private static final QName _Subscriber_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Subscriber");
    private static final QName _SubscriberList_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberList");
    private static final QName _List_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "List");
    private static final QName _Group_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Group");
    private static final QName _ListAttribute_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "ListAttribute");
    private static final QName _ListAttributeRestrictedValue_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "ListAttributeRestrictedValue");
    private static final QName _Campaign_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Campaign");
    private static final QName _Send_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Send");
    private static final QName _TriggeredSendDefinition_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendDefinition");
    private static final QName _TriggeredSendExclusionList_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendExclusionList");
    private static final QName _TriggeredSend_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSend");
    private static final QName _TriggeredSendCreateResult_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendCreateResult");
    private static final QName _SubscriberResult_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberResult");
    private static final QName _SenderProfile_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SenderProfile");
    private static final QName _DeliveryProfile_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "DeliveryProfile");
    private static final QName _PrivateDomain_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateDomain");
    private static final QName _PrivateDomainSet_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateDomainSet");
    private static final QName _PrivateIP_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateIP");
    private static final QName _SendDefinition_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SendDefinition");
    private static final QName _AudienceItem_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "AudienceItem");
    private static final QName _EmailSendDefinition_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "EmailSendDefinition");
    private static final QName _DeprecatedEmailSendDefinition_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "DeprecatedEmailSendDefinition");
    private static final QName _SendDefinitionList_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SendDefinitionList");
    private static final QName _Apifault_QNAME = new QName("urn:fault.partner.exacttarget.com", "apifault");
    private static final QName _APIObjectPartnerKey_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerKey");
    private static final QName _APIObjectModifiedDate_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "ModifiedDate");
    private static final QName _APIObjectObjectID_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "ObjectID");
    private static final QName _CategoryId_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Id");
    private static final QName _CategoryParentId_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "ParentId");
    private static final QName _CategoryMemberId_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "MemberId");
    private static final QName _CategoryEnterpriseId_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "EnterpriseId");
    private static final QName _AssetVersion_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Version");
    private static final QName _AssetLocked_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Locked");
    private static final QName _AssetActiveDate_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "ActiveDate");
    private static final QName _AssetExpirationDate_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "ExpirationDate");
    private static final QName _AssetMinBlocks_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "MinBlocks");
    private static final QName _AssetMaxBlocks_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "MaxBlocks");
    private static final QName _AttributeEntityV1Order_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Order");
    private static final QName _ListSendNumberSent_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "NumberSent");
    private static final QName _ListSendNumberDelivered_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "NumberDelivered");
    private static final QName _UserAccessName_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final QName _UserAccessValue_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Value");
    private static final QName _UserAccessDescription_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final QName _AccountUserAccountUserID_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "AccountUserID");
    private static final QName _SubscriptionSubscriptionID_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriptionID");
    private static final QName _SubscriptionNotes_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Notes");
    private static final QName _SubscriptionNotificationTitle_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "NotificationTitle");
    private static final QName _SubscriptionNotificationMessage_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "NotificationMessage");
    private static final QName _SubscriptionNotificationFlag_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "NotificationFlag");
    private static final QName _SubscriptionNotificationExpDate_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "NotificationExpDate");
    private static final QName _SubscriptionForAccounting_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "ForAccounting");
    private static final QName _AccountDataItemBrandID_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "BrandID");
    private static final QName _AccountDataItemPrivateLabelID_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateLabelID");
    private static final QName _AccountDataItemAccountType_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "AccountType");
    private static final QName _AccountSubscription_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "Subscription");
    private static final QName _SendSentDate_QNAME = new QName("http://exacttarget.com/wsdl/partnerAPI", "SentDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.t1a.sfmc.activity.beans.sfmc.model.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PerformRequestMsg }
     * 
     * @return
     *     the new instance of {@link PerformRequestMsg }
     */
    public PerformRequestMsg createPerformRequestMsg() {
        return new PerformRequestMsg();
    }

    /**
     * Create an instance of {@link PerformResponseMsg }
     * 
     * @return
     *     the new instance of {@link PerformResponseMsg }
     */
    public PerformResponseMsg createPerformResponseMsg() {
        return new PerformResponseMsg();
    }

    /**
     * Create an instance of {@link ConfigureRequestMsg }
     * 
     * @return
     *     the new instance of {@link ConfigureRequestMsg }
     */
    public ConfigureRequestMsg createConfigureRequestMsg() {
        return new ConfigureRequestMsg();
    }

    /**
     * Create an instance of {@link ConfigureResponseMsg }
     * 
     * @return
     *     the new instance of {@link ConfigureResponseMsg }
     */
    public ConfigureResponseMsg createConfigureResponseMsg() {
        return new ConfigureResponseMsg();
    }

    /**
     * Create an instance of {@link ScheduleRequestMsg }
     * 
     * @return
     *     the new instance of {@link ScheduleRequestMsg }
     */
    public ScheduleRequestMsg createScheduleRequestMsg() {
        return new ScheduleRequestMsg();
    }

    /**
     * Create an instance of {@link ScheduleResponseMsg }
     * 
     * @return
     *     the new instance of {@link ScheduleResponseMsg }
     */
    public ScheduleResponseMsg createScheduleResponseMsg() {
        return new ScheduleResponseMsg();
    }

    /**
     * Create an instance of {@link ExtractResponseMsg }
     * 
     * @return
     *     the new instance of {@link ExtractResponseMsg }
     */
    public ExtractResponseMsg createExtractResponseMsg() {
        return new ExtractResponseMsg();
    }

    /**
     * Create an instance of {@link SystemStatusResponseMsg }
     * 
     * @return
     *     the new instance of {@link SystemStatusResponseMsg }
     */
    public SystemStatusResponseMsg createSystemStatusResponseMsg() {
        return new SystemStatusResponseMsg();
    }

    /**
     * Create an instance of {@link APIFault }
     * 
     * @return
     *     the new instance of {@link APIFault }
     */
    public APIFault createAPIFault() {
        return new APIFault();
    }

    /**
     * Create an instance of {@link AttributeValueContainer }
     * 
     * @return
     *     the new instance of {@link AttributeValueContainer }
     */
    public AttributeValueContainer createAttributeValueContainer() {
        return new AttributeValueContainer();
    }

    /**
     * Create an instance of {@link AttributeSet }
     * 
     * @return
     *     the new instance of {@link AttributeSet }
     */
    public AttributeSet createAttributeSet() {
        return new AttributeSet();
    }

    /**
     * Create an instance of {@link ContactEvent }
     * 
     * @return
     *     the new instance of {@link ContactEvent }
     */
    public ContactEvent createContactEvent() {
        return new ContactEvent();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     * @return
     *     the new instance of {@link Asset }
     */
    public Asset createAsset() {
        return new Asset();
    }

    /**
     * Create an instance of {@link SuppressionListData }
     * 
     * @return
     *     the new instance of {@link SuppressionListData }
     */
    public SuppressionListData createSuppressionListData() {
        return new SuppressionListData();
    }

    /**
     * Create an instance of {@link SuppressionListDefinition }
     * 
     * @return
     *     the new instance of {@link SuppressionListDefinition }
     */
    public SuppressionListDefinition createSuppressionListDefinition() {
        return new SuppressionListDefinition();
    }

    /**
     * Create an instance of {@link AutomationTask }
     * 
     * @return
     *     the new instance of {@link AutomationTask }
     */
    public AutomationTask createAutomationTask() {
        return new AutomationTask();
    }

    /**
     * Create an instance of {@link AutomationTaskInstance }
     * 
     * @return
     *     the new instance of {@link AutomationTaskInstance }
     */
    public AutomationTaskInstance createAutomationTaskInstance() {
        return new AutomationTaskInstance();
    }

    /**
     * Create an instance of {@link Automation }
     * 
     * @return
     *     the new instance of {@link Automation }
     */
    public Automation createAutomation() {
        return new Automation();
    }

    /**
     * Create an instance of {@link AutomationInstance }
     * 
     * @return
     *     the new instance of {@link AutomationInstance }
     */
    public AutomationInstance createAutomationInstance() {
        return new AutomationInstance();
    }

    /**
     * Create an instance of {@link AutomationInstances }
     * 
     * @return
     *     the new instance of {@link AutomationInstances }
     */
    public AutomationInstances createAutomationInstances() {
        return new AutomationInstances();
    }

    /**
     * Create an instance of {@link Publication }
     * 
     * @return
     *     the new instance of {@link Publication }
     */
    public Publication createPublication() {
        return new Publication();
    }

    /**
     * Create an instance of {@link SubscriberAddress }
     * 
     * @return
     *     the new instance of {@link SubscriberAddress }
     */
    public SubscriberAddress createSubscriberAddress() {
        return new SubscriberAddress();
    }

    /**
     * Create an instance of {@link SystemStatusResult }
     * 
     * @return
     *     the new instance of {@link SystemStatusResult }
     */
    public SystemStatusResult createSystemStatusResult() {
        return new SystemStatusResult();
    }

    /**
     * Create an instance of {@link ObjectExtension }
     * 
     * @return
     *     the new instance of {@link ObjectExtension }
     */
    public ObjectExtension createObjectExtension() {
        return new ObjectExtension();
    }

    /**
     * Create an instance of {@link ImportDefinition }
     * 
     * @return
     *     the new instance of {@link ImportDefinition }
     */
    public ImportDefinition createImportDefinition() {
        return new ImportDefinition();
    }

    /**
     * Create an instance of {@link DataExtensionDeleteResult }
     * 
     * @return
     *     the new instance of {@link DataExtensionDeleteResult }
     */
    public DataExtensionDeleteResult createDataExtensionDeleteResult() {
        return new DataExtensionDeleteResult();
    }

    /**
     * Create an instance of {@link DataExtensionUpdateResult }
     * 
     * @return
     *     the new instance of {@link DataExtensionUpdateResult }
     */
    public DataExtensionUpdateResult createDataExtensionUpdateResult() {
        return new DataExtensionUpdateResult();
    }

    /**
     * Create an instance of {@link DataExtensionCreateResult }
     * 
     * @return
     *     the new instance of {@link DataExtensionCreateResult }
     */
    public DataExtensionCreateResult createDataExtensionCreateResult() {
        return new DataExtensionCreateResult();
    }

    /**
     * Create an instance of {@link DataExtensionObject }
     * 
     * @return
     *     the new instance of {@link DataExtensionObject }
     */
    public DataExtensionObject createDataExtensionObject() {
        return new DataExtensionObject();
    }

    /**
     * Create an instance of {@link PropertyDefinition }
     * 
     * @return
     *     the new instance of {@link PropertyDefinition }
     */
    public PropertyDefinition createPropertyDefinition() {
        return new PropertyDefinition();
    }

    /**
     * Create an instance of {@link DataExtension }
     * 
     * @return
     *     the new instance of {@link DataExtension }
     */
    public DataExtension createDataExtension() {
        return new DataExtension();
    }

    /**
     * Create an instance of {@link DoubleOptInMOKeyword }
     * 
     * @return
     *     the new instance of {@link DoubleOptInMOKeyword }
     */
    public DoubleOptInMOKeyword createDoubleOptInMOKeyword() {
        return new DoubleOptInMOKeyword();
    }

    /**
     * Create an instance of {@link PermissionSet }
     * 
     * @return
     *     the new instance of {@link PermissionSet }
     */
    public PermissionSet createPermissionSet() {
        return new PermissionSet();
    }

    /**
     * Create an instance of {@link Role }
     * 
     * @return
     *     the new instance of {@link Role }
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link AccountUser }
     * 
     * @return
     *     the new instance of {@link AccountUser }
     */
    public AccountUser createAccountUser() {
        return new AccountUser();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link ExtractDefinition }
     * 
     * @return
     *     the new instance of {@link ExtractDefinition }
     */
    public ExtractDefinition createExtractDefinition() {
        return new ExtractDefinition();
    }

    /**
     * Create an instance of {@link ExtractDescription }
     * 
     * @return
     *     the new instance of {@link ExtractDescription }
     */
    public ExtractDescription createExtractDescription() {
        return new ExtractDescription();
    }

    /**
     * Create an instance of {@link ScheduleResponse }
     * 
     * @return
     *     the new instance of {@link ScheduleResponse }
     */
    public ScheduleResponse createScheduleResponse() {
        return new ScheduleResponse();
    }

    /**
     * Create an instance of {@link ContentValidationTaskResult }
     * 
     * @return
     *     the new instance of {@link ContentValidationTaskResult }
     */
    public ContentValidationTaskResult createContentValidationTaskResult() {
        return new ContentValidationTaskResult();
    }

    /**
     * Create an instance of {@link ValidationAction }
     * 
     * @return
     *     the new instance of {@link ValidationAction }
     */
    public ValidationAction createValidationAction() {
        return new ValidationAction();
    }

    /**
     * Create an instance of {@link PerformResponse }
     * 
     * @return
     *     the new instance of {@link PerformResponse }
     */
    public PerformResponse createPerformResponse() {
        return new PerformResponse();
    }

    /**
     * Create an instance of {@link PerformRequest }
     * 
     * @return
     *     the new instance of {@link PerformRequest }
     */
    public PerformRequest createPerformRequest() {
        return new PerformRequest();
    }

    /**
     * Create an instance of {@link ComplexFilterPart }
     * 
     * @return
     *     the new instance of {@link ComplexFilterPart }
     */
    public ComplexFilterPart createComplexFilterPart() {
        return new ComplexFilterPart();
    }

    /**
     * Create an instance of {@link TagFilterPart }
     * 
     * @return
     *     the new instance of {@link TagFilterPart }
     */
    public TagFilterPart createTagFilterPart() {
        return new TagFilterPart();
    }

    /**
     * Create an instance of {@link SendDefinitionList }
     * 
     * @return
     *     the new instance of {@link SendDefinitionList }
     */
    public SendDefinitionList createSendDefinitionList() {
        return new SendDefinitionList();
    }

    /**
     * Create an instance of {@link EmailSendDefinition }
     * 
     * @return
     *     the new instance of {@link EmailSendDefinition }
     */
    public EmailSendDefinition createEmailSendDefinition() {
        return new EmailSendDefinition();
    }

    /**
     * Create an instance of {@link Send }
     * 
     * @return
     *     the new instance of {@link Send }
     */
    public Send createSend() {
        return new Send();
    }

    /**
     * Create an instance of {@link Subscriber }
     * 
     * @return
     *     the new instance of {@link Subscriber }
     */
    public Subscriber createSubscriber() {
        return new Subscriber();
    }

    /**
     * Create an instance of {@link ExtractRequest }
     * 
     * @return
     *     the new instance of {@link ExtractRequest }
     */
    public ExtractRequest createExtractRequest() {
        return new ExtractRequest();
    }

    /**
     * Create an instance of {@link ContentValidation }
     * 
     * @return
     *     the new instance of {@link ContentValidation }
     */
    public ContentValidation createContentValidation() {
        return new ContentValidation();
    }

    /**
     * Create an instance of {@link ObjectDefinition }
     * 
     * @return
     *     the new instance of {@link ObjectDefinition }
     */
    public ObjectDefinition createObjectDefinition() {
        return new ObjectDefinition();
    }

    /**
     * Create an instance of {@link RetrieveRequest }
     * 
     * @return
     *     the new instance of {@link RetrieveRequest }
     */
    public RetrieveRequest createRetrieveRequest() {
        return new RetrieveRequest();
    }

    /**
     * Create an instance of {@link CreateRequest }
     * 
     * @return
     *     the new instance of {@link CreateRequest }
     */
    public CreateRequest createCreateRequest() {
        return new CreateRequest();
    }

    /**
     * Create an instance of {@link CreateOptions }
     * 
     * @return
     *     the new instance of {@link CreateOptions }
     */
    public CreateOptions createCreateOptions() {
        return new CreateOptions();
    }

    /**
     * Create an instance of {@link APIObject }
     * 
     * @return
     *     the new instance of {@link APIObject }
     */
    public APIObject createAPIObject() {
        return new APIObject();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     * @return
     *     the new instance of {@link CreateResponse }
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link CreateResult }
     * 
     * @return
     *     the new instance of {@link CreateResult }
     */
    public CreateResult createCreateResult() {
        return new CreateResult();
    }

    /**
     * Create an instance of {@link UpdateOptions }
     * 
     * @return
     *     the new instance of {@link UpdateOptions }
     */
    public UpdateOptions createUpdateOptions() {
        return new UpdateOptions();
    }

    /**
     * Create an instance of {@link UpdateRequest }
     * 
     * @return
     *     the new instance of {@link UpdateRequest }
     */
    public UpdateRequest createUpdateRequest() {
        return new UpdateRequest();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     * @return
     *     the new instance of {@link UpdateResponse }
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link UpdateResult }
     * 
     * @return
     *     the new instance of {@link UpdateResult }
     */
    public UpdateResult createUpdateResult() {
        return new UpdateResult();
    }

    /**
     * Create an instance of {@link DeleteOptions }
     * 
     * @return
     *     the new instance of {@link DeleteOptions }
     */
    public DeleteOptions createDeleteOptions() {
        return new DeleteOptions();
    }

    /**
     * Create an instance of {@link DeleteRequest }
     * 
     * @return
     *     the new instance of {@link DeleteRequest }
     */
    public DeleteRequest createDeleteRequest() {
        return new DeleteRequest();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     * @return
     *     the new instance of {@link DeleteResponse }
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link DeleteResult }
     * 
     * @return
     *     the new instance of {@link DeleteResult }
     */
    public DeleteResult createDeleteResult() {
        return new DeleteResult();
    }

    /**
     * Create an instance of {@link RetrieveRequestMsg }
     * 
     * @return
     *     the new instance of {@link RetrieveRequestMsg }
     */
    public RetrieveRequestMsg createRetrieveRequestMsg() {
        return new RetrieveRequestMsg();
    }

    /**
     * Create an instance of {@link RetrieveResponseMsg }
     * 
     * @return
     *     the new instance of {@link RetrieveResponseMsg }
     */
    public RetrieveResponseMsg createRetrieveResponseMsg() {
        return new RetrieveResponseMsg();
    }

    /**
     * Create an instance of {@link QueryRequestMsg }
     * 
     * @return
     *     the new instance of {@link QueryRequestMsg }
     */
    public QueryRequestMsg createQueryRequestMsg() {
        return new QueryRequestMsg();
    }

    /**
     * Create an instance of {@link QueryRequest }
     * 
     * @return
     *     the new instance of {@link QueryRequest }
     */
    public QueryRequest createQueryRequest() {
        return new QueryRequest();
    }

    /**
     * Create an instance of {@link QueryResponseMsg }
     * 
     * @return
     *     the new instance of {@link QueryResponseMsg }
     */
    public QueryResponseMsg createQueryResponseMsg() {
        return new QueryResponseMsg();
    }

    /**
     * Create an instance of {@link DefinitionRequestMsg }
     * 
     * @return
     *     the new instance of {@link DefinitionRequestMsg }
     */
    public DefinitionRequestMsg createDefinitionRequestMsg() {
        return new DefinitionRequestMsg();
    }

    /**
     * Create an instance of {@link ArrayOfObjectDefinitionRequest }
     * 
     * @return
     *     the new instance of {@link ArrayOfObjectDefinitionRequest }
     */
    public ArrayOfObjectDefinitionRequest createArrayOfObjectDefinitionRequest() {
        return new ArrayOfObjectDefinitionRequest();
    }

    /**
     * Create an instance of {@link DefinitionResponseMsg }
     * 
     * @return
     *     the new instance of {@link DefinitionResponseMsg }
     */
    public DefinitionResponseMsg createDefinitionResponseMsg() {
        return new DefinitionResponseMsg();
    }

    /**
     * Create an instance of {@link ExecuteRequestMsg }
     * 
     * @return
     *     the new instance of {@link ExecuteRequestMsg }
     */
    public ExecuteRequestMsg createExecuteRequestMsg() {
        return new ExecuteRequestMsg();
    }

    /**
     * Create an instance of {@link ExecuteRequest }
     * 
     * @return
     *     the new instance of {@link ExecuteRequest }
     */
    public ExecuteRequest createExecuteRequest() {
        return new ExecuteRequest();
    }

    /**
     * Create an instance of {@link ExecuteResponseMsg }
     * 
     * @return
     *     the new instance of {@link ExecuteResponseMsg }
     */
    public ExecuteResponseMsg createExecuteResponseMsg() {
        return new ExecuteResponseMsg();
    }

    /**
     * Create an instance of {@link ExecuteResponse }
     * 
     * @return
     *     the new instance of {@link ExecuteResponse }
     */
    public ExecuteResponse createExecuteResponse() {
        return new ExecuteResponse();
    }

    /**
     * Create an instance of {@link PerformOptions }
     * 
     * @return
     *     the new instance of {@link PerformOptions }
     */
    public PerformOptions createPerformOptions() {
        return new PerformOptions();
    }

    /**
     * Create an instance of {@link PerformRequestMsg.Definitions }
     * 
     * @return
     *     the new instance of {@link PerformRequestMsg.Definitions }
     */
    public PerformRequestMsg.Definitions createPerformRequestMsgDefinitions() {
        return new PerformRequestMsg.Definitions();
    }

    /**
     * Create an instance of {@link PerformResponseMsg.Results }
     * 
     * @return
     *     the new instance of {@link PerformResponseMsg.Results }
     */
    public PerformResponseMsg.Results createPerformResponseMsgResults() {
        return new PerformResponseMsg.Results();
    }

    /**
     * Create an instance of {@link ConfigureOptions }
     * 
     * @return
     *     the new instance of {@link ConfigureOptions }
     */
    public ConfigureOptions createConfigureOptions() {
        return new ConfigureOptions();
    }

    /**
     * Create an instance of {@link ConfigureRequestMsg.Configurations }
     * 
     * @return
     *     the new instance of {@link ConfigureRequestMsg.Configurations }
     */
    public ConfigureRequestMsg.Configurations createConfigureRequestMsgConfigurations() {
        return new ConfigureRequestMsg.Configurations();
    }

    /**
     * Create an instance of {@link ConfigureResponseMsg.Results }
     * 
     * @return
     *     the new instance of {@link ConfigureResponseMsg.Results }
     */
    public ConfigureResponseMsg.Results createConfigureResponseMsgResults() {
        return new ConfigureResponseMsg.Results();
    }

    /**
     * Create an instance of {@link ScheduleOptions }
     * 
     * @return
     *     the new instance of {@link ScheduleOptions }
     */
    public ScheduleOptions createScheduleOptions() {
        return new ScheduleOptions();
    }

    /**
     * Create an instance of {@link ScheduleDefinition }
     * 
     * @return
     *     the new instance of {@link ScheduleDefinition }
     */
    public ScheduleDefinition createScheduleDefinition() {
        return new ScheduleDefinition();
    }

    /**
     * Create an instance of {@link ScheduleRequestMsg.Interactions }
     * 
     * @return
     *     the new instance of {@link ScheduleRequestMsg.Interactions }
     */
    public ScheduleRequestMsg.Interactions createScheduleRequestMsgInteractions() {
        return new ScheduleRequestMsg.Interactions();
    }

    /**
     * Create an instance of {@link ScheduleResponseMsg.Results }
     * 
     * @return
     *     the new instance of {@link ScheduleResponseMsg.Results }
     */
    public ScheduleResponseMsg.Results createScheduleResponseMsgResults() {
        return new ScheduleResponseMsg.Results();
    }

    /**
     * Create an instance of {@link MinutelyRecurrence }
     * 
     * @return
     *     the new instance of {@link MinutelyRecurrence }
     */
    public MinutelyRecurrence createMinutelyRecurrence() {
        return new MinutelyRecurrence();
    }

    /**
     * Create an instance of {@link HourlyRecurrence }
     * 
     * @return
     *     the new instance of {@link HourlyRecurrence }
     */
    public HourlyRecurrence createHourlyRecurrence() {
        return new HourlyRecurrence();
    }

    /**
     * Create an instance of {@link DailyRecurrence }
     * 
     * @return
     *     the new instance of {@link DailyRecurrence }
     */
    public DailyRecurrence createDailyRecurrence() {
        return new DailyRecurrence();
    }

    /**
     * Create an instance of {@link WeeklyRecurrence }
     * 
     * @return
     *     the new instance of {@link WeeklyRecurrence }
     */
    public WeeklyRecurrence createWeeklyRecurrence() {
        return new WeeklyRecurrence();
    }

    /**
     * Create an instance of {@link MonthlyRecurrence }
     * 
     * @return
     *     the new instance of {@link MonthlyRecurrence }
     */
    public MonthlyRecurrence createMonthlyRecurrence() {
        return new MonthlyRecurrence();
    }

    /**
     * Create an instance of {@link YearlyRecurrence }
     * 
     * @return
     *     the new instance of {@link YearlyRecurrence }
     */
    public YearlyRecurrence createYearlyRecurrence() {
        return new YearlyRecurrence();
    }

    /**
     * Create an instance of {@link ExtractRequestMsg }
     * 
     * @return
     *     the new instance of {@link ExtractRequestMsg }
     */
    public ExtractRequestMsg createExtractRequestMsg() {
        return new ExtractRequestMsg();
    }

    /**
     * Create an instance of {@link ExtractResponseMsg.Results }
     * 
     * @return
     *     the new instance of {@link ExtractResponseMsg.Results }
     */
    public ExtractResponseMsg.Results createExtractResponseMsgResults() {
        return new ExtractResponseMsg.Results();
    }

    /**
     * Create an instance of {@link VersionInfoRequestMsg }
     * 
     * @return
     *     the new instance of {@link VersionInfoRequestMsg }
     */
    public VersionInfoRequestMsg createVersionInfoRequestMsg() {
        return new VersionInfoRequestMsg();
    }

    /**
     * Create an instance of {@link VersionInfoResponseMsg }
     * 
     * @return
     *     the new instance of {@link VersionInfoResponseMsg }
     */
    public VersionInfoResponseMsg createVersionInfoResponseMsg() {
        return new VersionInfoResponseMsg();
    }

    /**
     * Create an instance of {@link VersionInfoResponse }
     * 
     * @return
     *     the new instance of {@link VersionInfoResponse }
     */
    public VersionInfoResponse createVersionInfoResponse() {
        return new VersionInfoResponse();
    }

    /**
     * Create an instance of {@link SubscriberList }
     * 
     * @return
     *     the new instance of {@link SubscriberList }
     */
    public SubscriberList createSubscriberList() {
        return new SubscriberList();
    }

    /**
     * Create an instance of {@link List }
     * 
     * @return
     *     the new instance of {@link List }
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link Group }
     * 
     * @return
     *     the new instance of {@link Group }
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link ListAttribute }
     * 
     * @return
     *     the new instance of {@link ListAttribute }
     */
    public ListAttribute createListAttribute() {
        return new ListAttribute();
    }

    /**
     * Create an instance of {@link ListAttributeRestrictedValue }
     * 
     * @return
     *     the new instance of {@link ListAttributeRestrictedValue }
     */
    public ListAttributeRestrictedValue createListAttributeRestrictedValue() {
        return new ListAttributeRestrictedValue();
    }

    /**
     * Create an instance of {@link Campaign }
     * 
     * @return
     *     the new instance of {@link Campaign }
     */
    public Campaign createCampaign() {
        return new Campaign();
    }

    /**
     * Create an instance of {@link TriggeredSendDefinition }
     * 
     * @return
     *     the new instance of {@link TriggeredSendDefinition }
     */
    public TriggeredSendDefinition createTriggeredSendDefinition() {
        return new TriggeredSendDefinition();
    }

    /**
     * Create an instance of {@link TriggeredSendExclusionList }
     * 
     * @return
     *     the new instance of {@link TriggeredSendExclusionList }
     */
    public TriggeredSendExclusionList createTriggeredSendExclusionList() {
        return new TriggeredSendExclusionList();
    }

    /**
     * Create an instance of {@link TriggeredSend }
     * 
     * @return
     *     the new instance of {@link TriggeredSend }
     */
    public TriggeredSend createTriggeredSend() {
        return new TriggeredSend();
    }

    /**
     * Create an instance of {@link TriggeredSendCreateResult }
     * 
     * @return
     *     the new instance of {@link TriggeredSendCreateResult }
     */
    public TriggeredSendCreateResult createTriggeredSendCreateResult() {
        return new TriggeredSendCreateResult();
    }

    /**
     * Create an instance of {@link SubscriberResult }
     * 
     * @return
     *     the new instance of {@link SubscriberResult }
     */
    public SubscriberResult createSubscriberResult() {
        return new SubscriberResult();
    }

    /**
     * Create an instance of {@link SenderProfile }
     * 
     * @return
     *     the new instance of {@link SenderProfile }
     */
    public SenderProfile createSenderProfile() {
        return new SenderProfile();
    }

    /**
     * Create an instance of {@link DeliveryProfile }
     * 
     * @return
     *     the new instance of {@link DeliveryProfile }
     */
    public DeliveryProfile createDeliveryProfile() {
        return new DeliveryProfile();
    }

    /**
     * Create an instance of {@link PrivateDomain }
     * 
     * @return
     *     the new instance of {@link PrivateDomain }
     */
    public PrivateDomain createPrivateDomain() {
        return new PrivateDomain();
    }

    /**
     * Create an instance of {@link PrivateDomainSet }
     * 
     * @return
     *     the new instance of {@link PrivateDomainSet }
     */
    public PrivateDomainSet createPrivateDomainSet() {
        return new PrivateDomainSet();
    }

    /**
     * Create an instance of {@link PrivateIP }
     * 
     * @return
     *     the new instance of {@link PrivateIP }
     */
    public PrivateIP createPrivateIP() {
        return new PrivateIP();
    }

    /**
     * Create an instance of {@link SendDefinition }
     * 
     * @return
     *     the new instance of {@link SendDefinition }
     */
    public SendDefinition createSendDefinition() {
        return new SendDefinition();
    }

    /**
     * Create an instance of {@link AudienceItem }
     * 
     * @return
     *     the new instance of {@link AudienceItem }
     */
    public AudienceItem createAudienceItem() {
        return new AudienceItem();
    }

    /**
     * Create an instance of {@link DeprecatedEmailSendDefinition }
     * 
     * @return
     *     the new instance of {@link DeprecatedEmailSendDefinition }
     */
    public DeprecatedEmailSendDefinition createDeprecatedEmailSendDefinition() {
        return new DeprecatedEmailSendDefinition();
    }

    /**
     * Create an instance of {@link SystemStatusRequestMsg }
     * 
     * @return
     *     the new instance of {@link SystemStatusRequestMsg }
     */
    public SystemStatusRequestMsg createSystemStatusRequestMsg() {
        return new SystemStatusRequestMsg();
    }

    /**
     * Create an instance of {@link SystemStatusOptions }
     * 
     * @return
     *     the new instance of {@link SystemStatusOptions }
     */
    public SystemStatusOptions createSystemStatusOptions() {
        return new SystemStatusOptions();
    }

    /**
     * Create an instance of {@link SystemStatusResponseMsg.Results }
     * 
     * @return
     *     the new instance of {@link SystemStatusResponseMsg.Results }
     */
    public SystemStatusResponseMsg.Results createSystemStatusResponseMsgResults() {
        return new SystemStatusResponseMsg.Results();
    }

    /**
     * Create an instance of {@link ClientID }
     * 
     * @return
     *     the new instance of {@link ClientID }
     */
    public ClientID createClientID() {
        return new ClientID();
    }

    /**
     * Create an instance of {@link APIProperty }
     * 
     * @return
     *     the new instance of {@link APIProperty }
     */
    public APIProperty createAPIProperty() {
        return new APIProperty();
    }

    /**
     * Create an instance of {@link NullAPIProperty }
     * 
     * @return
     *     the new instance of {@link NullAPIProperty }
     */
    public NullAPIProperty createNullAPIProperty() {
        return new NullAPIProperty();
    }

    /**
     * Create an instance of {@link DataFolder }
     * 
     * @return
     *     the new instance of {@link DataFolder }
     */
    public DataFolder createDataFolder() {
        return new DataFolder();
    }

    /**
     * Create an instance of {@link Owner }
     * 
     * @return
     *     the new instance of {@link Owner }
     */
    public Owner createOwner() {
        return new Owner();
    }

    /**
     * Create an instance of {@link AsyncResponse }
     * 
     * @return
     *     the new instance of {@link AsyncResponse }
     */
    public AsyncResponse createAsyncResponse() {
        return new AsyncResponse();
    }

    /**
     * Create an instance of {@link ContainerID }
     * 
     * @return
     *     the new instance of {@link ContainerID }
     */
    public ContainerID createContainerID() {
        return new ContainerID();
    }

    /**
     * Create an instance of {@link Result }
     * 
     * @return
     *     the new instance of {@link Result }
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link ResultMessage }
     * 
     * @return
     *     the new instance of {@link ResultMessage }
     */
    public ResultMessage createResultMessage() {
        return new ResultMessage();
    }

    /**
     * Create an instance of {@link ResultItem }
     * 
     * @return
     *     the new instance of {@link ResultItem }
     */
    public ResultItem createResultItem() {
        return new ResultItem();
    }

    /**
     * Create an instance of {@link TaskResult }
     * 
     * @return
     *     the new instance of {@link TaskResult }
     */
    public TaskResult createTaskResult() {
        return new TaskResult();
    }

    /**
     * Create an instance of {@link SaveOption }
     * 
     * @return
     *     the new instance of {@link SaveOption }
     */
    public SaveOption createSaveOption() {
        return new SaveOption();
    }

    /**
     * Create an instance of {@link RetrieveSingleRequest }
     * 
     * @return
     *     the new instance of {@link RetrieveSingleRequest }
     */
    public RetrieveSingleRequest createRetrieveSingleRequest() {
        return new RetrieveSingleRequest();
    }

    /**
     * Create an instance of {@link com.t1a.sfmc.activity.beans.sfmc.model.soap.Parameters }
     * 
     * @return
     *     the new instance of {@link com.t1a.sfmc.activity.beans.sfmc.model.soap.Parameters }
     */
    public com.t1a.sfmc.activity.beans.sfmc.model.soap.Parameters createParameters() {
        return new com.t1a.sfmc.activity.beans.sfmc.model.soap.Parameters();
    }

    /**
     * Create an instance of {@link RetrieveSingleOptions }
     * 
     * @return
     *     the new instance of {@link RetrieveSingleOptions }
     */
    public RetrieveSingleOptions createRetrieveSingleOptions() {
        return new RetrieveSingleOptions();
    }

    /**
     * Create an instance of {@link RetrieveOptions }
     * 
     * @return
     *     the new instance of {@link RetrieveOptions }
     */
    public RetrieveOptions createRetrieveOptions() {
        return new RetrieveOptions();
    }

    /**
     * Create an instance of {@link QueryObject }
     * 
     * @return
     *     the new instance of {@link QueryObject }
     */
    public QueryObject createQueryObject() {
        return new QueryObject();
    }

    /**
     * Create an instance of {@link Query }
     * 
     * @return
     *     the new instance of {@link Query }
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link FilterPart }
     * 
     * @return
     *     the new instance of {@link FilterPart }
     */
    public FilterPart createFilterPart() {
        return new FilterPart();
    }

    /**
     * Create an instance of {@link SimpleFilterPart }
     * 
     * @return
     *     the new instance of {@link SimpleFilterPart }
     */
    public SimpleFilterPart createSimpleFilterPart() {
        return new SimpleFilterPart();
    }

    /**
     * Create an instance of {@link ObjectDefinitionRequest }
     * 
     * @return
     *     the new instance of {@link ObjectDefinitionRequest }
     */
    public ObjectDefinitionRequest createObjectDefinitionRequest() {
        return new ObjectDefinitionRequest();
    }

    /**
     * Create an instance of {@link AttributeMap }
     * 
     * @return
     *     the new instance of {@link AttributeMap }
     */
    public AttributeMap createAttributeMap() {
        return new AttributeMap();
    }

    /**
     * Create an instance of {@link PicklistItem }
     * 
     * @return
     *     the new instance of {@link PicklistItem }
     */
    public PicklistItem createPicklistItem() {
        return new PicklistItem();
    }

    /**
     * Create an instance of {@link InteractionDefinition }
     * 
     * @return
     *     the new instance of {@link InteractionDefinition }
     */
    public InteractionDefinition createInteractionDefinition() {
        return new InteractionDefinition();
    }

    /**
     * Create an instance of {@link InteractionBaseObject }
     * 
     * @return
     *     the new instance of {@link InteractionBaseObject }
     */
    public InteractionBaseObject createInteractionBaseObject() {
        return new InteractionBaseObject();
    }

    /**
     * Create an instance of {@link CampaignPerformOptions }
     * 
     * @return
     *     the new instance of {@link CampaignPerformOptions }
     */
    public CampaignPerformOptions createCampaignPerformOptions() {
        return new CampaignPerformOptions();
    }

    /**
     * Create an instance of {@link PerformResult }
     * 
     * @return
     *     the new instance of {@link PerformResult }
     */
    public PerformResult createPerformResult() {
        return new PerformResult();
    }

    /**
     * Create an instance of {@link SpamAssassinValidation }
     * 
     * @return
     *     the new instance of {@link SpamAssassinValidation }
     */
    public SpamAssassinValidation createSpamAssassinValidation() {
        return new SpamAssassinValidation();
    }

    /**
     * Create an instance of {@link ContentValidationResult }
     * 
     * @return
     *     the new instance of {@link ContentValidationResult }
     */
    public ContentValidationResult createContentValidationResult() {
        return new ContentValidationResult();
    }

    /**
     * Create an instance of {@link ValidationResult }
     * 
     * @return
     *     the new instance of {@link ValidationResult }
     */
    public ValidationResult createValidationResult() {
        return new ValidationResult();
    }

    /**
     * Create an instance of {@link ConfigureResult }
     * 
     * @return
     *     the new instance of {@link ConfigureResult }
     */
    public ConfigureResult createConfigureResult() {
        return new ConfigureResult();
    }

    /**
     * Create an instance of {@link ScheduleResult }
     * 
     * @return
     *     the new instance of {@link ScheduleResult }
     */
    public ScheduleResult createScheduleResult() {
        return new ScheduleResult();
    }

    /**
     * Create an instance of {@link ExtractResult }
     * 
     * @return
     *     the new instance of {@link ExtractResult }
     */
    public ExtractResult createExtractResult() {
        return new ExtractResult();
    }

    /**
     * Create an instance of {@link ExtractOptions }
     * 
     * @return
     *     the new instance of {@link ExtractOptions }
     */
    public ExtractOptions createExtractOptions() {
        return new ExtractOptions();
    }

    /**
     * Create an instance of {@link ExtractParameter }
     * 
     * @return
     *     the new instance of {@link ExtractParameter }
     */
    public ExtractParameter createExtractParameter() {
        return new ExtractParameter();
    }

    /**
     * Create an instance of {@link ExtractTemplate }
     * 
     * @return
     *     the new instance of {@link ExtractTemplate }
     */
    public ExtractTemplate createExtractTemplate() {
        return new ExtractTemplate();
    }

    /**
     * Create an instance of {@link ParameterDescription }
     * 
     * @return
     *     the new instance of {@link ParameterDescription }
     */
    public ParameterDescription createParameterDescription() {
        return new ParameterDescription();
    }

    /**
     * Create an instance of {@link ExtractParameterDescription }
     * 
     * @return
     *     the new instance of {@link ExtractParameterDescription }
     */
    public ExtractParameterDescription createExtractParameterDescription() {
        return new ExtractParameterDescription();
    }

    /**
     * Create an instance of {@link Locale }
     * 
     * @return
     *     the new instance of {@link Locale }
     */
    public Locale createLocale() {
        return new Locale();
    }

    /**
     * Create an instance of {@link TimeZone }
     * 
     * @return
     *     the new instance of {@link TimeZone }
     */
    public TimeZone createTimeZone() {
        return new TimeZone();
    }

    /**
     * Create an instance of {@link BusinessUnit }
     * 
     * @return
     *     the new instance of {@link BusinessUnit }
     */
    public BusinessUnit createBusinessUnit() {
        return new BusinessUnit();
    }

    /**
     * Create an instance of {@link LandingPage }
     * 
     * @return
     *     the new instance of {@link LandingPage }
     */
    public LandingPage createLandingPage() {
        return new LandingPage();
    }

    /**
     * Create an instance of {@link AccountDataItem }
     * 
     * @return
     *     the new instance of {@link AccountDataItem }
     */
    public AccountDataItem createAccountDataItem() {
        return new AccountDataItem();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     * @return
     *     the new instance of {@link Subscription }
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link PrivateLabel }
     * 
     * @return
     *     the new instance of {@link PrivateLabel }
     */
    public PrivateLabel createPrivateLabel() {
        return new PrivateLabel();
    }

    /**
     * Create an instance of {@link AccountPrivateLabel }
     * 
     * @return
     *     the new instance of {@link AccountPrivateLabel }
     */
    public AccountPrivateLabel createAccountPrivateLabel() {
        return new AccountPrivateLabel();
    }

    /**
     * Create an instance of {@link BusinessRule }
     * 
     * @return
     *     the new instance of {@link BusinessRule }
     */
    public BusinessRule createBusinessRule() {
        return new BusinessRule();
    }

    /**
     * Create an instance of {@link SsoIdentity }
     * 
     * @return
     *     the new instance of {@link SsoIdentity }
     */
    public SsoIdentity createSsoIdentity() {
        return new SsoIdentity();
    }

    /**
     * Create an instance of {@link UserAccess }
     * 
     * @return
     *     the new instance of {@link UserAccess }
     */
    public UserAccess createUserAccess() {
        return new UserAccess();
    }

    /**
     * Create an instance of {@link Brand }
     * 
     * @return
     *     the new instance of {@link Brand }
     */
    public Brand createBrand() {
        return new Brand();
    }

    /**
     * Create an instance of {@link BrandTag }
     * 
     * @return
     *     the new instance of {@link BrandTag }
     */
    public BrandTag createBrandTag() {
        return new BrandTag();
    }

    /**
     * Create an instance of {@link Permission }
     * 
     * @return
     *     the new instance of {@link Permission }
     */
    public Permission createPermission() {
        return new Permission();
    }

    /**
     * Create an instance of {@link Email }
     * 
     * @return
     *     the new instance of {@link Email }
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link ContentArea }
     * 
     * @return
     *     the new instance of {@link ContentArea }
     */
    public ContentArea createContentArea() {
        return new ContentArea();
    }

    /**
     * Create an instance of {@link Message }
     * 
     * @return
     *     the new instance of {@link Message }
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link TrackingEvent }
     * 
     * @return
     *     the new instance of {@link TrackingEvent }
     */
    public TrackingEvent createTrackingEvent() {
        return new TrackingEvent();
    }

    /**
     * Create an instance of {@link OpenEvent }
     * 
     * @return
     *     the new instance of {@link OpenEvent }
     */
    public OpenEvent createOpenEvent() {
        return new OpenEvent();
    }

    /**
     * Create an instance of {@link BounceEvent }
     * 
     * @return
     *     the new instance of {@link BounceEvent }
     */
    public BounceEvent createBounceEvent() {
        return new BounceEvent();
    }

    /**
     * Create an instance of {@link UnsubEvent }
     * 
     * @return
     *     the new instance of {@link UnsubEvent }
     */
    public UnsubEvent createUnsubEvent() {
        return new UnsubEvent();
    }

    /**
     * Create an instance of {@link ClickEvent }
     * 
     * @return
     *     the new instance of {@link ClickEvent }
     */
    public ClickEvent createClickEvent() {
        return new ClickEvent();
    }

    /**
     * Create an instance of {@link SentEvent }
     * 
     * @return
     *     the new instance of {@link SentEvent }
     */
    public SentEvent createSentEvent() {
        return new SentEvent();
    }

    /**
     * Create an instance of {@link NotSentEvent }
     * 
     * @return
     *     the new instance of {@link NotSentEvent }
     */
    public NotSentEvent createNotSentEvent() {
        return new NotSentEvent();
    }

    /**
     * Create an instance of {@link SurveyEvent }
     * 
     * @return
     *     the new instance of {@link SurveyEvent }
     */
    public SurveyEvent createSurveyEvent() {
        return new SurveyEvent();
    }

    /**
     * Create an instance of {@link ForwardedEmailEvent }
     * 
     * @return
     *     the new instance of {@link ForwardedEmailEvent }
     */
    public ForwardedEmailEvent createForwardedEmailEvent() {
        return new ForwardedEmailEvent();
    }

    /**
     * Create an instance of {@link ForwardedEmailOptInEvent }
     * 
     * @return
     *     the new instance of {@link ForwardedEmailOptInEvent }
     */
    public ForwardedEmailOptInEvent createForwardedEmailOptInEvent() {
        return new ForwardedEmailOptInEvent();
    }

    /**
     * Create an instance of {@link DeliveredEvent }
     * 
     * @return
     *     the new instance of {@link DeliveredEvent }
     */
    public DeliveredEvent createDeliveredEvent() {
        return new DeliveredEvent();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     * @return
     *     the new instance of {@link Attribute }
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link CompressionConfiguration }
     * 
     * @return
     *     the new instance of {@link CompressionConfiguration }
     */
    public CompressionConfiguration createCompressionConfiguration() {
        return new CompressionConfiguration();
    }

    /**
     * Create an instance of {@link SubscriberTypeDefinition }
     * 
     * @return
     *     the new instance of {@link SubscriberTypeDefinition }
     */
    public SubscriberTypeDefinition createSubscriberTypeDefinition() {
        return new SubscriberTypeDefinition();
    }

    /**
     * Create an instance of {@link ListSubscriber }
     * 
     * @return
     *     the new instance of {@link ListSubscriber }
     */
    public ListSubscriber createListSubscriber() {
        return new ListSubscriber();
    }

    /**
     * Create an instance of {@link GlobalUnsubscribeCategory }
     * 
     * @return
     *     the new instance of {@link GlobalUnsubscribeCategory }
     */
    public GlobalUnsubscribeCategory createGlobalUnsubscribeCategory() {
        return new GlobalUnsubscribeCategory();
    }

    /**
     * Create an instance of {@link Link }
     * 
     * @return
     *     the new instance of {@link Link }
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link SendSummary }
     * 
     * @return
     *     the new instance of {@link SendSummary }
     */
    public SendSummary createSendSummary() {
        return new SendSummary();
    }

    /**
     * Create an instance of {@link SubscriberSendResult }
     * 
     * @return
     *     the new instance of {@link SubscriberSendResult }
     */
    public SubscriberSendResult createSubscriberSendResult() {
        return new SubscriberSendResult();
    }

    /**
     * Create an instance of {@link TriggeredSendSummary }
     * 
     * @return
     *     the new instance of {@link TriggeredSendSummary }
     */
    public TriggeredSendSummary createTriggeredSendSummary() {
        return new TriggeredSendSummary();
    }

    /**
     * Create an instance of {@link AsyncRequestResult }
     * 
     * @return
     *     the new instance of {@link AsyncRequestResult }
     */
    public AsyncRequestResult createAsyncRequestResult() {
        return new AsyncRequestResult();
    }

    /**
     * Create an instance of {@link VoiceTriggeredSend }
     * 
     * @return
     *     the new instance of {@link VoiceTriggeredSend }
     */
    public VoiceTriggeredSend createVoiceTriggeredSend() {
        return new VoiceTriggeredSend();
    }

    /**
     * Create an instance of {@link VoiceTriggeredSendDefinition }
     * 
     * @return
     *     the new instance of {@link VoiceTriggeredSendDefinition }
     */
    public VoiceTriggeredSendDefinition createVoiceTriggeredSendDefinition() {
        return new VoiceTriggeredSendDefinition();
    }

    /**
     * Create an instance of {@link SMSTriggeredSend }
     * 
     * @return
     *     the new instance of {@link SMSTriggeredSend }
     */
    public SMSTriggeredSend createSMSTriggeredSend() {
        return new SMSTriggeredSend();
    }

    /**
     * Create an instance of {@link SMSTriggeredSendDefinition }
     * 
     * @return
     *     the new instance of {@link SMSTriggeredSendDefinition }
     */
    public SMSTriggeredSendDefinition createSMSTriggeredSendDefinition() {
        return new SMSTriggeredSendDefinition();
    }

    /**
     * Create an instance of {@link SendClassification }
     * 
     * @return
     *     the new instance of {@link SendClassification }
     */
    public SendClassification createSendClassification() {
        return new SendClassification();
    }

    /**
     * Create an instance of {@link TrackingUser }
     * 
     * @return
     *     the new instance of {@link TrackingUser }
     */
    public TrackingUser createTrackingUser() {
        return new TrackingUser();
    }

    /**
     * Create an instance of {@link MessagingVendorKind }
     * 
     * @return
     *     the new instance of {@link MessagingVendorKind }
     */
    public MessagingVendorKind createMessagingVendorKind() {
        return new MessagingVendorKind();
    }

    /**
     * Create an instance of {@link SMSMTEvent }
     * 
     * @return
     *     the new instance of {@link SMSMTEvent }
     */
    public SMSMTEvent createSMSMTEvent() {
        return new SMSMTEvent();
    }

    /**
     * Create an instance of {@link SMSMOEvent }
     * 
     * @return
     *     the new instance of {@link SMSMOEvent }
     */
    public SMSMOEvent createSMSMOEvent() {
        return new SMSMOEvent();
    }

    /**
     * Create an instance of {@link BaseMOKeyword }
     * 
     * @return
     *     the new instance of {@link BaseMOKeyword }
     */
    public BaseMOKeyword createBaseMOKeyword() {
        return new BaseMOKeyword();
    }

    /**
     * Create an instance of {@link SendSMSMOKeyword }
     * 
     * @return
     *     the new instance of {@link SendSMSMOKeyword }
     */
    public SendSMSMOKeyword createSendSMSMOKeyword() {
        return new SendSMSMOKeyword();
    }

    /**
     * Create an instance of {@link UnsubscribeFromSMSPublicationMOKeyword }
     * 
     * @return
     *     the new instance of {@link UnsubscribeFromSMSPublicationMOKeyword }
     */
    public UnsubscribeFromSMSPublicationMOKeyword createUnsubscribeFromSMSPublicationMOKeyword() {
        return new UnsubscribeFromSMSPublicationMOKeyword();
    }

    /**
     * Create an instance of {@link HelpMOKeyword }
     * 
     * @return
     *     the new instance of {@link HelpMOKeyword }
     */
    public HelpMOKeyword createHelpMOKeyword() {
        return new HelpMOKeyword();
    }

    /**
     * Create an instance of {@link SendEmailMOKeyword }
     * 
     * @return
     *     the new instance of {@link SendEmailMOKeyword }
     */
    public SendEmailMOKeyword createSendEmailMOKeyword() {
        return new SendEmailMOKeyword();
    }

    /**
     * Create an instance of {@link SMSSharedKeyword }
     * 
     * @return
     *     the new instance of {@link SMSSharedKeyword }
     */
    public SMSSharedKeyword createSMSSharedKeyword() {
        return new SMSSharedKeyword();
    }

    /**
     * Create an instance of {@link UserMap }
     * 
     * @return
     *     the new instance of {@link UserMap }
     */
    public UserMap createUserMap() {
        return new UserMap();
    }

    /**
     * Create an instance of {@link Folder }
     * 
     * @return
     *     the new instance of {@link Folder }
     */
    public Folder createFolder() {
        return new Folder();
    }

    /**
     * Create an instance of {@link SalesforceSendActivity }
     * 
     * @return
     *     the new instance of {@link SalesforceSendActivity }
     */
    public SalesforceSendActivity createSalesforceSendActivity() {
        return new SalesforceSendActivity();
    }

    /**
     * Create an instance of {@link FileTransferLocation }
     * 
     * @return
     *     the new instance of {@link FileTransferLocation }
     */
    public FileTransferLocation createFileTransferLocation() {
        return new FileTransferLocation();
    }

    /**
     * Create an instance of {@link DataExtractActivity }
     * 
     * @return
     *     the new instance of {@link DataExtractActivity }
     */
    public DataExtractActivity createDataExtractActivity() {
        return new DataExtractActivity();
    }

    /**
     * Create an instance of {@link MessageSendActivity }
     * 
     * @return
     *     the new instance of {@link MessageSendActivity }
     */
    public MessageSendActivity createMessageSendActivity() {
        return new MessageSendActivity();
    }

    /**
     * Create an instance of {@link SmsSendActivity }
     * 
     * @return
     *     the new instance of {@link SmsSendActivity }
     */
    public SmsSendActivity createSmsSendActivity() {
        return new SmsSendActivity();
    }

    /**
     * Create an instance of {@link MobileConnectRefreshListActivity }
     * 
     * @return
     *     the new instance of {@link MobileConnectRefreshListActivity }
     */
    public MobileConnectRefreshListActivity createMobileConnectRefreshListActivity() {
        return new MobileConnectRefreshListActivity();
    }

    /**
     * Create an instance of {@link MobileConnectSendSmsActivity }
     * 
     * @return
     *     the new instance of {@link MobileConnectSendSmsActivity }
     */
    public MobileConnectSendSmsActivity createMobileConnectSendSmsActivity() {
        return new MobileConnectSendSmsActivity();
    }

    /**
     * Create an instance of {@link MobilePushSendMessageActivity }
     * 
     * @return
     *     the new instance of {@link MobilePushSendMessageActivity }
     */
    public MobilePushSendMessageActivity createMobilePushSendMessageActivity() {
        return new MobilePushSendMessageActivity();
    }

    /**
     * Create an instance of {@link ReportActivity }
     * 
     * @return
     *     the new instance of {@link ReportActivity }
     */
    public ReportActivity createReportActivity() {
        return new ReportActivity();
    }

    /**
     * Create an instance of {@link DataExtensionField }
     * 
     * @return
     *     the new instance of {@link DataExtensionField }
     */
    public DataExtensionField createDataExtensionField() {
        return new DataExtensionField();
    }

    /**
     * Create an instance of {@link DataExtensionTemplate }
     * 
     * @return
     *     the new instance of {@link DataExtensionTemplate }
     */
    public DataExtensionTemplate createDataExtensionTemplate() {
        return new DataExtensionTemplate();
    }

    /**
     * Create an instance of {@link DataExtensionError }
     * 
     * @return
     *     the new instance of {@link DataExtensionError }
     */
    public DataExtensionError createDataExtensionError() {
        return new DataExtensionError();
    }

    /**
     * Create an instance of {@link ImportDefinitionColumnBasedAction }
     * 
     * @return
     *     the new instance of {@link ImportDefinitionColumnBasedAction }
     */
    public ImportDefinitionColumnBasedAction createImportDefinitionColumnBasedAction() {
        return new ImportDefinitionColumnBasedAction();
    }

    /**
     * Create an instance of {@link FieldMap }
     * 
     * @return
     *     the new instance of {@link FieldMap }
     */
    public FieldMap createFieldMap() {
        return new FieldMap();
    }

    /**
     * Create an instance of {@link ImportDefinitionAutoGenerateDestination }
     * 
     * @return
     *     the new instance of {@link ImportDefinitionAutoGenerateDestination }
     */
    public ImportDefinitionAutoGenerateDestination createImportDefinitionAutoGenerateDestination() {
        return new ImportDefinitionAutoGenerateDestination();
    }

    /**
     * Create an instance of {@link ImportDefinitionFieldMap }
     * 
     * @return
     *     the new instance of {@link ImportDefinitionFieldMap }
     */
    public ImportDefinitionFieldMap createImportDefinitionFieldMap() {
        return new ImportDefinitionFieldMap();
    }

    /**
     * Create an instance of {@link ImportResultsSummary }
     * 
     * @return
     *     the new instance of {@link ImportResultsSummary }
     */
    public ImportResultsSummary createImportResultsSummary() {
        return new ImportResultsSummary();
    }

    /**
     * Create an instance of {@link FilterActivity }
     * 
     * @return
     *     the new instance of {@link FilterActivity }
     */
    public FilterActivity createFilterActivity() {
        return new FilterActivity();
    }

    /**
     * Create an instance of {@link FilterDefinition }
     * 
     * @return
     *     the new instance of {@link FilterDefinition }
     */
    public FilterDefinition createFilterDefinition() {
        return new FilterDefinition();
    }

    /**
     * Create an instance of {@link GroupDefinition }
     * 
     * @return
     *     the new instance of {@link GroupDefinition }
     */
    public GroupDefinition createGroupDefinition() {
        return new GroupDefinition();
    }

    /**
     * Create an instance of {@link GroupConnectActivity }
     * 
     * @return
     *     the new instance of {@link GroupConnectActivity }
     */
    public GroupConnectActivity createGroupConnectActivity() {
        return new GroupConnectActivity();
    }

    /**
     * Create an instance of {@link FileTransferActivity }
     * 
     * @return
     *     the new instance of {@link FileTransferActivity }
     */
    public FileTransferActivity createFileTransferActivity() {
        return new FileTransferActivity();
    }

    /**
     * Create an instance of {@link ListSend }
     * 
     * @return
     *     the new instance of {@link ListSend }
     */
    public ListSend createListSend() {
        return new ListSend();
    }

    /**
     * Create an instance of {@link LinkSend }
     * 
     * @return
     *     the new instance of {@link LinkSend }
     */
    public LinkSend createLinkSend() {
        return new LinkSend();
    }

    /**
     * Create an instance of {@link PublicKeyManagement }
     * 
     * @return
     *     the new instance of {@link PublicKeyManagement }
     */
    public PublicKeyManagement createPublicKeyManagement() {
        return new PublicKeyManagement();
    }

    /**
     * Create an instance of {@link SecurityObject }
     * 
     * @return
     *     the new instance of {@link SecurityObject }
     */
    public SecurityObject createSecurityObject() {
        return new SecurityObject();
    }

    /**
     * Create an instance of {@link Certificate }
     * 
     * @return
     *     the new instance of {@link Certificate }
     */
    public Certificate createCertificate() {
        return new Certificate();
    }

    /**
     * Create an instance of {@link SystemOutage }
     * 
     * @return
     *     the new instance of {@link SystemOutage }
     */
    public SystemOutage createSystemOutage() {
        return new SystemOutage();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     * @return
     *     the new instance of {@link Authentication }
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link UsernameAuthentication }
     * 
     * @return
     *     the new instance of {@link UsernameAuthentication }
     */
    public UsernameAuthentication createUsernameAuthentication() {
        return new UsernameAuthentication();
    }

    /**
     * Create an instance of {@link ResourceSpecification }
     * 
     * @return
     *     the new instance of {@link ResourceSpecification }
     */
    public ResourceSpecification createResourceSpecification() {
        return new ResourceSpecification();
    }

    /**
     * Create an instance of {@link Portfolio }
     * 
     * @return
     *     the new instance of {@link Portfolio }
     */
    public Portfolio createPortfolio() {
        return new Portfolio();
    }

    /**
     * Create an instance of {@link Template }
     * 
     * @return
     *     the new instance of {@link Template }
     */
    public Template createTemplate() {
        return new Template();
    }

    /**
     * Create an instance of {@link Layout }
     * 
     * @return
     *     the new instance of {@link Layout }
     */
    public Layout createLayout() {
        return new Layout();
    }

    /**
     * Create an instance of {@link QueryDefinition }
     * 
     * @return
     *     the new instance of {@link QueryDefinition }
     */
    public QueryDefinition createQueryDefinition() {
        return new QueryDefinition();
    }

    /**
     * Create an instance of {@link JsonWebKey }
     * 
     * @return
     *     the new instance of {@link JsonWebKey }
     */
    public JsonWebKey createJsonWebKey() {
        return new JsonWebKey();
    }

    /**
     * Create an instance of {@link DirectoryTenant }
     * 
     * @return
     *     the new instance of {@link DirectoryTenant }
     */
    public DirectoryTenant createDirectoryTenant() {
        return new DirectoryTenant();
    }

    /**
     * Create an instance of {@link AuditLogUserContext }
     * 
     * @return
     *     the new instance of {@link AuditLogUserContext }
     */
    public AuditLogUserContext createAuditLogUserContext() {
        return new AuditLogUserContext();
    }

    /**
     * Create an instance of {@link IntegrationProfile }
     * 
     * @return
     *     the new instance of {@link IntegrationProfile }
     */
    public IntegrationProfile createIntegrationProfile() {
        return new IntegrationProfile();
    }

    /**
     * Create an instance of {@link IntegrationProfileDefinition }
     * 
     * @return
     *     the new instance of {@link IntegrationProfileDefinition }
     */
    public IntegrationProfileDefinition createIntegrationProfileDefinition() {
        return new IntegrationProfileDefinition();
    }

    /**
     * Create an instance of {@link ReplyMailManagementConfiguration }
     * 
     * @return
     *     the new instance of {@link ReplyMailManagementConfiguration }
     */
    public ReplyMailManagementConfiguration createReplyMailManagementConfiguration() {
        return new ReplyMailManagementConfiguration();
    }

    /**
     * Create an instance of {@link FileTrigger }
     * 
     * @return
     *     the new instance of {@link FileTrigger }
     */
    public FileTrigger createFileTrigger() {
        return new FileTrigger();
    }

    /**
     * Create an instance of {@link FileTriggerTypeLastPull }
     * 
     * @return
     *     the new instance of {@link FileTriggerTypeLastPull }
     */
    public FileTriggerTypeLastPull createFileTriggerTypeLastPull() {
        return new FileTriggerTypeLastPull();
    }

    /**
     * Create an instance of {@link ProgramManifestTemplate }
     * 
     * @return
     *     the new instance of {@link ProgramManifestTemplate }
     */
    public ProgramManifestTemplate createProgramManifestTemplate() {
        return new ProgramManifestTemplate();
    }

    /**
     * Create an instance of {@link SMSAddress }
     * 
     * @return
     *     the new instance of {@link SMSAddress }
     */
    public SMSAddress createSMSAddress() {
        return new SMSAddress();
    }

    /**
     * Create an instance of {@link EmailAddress }
     * 
     * @return
     *     the new instance of {@link EmailAddress }
     */
    public EmailAddress createEmailAddress() {
        return new EmailAddress();
    }

    /**
     * Create an instance of {@link AddressStatus }
     * 
     * @return
     *     the new instance of {@link AddressStatus }
     */
    public AddressStatus createAddressStatus() {
        return new AddressStatus();
    }

    /**
     * Create an instance of {@link PublicationSubscriber }
     * 
     * @return
     *     the new instance of {@link PublicationSubscriber }
     */
    public PublicationSubscriber createPublicationSubscriber() {
        return new PublicationSubscriber();
    }

    /**
     * Create an instance of {@link AutomationSource }
     * 
     * @return
     *     the new instance of {@link AutomationSource }
     */
    public AutomationSource createAutomationSource() {
        return new AutomationSource();
    }

    /**
     * Create an instance of {@link AutomationNotification }
     * 
     * @return
     *     the new instance of {@link AutomationNotification }
     */
    public AutomationNotification createAutomationNotification() {
        return new AutomationNotification();
    }

    /**
     * Create an instance of {@link AutomationActivity }
     * 
     * @return
     *     the new instance of {@link AutomationActivity }
     */
    public AutomationActivity createAutomationActivity() {
        return new AutomationActivity();
    }

    /**
     * Create an instance of {@link AutomationActivityInstance }
     * 
     * @return
     *     the new instance of {@link AutomationActivityInstance }
     */
    public AutomationActivityInstance createAutomationActivityInstance() {
        return new AutomationActivityInstance();
    }

    /**
     * Create an instance of {@link AutomationChain }
     * 
     * @return
     *     the new instance of {@link AutomationChain }
     */
    public AutomationChain createAutomationChain() {
        return new AutomationChain();
    }

    /**
     * Create an instance of {@link PlatformApplication }
     * 
     * @return
     *     the new instance of {@link PlatformApplication }
     */
    public PlatformApplication createPlatformApplication() {
        return new PlatformApplication();
    }

    /**
     * Create an instance of {@link PlatformApplicationPackage }
     * 
     * @return
     *     the new instance of {@link PlatformApplicationPackage }
     */
    public PlatformApplicationPackage createPlatformApplicationPackage() {
        return new PlatformApplicationPackage();
    }

    /**
     * Create an instance of {@link SuppressionListContext }
     * 
     * @return
     *     the new instance of {@link SuppressionListContext }
     */
    public SuppressionListContext createSuppressionListContext() {
        return new SuppressionListContext();
    }

    /**
     * Create an instance of {@link SendAdditionalAttribute }
     * 
     * @return
     *     the new instance of {@link SendAdditionalAttribute }
     */
    public SendAdditionalAttribute createSendAdditionalAttribute() {
        return new SendAdditionalAttribute();
    }

    /**
     * Create an instance of {@link AttributeEntityV1 }
     * 
     * @return
     *     the new instance of {@link AttributeEntityV1 }
     */
    public AttributeEntityV1 createAttributeEntityV1() {
        return new AttributeEntityV1();
    }

    /**
     * Create an instance of {@link Thumbnail }
     * 
     * @return
     *     the new instance of {@link Thumbnail }
     */
    public Thumbnail createThumbnail() {
        return new Thumbnail();
    }

    /**
     * Create an instance of {@link NameIdReference }
     * 
     * @return
     *     the new instance of {@link NameIdReference }
     */
    public NameIdReference createNameIdReference() {
        return new NameIdReference();
    }

    /**
     * Create an instance of {@link CategoryNameIdReference }
     * 
     * @return
     *     the new instance of {@link CategoryNameIdReference }
     */
    public CategoryNameIdReference createCategoryNameIdReference() {
        return new CategoryNameIdReference();
    }

    /**
     * Create an instance of {@link UserBasicsEntity }
     * 
     * @return
     *     the new instance of {@link UserBasicsEntity }
     */
    public UserBasicsEntity createUserBasicsEntity() {
        return new UserBasicsEntity();
    }

    /**
     * Create an instance of {@link AssetAnyProperty }
     * 
     * @return
     *     the new instance of {@link AssetAnyProperty }
     */
    public AssetAnyProperty createAssetAnyProperty() {
        return new AssetAnyProperty();
    }

    /**
     * Create an instance of {@link Category }
     * 
     * @return
     *     the new instance of {@link Category }
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link ImportFileDestination }
     * 
     * @return
     *     the new instance of {@link ImportFileDestination }
     */
    public ImportFileDestination createImportFileDestination() {
        return new ImportFileDestination();
    }

    /**
     * Create an instance of {@link AttributeValue }
     * 
     * @return
     *     the new instance of {@link AttributeValue }
     */
    public AttributeValue createAttributeValue() {
        return new AttributeValue();
    }

    /**
     * Create an instance of {@link ContactEventCreateResult }
     * 
     * @return
     *     the new instance of {@link ContactEventCreateResult }
     */
    public ContactEventCreateResult createContactEventCreateResult() {
        return new ContactEventCreateResult();
    }

    /**
     * Create an instance of {@link ScheduledRequest }
     * 
     * @return
     *     the new instance of {@link ScheduledRequest }
     */
    public ScheduledRequest createScheduledRequest() {
        return new ScheduledRequest();
    }

    /**
     * Create an instance of {@link ScheduledConversation }
     * 
     * @return
     *     the new instance of {@link ScheduledConversation }
     */
    public ScheduledConversation createScheduledConversation() {
        return new ScheduledConversation();
    }

    /**
     * Create an instance of {@link APIFault.Params }
     * 
     * @return
     *     the new instance of {@link APIFault.Params }
     */
    public APIFault.Params createAPIFaultParams() {
        return new APIFault.Params();
    }

    /**
     * Create an instance of {@link AttributeValueContainer.Values }
     * 
     * @return
     *     the new instance of {@link AttributeValueContainer.Values }
     */
    public AttributeValueContainer.Values createAttributeValueContainerValues() {
        return new AttributeValueContainer.Values();
    }

    /**
     * Create an instance of {@link AttributeSet.Items }
     * 
     * @return
     *     the new instance of {@link AttributeSet.Items }
     */
    public AttributeSet.Items createAttributeSetItems() {
        return new AttributeSet.Items();
    }

    /**
     * Create an instance of {@link ContactEvent.Data }
     * 
     * @return
     *     the new instance of {@link ContactEvent.Data }
     */
    public ContactEvent.Data createContactEventData() {
        return new ContactEvent.Data();
    }

    /**
     * Create an instance of {@link Asset.AllowedBlocks }
     * 
     * @return
     *     the new instance of {@link Asset.AllowedBlocks }
     */
    public Asset.AllowedBlocks createAssetAllowedBlocks() {
        return new Asset.AllowedBlocks();
    }

    /**
     * Create an instance of {@link Asset.Tags }
     * 
     * @return
     *     the new instance of {@link Asset.Tags }
     */
    public Asset.Tags createAssetTags() {
        return new Asset.Tags();
    }

    /**
     * Create an instance of {@link Asset.Attributes }
     * 
     * @return
     *     the new instance of {@link Asset.Attributes }
     */
    public Asset.Attributes createAssetAttributes() {
        return new Asset.Attributes();
    }

    /**
     * Create an instance of {@link SuppressionListData.Properties }
     * 
     * @return
     *     the new instance of {@link SuppressionListData.Properties }
     */
    public SuppressionListData.Properties createSuppressionListDataProperties() {
        return new SuppressionListData.Properties();
    }

    /**
     * Create an instance of {@link SuppressionListDefinition.Contexts }
     * 
     * @return
     *     the new instance of {@link SuppressionListDefinition.Contexts }
     */
    public SuppressionListDefinition.Contexts createSuppressionListDefinitionContexts() {
        return new SuppressionListDefinition.Contexts();
    }

    /**
     * Create an instance of {@link SuppressionListDefinition.Fields }
     * 
     * @return
     *     the new instance of {@link SuppressionListDefinition.Fields }
     */
    public SuppressionListDefinition.Fields createSuppressionListDefinitionFields() {
        return new SuppressionListDefinition.Fields();
    }

    /**
     * Create an instance of {@link AutomationTask.Activities }
     * 
     * @return
     *     the new instance of {@link AutomationTask.Activities }
     */
    public AutomationTask.Activities createAutomationTaskActivities() {
        return new AutomationTask.Activities();
    }

    /**
     * Create an instance of {@link AutomationTaskInstance.ActivityInstances }
     * 
     * @return
     *     the new instance of {@link AutomationTaskInstance.ActivityInstances }
     */
    public AutomationTaskInstance.ActivityInstances createAutomationTaskInstanceActivityInstances() {
        return new AutomationTaskInstance.ActivityInstances();
    }

    /**
     * Create an instance of {@link Automation.AutomationTasks }
     * 
     * @return
     *     the new instance of {@link Automation.AutomationTasks }
     */
    public Automation.AutomationTasks createAutomationAutomationTasks() {
        return new Automation.AutomationTasks();
    }

    /**
     * Create an instance of {@link Automation.Notifications }
     * 
     * @return
     *     the new instance of {@link Automation.Notifications }
     */
    public Automation.Notifications createAutomationNotifications() {
        return new Automation.Notifications();
    }

    /**
     * Create an instance of {@link AutomationInstance.TaskInstances }
     * 
     * @return
     *     the new instance of {@link AutomationInstance.TaskInstances }
     */
    public AutomationInstance.TaskInstances createAutomationInstanceTaskInstances() {
        return new AutomationInstance.TaskInstances();
    }

    /**
     * Create an instance of {@link AutomationInstances.AutomationInstanceCollection }
     * 
     * @return
     *     the new instance of {@link AutomationInstances.AutomationInstanceCollection }
     */
    public AutomationInstances.AutomationInstanceCollection createAutomationInstancesAutomationInstanceCollection() {
        return new AutomationInstances.AutomationInstanceCollection();
    }

    /**
     * Create an instance of {@link Publication.Subscribers }
     * 
     * @return
     *     the new instance of {@link Publication.Subscribers }
     */
    public Publication.Subscribers createPublicationSubscribers() {
        return new Publication.Subscribers();
    }

    /**
     * Create an instance of {@link SubscriberAddress.Statuses }
     * 
     * @return
     *     the new instance of {@link SubscriberAddress.Statuses }
     */
    public SubscriberAddress.Statuses createSubscriberAddressStatuses() {
        return new SubscriberAddress.Statuses();
    }

    /**
     * Create an instance of {@link SystemStatusResult.Outages }
     * 
     * @return
     *     the new instance of {@link SystemStatusResult.Outages }
     */
    public SystemStatusResult.Outages createSystemStatusResultOutages() {
        return new SystemStatusResult.Outages();
    }

    /**
     * Create an instance of {@link ObjectExtension.Properties }
     * 
     * @return
     *     the new instance of {@link ObjectExtension.Properties }
     */
    public ObjectExtension.Properties createObjectExtensionProperties() {
        return new ObjectExtension.Properties();
    }

    /**
     * Create an instance of {@link ImportDefinition.FieldMaps }
     * 
     * @return
     *     the new instance of {@link ImportDefinition.FieldMaps }
     */
    public ImportDefinition.FieldMaps createImportDefinitionFieldMaps() {
        return new ImportDefinition.FieldMaps();
    }

    /**
     * Create an instance of {@link ImportDefinition.ControlColumnActions }
     * 
     * @return
     *     the new instance of {@link ImportDefinition.ControlColumnActions }
     */
    public ImportDefinition.ControlColumnActions createImportDefinitionControlColumnActions() {
        return new ImportDefinition.ControlColumnActions();
    }

    /**
     * Create an instance of {@link DataExtensionDeleteResult.KeyErrors }
     * 
     * @return
     *     the new instance of {@link DataExtensionDeleteResult.KeyErrors }
     */
    public DataExtensionDeleteResult.KeyErrors createDataExtensionDeleteResultKeyErrors() {
        return new DataExtensionDeleteResult.KeyErrors();
    }

    /**
     * Create an instance of {@link DataExtensionUpdateResult.KeyErrors }
     * 
     * @return
     *     the new instance of {@link DataExtensionUpdateResult.KeyErrors }
     */
    public DataExtensionUpdateResult.KeyErrors createDataExtensionUpdateResultKeyErrors() {
        return new DataExtensionUpdateResult.KeyErrors();
    }

    /**
     * Create an instance of {@link DataExtensionUpdateResult.ValueErrors }
     * 
     * @return
     *     the new instance of {@link DataExtensionUpdateResult.ValueErrors }
     */
    public DataExtensionUpdateResult.ValueErrors createDataExtensionUpdateResultValueErrors() {
        return new DataExtensionUpdateResult.ValueErrors();
    }

    /**
     * Create an instance of {@link DataExtensionCreateResult.KeyErrors }
     * 
     * @return
     *     the new instance of {@link DataExtensionCreateResult.KeyErrors }
     */
    public DataExtensionCreateResult.KeyErrors createDataExtensionCreateResultKeyErrors() {
        return new DataExtensionCreateResult.KeyErrors();
    }

    /**
     * Create an instance of {@link DataExtensionCreateResult.ValueErrors }
     * 
     * @return
     *     the new instance of {@link DataExtensionCreateResult.ValueErrors }
     */
    public DataExtensionCreateResult.ValueErrors createDataExtensionCreateResultValueErrors() {
        return new DataExtensionCreateResult.ValueErrors();
    }

    /**
     * Create an instance of {@link DataExtensionObject.Keys }
     * 
     * @return
     *     the new instance of {@link DataExtensionObject.Keys }
     */
    public DataExtensionObject.Keys createDataExtensionObjectKeys() {
        return new DataExtensionObject.Keys();
    }

    /**
     * Create an instance of {@link PropertyDefinition.PicklistItems }
     * 
     * @return
     *     the new instance of {@link PropertyDefinition.PicklistItems }
     */
    public PropertyDefinition.PicklistItems createPropertyDefinitionPicklistItems() {
        return new PropertyDefinition.PicklistItems();
    }

    /**
     * Create an instance of {@link PropertyDefinition.References }
     * 
     * @return
     *     the new instance of {@link PropertyDefinition.References }
     */
    public PropertyDefinition.References createPropertyDefinitionReferences() {
        return new PropertyDefinition.References();
    }

    /**
     * Create an instance of {@link DataExtension.Fields }
     * 
     * @return
     *     the new instance of {@link DataExtension.Fields }
     */
    public DataExtension.Fields createDataExtensionFields() {
        return new DataExtension.Fields();
    }

    /**
     * Create an instance of {@link DoubleOptInMOKeyword.ValidPublications }
     * 
     * @return
     *     the new instance of {@link DoubleOptInMOKeyword.ValidPublications }
     */
    public DoubleOptInMOKeyword.ValidPublications createDoubleOptInMOKeywordValidPublications() {
        return new DoubleOptInMOKeyword.ValidPublications();
    }

    /**
     * Create an instance of {@link DoubleOptInMOKeyword.ValidResponses }
     * 
     * @return
     *     the new instance of {@link DoubleOptInMOKeyword.ValidResponses }
     */
    public DoubleOptInMOKeyword.ValidResponses createDoubleOptInMOKeywordValidResponses() {
        return new DoubleOptInMOKeyword.ValidResponses();
    }

    /**
     * Create an instance of {@link PermissionSet.PermissionSets }
     * 
     * @return
     *     the new instance of {@link PermissionSet.PermissionSets }
     */
    public PermissionSet.PermissionSets createPermissionSetPermissionSets() {
        return new PermissionSet.PermissionSets();
    }

    /**
     * Create an instance of {@link PermissionSet.Permissions }
     * 
     * @return
     *     the new instance of {@link PermissionSet.Permissions }
     */
    public PermissionSet.Permissions createPermissionSetPermissions() {
        return new PermissionSet.Permissions();
    }

    /**
     * Create an instance of {@link Role.PermissionSets }
     * 
     * @return
     *     the new instance of {@link Role.PermissionSets }
     */
    public Role.PermissionSets createRolePermissionSets() {
        return new Role.PermissionSets();
    }

    /**
     * Create an instance of {@link Role.Permissions }
     * 
     * @return
     *     the new instance of {@link Role.Permissions }
     */
    public Role.Permissions createRolePermissions() {
        return new Role.Permissions();
    }

    /**
     * Create an instance of {@link AccountUser.AssociatedBusinessUnits }
     * 
     * @return
     *     the new instance of {@link AccountUser.AssociatedBusinessUnits }
     */
    public AccountUser.AssociatedBusinessUnits createAccountUserAssociatedBusinessUnits() {
        return new AccountUser.AssociatedBusinessUnits();
    }

    /**
     * Create an instance of {@link AccountUser.Roles }
     * 
     * @return
     *     the new instance of {@link AccountUser.Roles }
     */
    public AccountUser.Roles createAccountUserRoles() {
        return new AccountUser.Roles();
    }

    /**
     * Create an instance of {@link AccountUser.SsoIdentities }
     * 
     * @return
     *     the new instance of {@link AccountUser.SsoIdentities }
     */
    public AccountUser.SsoIdentities createAccountUserSsoIdentities() {
        return new AccountUser.SsoIdentities();
    }

    /**
     * Create an instance of {@link Account.Roles }
     * 
     * @return
     *     the new instance of {@link Account.Roles }
     */
    public Account.Roles createAccountRoles() {
        return new Account.Roles();
    }

    /**
     * Create an instance of {@link ExtractDefinition.Parameters }
     * 
     * @return
     *     the new instance of {@link ExtractDefinition.Parameters }
     */
    public ExtractDefinition.Parameters createExtractDefinitionParameters() {
        return new ExtractDefinition.Parameters();
    }

    /**
     * Create an instance of {@link ExtractDefinition.Values }
     * 
     * @return
     *     the new instance of {@link ExtractDefinition.Values }
     */
    public ExtractDefinition.Values createExtractDefinitionValues() {
        return new ExtractDefinition.Values();
    }

    /**
     * Create an instance of {@link ExtractDescription.Parameters }
     * 
     * @return
     *     the new instance of {@link ExtractDescription.Parameters }
     */
    public ExtractDescription.Parameters createExtractDescriptionParameters() {
        return new ExtractDescription.Parameters();
    }

    /**
     * Create an instance of {@link com.t1a.sfmc.activity.beans.sfmc.model.soap.Options.SaveOptions }
     * 
     * @return
     *     the new instance of {@link com.t1a.sfmc.activity.beans.sfmc.model.soap.Options.SaveOptions }
     */
    public com.t1a.sfmc.activity.beans.sfmc.model.soap.Options.SaveOptions createOptionsSaveOptions() {
        return new com.t1a.sfmc.activity.beans.sfmc.model.soap.Options.SaveOptions();
    }

    /**
     * Create an instance of {@link ScheduleResponse.Results }
     * 
     * @return
     *     the new instance of {@link ScheduleResponse.Results }
     */
    public ScheduleResponse.Results createScheduleResponseResults() {
        return new ScheduleResponse.Results();
    }

    /**
     * Create an instance of {@link ContentValidationTaskResult.ValidationResults }
     * 
     * @return
     *     the new instance of {@link ContentValidationTaskResult.ValidationResults }
     */
    public ContentValidationTaskResult.ValidationResults createContentValidationTaskResultValidationResults() {
        return new ContentValidationTaskResult.ValidationResults();
    }

    /**
     * Create an instance of {@link ValidationAction.ValidationOptions }
     * 
     * @return
     *     the new instance of {@link ValidationAction.ValidationOptions }
     */
    public ValidationAction.ValidationOptions createValidationActionValidationOptions() {
        return new ValidationAction.ValidationOptions();
    }

    /**
     * Create an instance of {@link PerformResponse.Results }
     * 
     * @return
     *     the new instance of {@link PerformResponse.Results }
     */
    public PerformResponse.Results createPerformResponseResults() {
        return new PerformResponse.Results();
    }

    /**
     * Create an instance of {@link PerformRequest.Definitions }
     * 
     * @return
     *     the new instance of {@link PerformRequest.Definitions }
     */
    public PerformRequest.Definitions createPerformRequestDefinitions() {
        return new PerformRequest.Definitions();
    }

    /**
     * Create an instance of {@link ComplexFilterPart.AdditionalOperands }
     * 
     * @return
     *     the new instance of {@link ComplexFilterPart.AdditionalOperands }
     */
    public ComplexFilterPart.AdditionalOperands createComplexFilterPartAdditionalOperands() {
        return new ComplexFilterPart.AdditionalOperands();
    }

    /**
     * Create an instance of {@link TagFilterPart.Tags }
     * 
     * @return
     *     the new instance of {@link TagFilterPart.Tags }
     */
    public TagFilterPart.Tags createTagFilterPartTags() {
        return new TagFilterPart.Tags();
    }

    /**
     * Create an instance of {@link SendDefinitionList.Parameters }
     * 
     * @return
     *     the new instance of {@link SendDefinitionList.Parameters }
     */
    public SendDefinitionList.Parameters createSendDefinitionListParameters() {
        return new SendDefinitionList.Parameters();
    }

    /**
     * Create an instance of {@link EmailSendDefinition.TrackingUsers }
     * 
     * @return
     *     the new instance of {@link EmailSendDefinition.TrackingUsers }
     */
    public EmailSendDefinition.TrackingUsers createEmailSendDefinitionTrackingUsers() {
        return new EmailSendDefinition.TrackingUsers();
    }

    /**
     * Create an instance of {@link Send.Sources }
     * 
     * @return
     *     the new instance of {@link Send.Sources }
     */
    public Send.Sources createSendSources() {
        return new Send.Sources();
    }

    /**
     * Create an instance of {@link Send.SuppressionLists }
     * 
     * @return
     *     the new instance of {@link Send.SuppressionLists }
     */
    public Send.SuppressionLists createSendSuppressionLists() {
        return new Send.SuppressionLists();
    }

    /**
     * Create an instance of {@link Subscriber.Addresses }
     * 
     * @return
     *     the new instance of {@link Subscriber.Addresses }
     */
    public Subscriber.Addresses createSubscriberAddresses() {
        return new Subscriber.Addresses();
    }

    /**
     * Create an instance of {@link ExtractRequest.Parameters }
     * 
     * @return
     *     the new instance of {@link ExtractRequest.Parameters }
     */
    public ExtractRequest.Parameters createExtractRequestParameters() {
        return new ExtractRequest.Parameters();
    }

    /**
     * Create an instance of {@link ContentValidation.Subscribers }
     * 
     * @return
     *     the new instance of {@link ContentValidation.Subscribers }
     */
    public ContentValidation.Subscribers createContentValidationSubscribers() {
        return new ContentValidation.Subscribers();
    }

    /**
     * Create an instance of {@link ObjectDefinition.ExtendedProperties }
     * 
     * @return
     *     the new instance of {@link ObjectDefinition.ExtendedProperties }
     */
    public ObjectDefinition.ExtendedProperties createObjectDefinitionExtendedProperties() {
        return new ObjectDefinition.ExtendedProperties();
    }

    /**
     * Create an instance of {@link RetrieveRequest.Retrieves }
     * 
     * @return
     *     the new instance of {@link RetrieveRequest.Retrieves }
     */
    public RetrieveRequest.Retrieves createRetrieveRequestRetrieves() {
        return new RetrieveRequest.Retrieves();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOptions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateOptions }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "CreateOptions")
    public JAXBElement<CreateOptions> createCreateOptions(CreateOptions value) {
        return new JAXBElement<>(_CreateOptions_QNAME, CreateOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOptions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateOptions }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "UpdateOptions")
    public JAXBElement<UpdateOptions> createUpdateOptions(UpdateOptions value) {
        return new JAXBElement<>(_UpdateOptions_QNAME, UpdateOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOptions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteOptions }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "DeleteOptions")
    public JAXBElement<DeleteOptions> createDeleteOptions(DeleteOptions value) {
        return new JAXBElement<>(_DeleteOptions_QNAME, DeleteOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentValidation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContentValidation }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ContentValidation")
    public JAXBElement<ContentValidation> createContentValidation(ContentValidation value) {
        return new JAXBElement<>(_ContentValidation_QNAME, ContentValidation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinutelyRecurrence }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MinutelyRecurrence }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "MinutelyRecurrence")
    public JAXBElement<MinutelyRecurrence> createMinutelyRecurrence(MinutelyRecurrence value) {
        return new JAXBElement<>(_MinutelyRecurrence_QNAME, MinutelyRecurrence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HourlyRecurrence }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HourlyRecurrence }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "HourlyRecurrence")
    public JAXBElement<HourlyRecurrence> createHourlyRecurrence(HourlyRecurrence value) {
        return new JAXBElement<>(_HourlyRecurrence_QNAME, HourlyRecurrence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DailyRecurrence }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DailyRecurrence }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "DailyRecurrence")
    public JAXBElement<DailyRecurrence> createDailyRecurrence(DailyRecurrence value) {
        return new JAXBElement<>(_DailyRecurrence_QNAME, DailyRecurrence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeeklyRecurrence }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WeeklyRecurrence }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "WeeklyRecurrence")
    public JAXBElement<WeeklyRecurrence> createWeeklyRecurrence(WeeklyRecurrence value) {
        return new JAXBElement<>(_WeeklyRecurrence_QNAME, WeeklyRecurrence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthlyRecurrence }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MonthlyRecurrence }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "MonthlyRecurrence")
    public JAXBElement<MonthlyRecurrence> createMonthlyRecurrence(MonthlyRecurrence value) {
        return new JAXBElement<>(_MonthlyRecurrence_QNAME, MonthlyRecurrence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearlyRecurrence }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link YearlyRecurrence }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "YearlyRecurrence")
    public JAXBElement<YearlyRecurrence> createYearlyRecurrence(YearlyRecurrence value) {
        return new JAXBElement<>(_YearlyRecurrence_QNAME, YearlyRecurrence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subscriber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Subscriber }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Subscriber")
    public JAXBElement<Subscriber> createSubscriber(Subscriber value) {
        return new JAXBElement<>(_Subscriber_QNAME, Subscriber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriberList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscriberList }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SubscriberList")
    public JAXBElement<SubscriberList> createSubscriberList(SubscriberList value) {
        return new JAXBElement<>(_SubscriberList_QNAME, SubscriberList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "List")
    public JAXBElement<List> createList(List value) {
        return new JAXBElement<>(_List_QNAME, List.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Group }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Group")
    public JAXBElement<Group> createGroup(Group value) {
        return new JAXBElement<>(_Group_QNAME, Group.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAttribute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListAttribute }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ListAttribute")
    public JAXBElement<ListAttribute> createListAttribute(ListAttribute value) {
        return new JAXBElement<>(_ListAttribute_QNAME, ListAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAttributeRestrictedValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListAttributeRestrictedValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ListAttributeRestrictedValue")
    public JAXBElement<ListAttributeRestrictedValue> createListAttributeRestrictedValue(ListAttributeRestrictedValue value) {
        return new JAXBElement<>(_ListAttributeRestrictedValue_QNAME, ListAttributeRestrictedValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Campaign }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Campaign }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Campaign")
    public JAXBElement<Campaign> createCampaign(Campaign value) {
        return new JAXBElement<>(_Campaign_QNAME, Campaign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Send }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Send }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Send")
    public JAXBElement<Send> createSend(Send value) {
        return new JAXBElement<>(_Send_QNAME, Send.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggeredSendDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TriggeredSendDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "TriggeredSendDefinition")
    public JAXBElement<TriggeredSendDefinition> createTriggeredSendDefinition(TriggeredSendDefinition value) {
        return new JAXBElement<>(_TriggeredSendDefinition_QNAME, TriggeredSendDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggeredSendExclusionList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TriggeredSendExclusionList }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "TriggeredSendExclusionList")
    public JAXBElement<TriggeredSendExclusionList> createTriggeredSendExclusionList(TriggeredSendExclusionList value) {
        return new JAXBElement<>(_TriggeredSendExclusionList_QNAME, TriggeredSendExclusionList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggeredSend }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TriggeredSend }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "TriggeredSend")
    public JAXBElement<TriggeredSend> createTriggeredSend(TriggeredSend value) {
        return new JAXBElement<>(_TriggeredSend_QNAME, TriggeredSend.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggeredSendCreateResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TriggeredSendCreateResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "TriggeredSendCreateResult")
    public JAXBElement<TriggeredSendCreateResult> createTriggeredSendCreateResult(TriggeredSendCreateResult value) {
        return new JAXBElement<>(_TriggeredSendCreateResult_QNAME, TriggeredSendCreateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriberResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscriberResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SubscriberResult")
    public JAXBElement<SubscriberResult> createSubscriberResult(SubscriberResult value) {
        return new JAXBElement<>(_SubscriberResult_QNAME, SubscriberResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SenderProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SenderProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SenderProfile")
    public JAXBElement<SenderProfile> createSenderProfile(SenderProfile value) {
        return new JAXBElement<>(_SenderProfile_QNAME, SenderProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeliveryProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "DeliveryProfile")
    public JAXBElement<DeliveryProfile> createDeliveryProfile(DeliveryProfile value) {
        return new JAXBElement<>(_DeliveryProfile_QNAME, DeliveryProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivateDomain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrivateDomain }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "PrivateDomain")
    public JAXBElement<PrivateDomain> createPrivateDomain(PrivateDomain value) {
        return new JAXBElement<>(_PrivateDomain_QNAME, PrivateDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivateDomainSet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrivateDomainSet }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "PrivateDomainSet")
    public JAXBElement<PrivateDomainSet> createPrivateDomainSet(PrivateDomainSet value) {
        return new JAXBElement<>(_PrivateDomainSet_QNAME, PrivateDomainSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivateIP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrivateIP }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "PrivateIP")
    public JAXBElement<PrivateIP> createPrivateIP(PrivateIP value) {
        return new JAXBElement<>(_PrivateIP_QNAME, PrivateIP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SendDefinition")
    public JAXBElement<SendDefinition> createSendDefinition(SendDefinition value) {
        return new JAXBElement<>(_SendDefinition_QNAME, SendDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AudienceItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AudienceItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "AudienceItem")
    public JAXBElement<AudienceItem> createAudienceItem(AudienceItem value) {
        return new JAXBElement<>(_AudienceItem_QNAME, AudienceItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailSendDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmailSendDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "EmailSendDefinition")
    public JAXBElement<EmailSendDefinition> createEmailSendDefinition(EmailSendDefinition value) {
        return new JAXBElement<>(_EmailSendDefinition_QNAME, EmailSendDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeprecatedEmailSendDefinition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeprecatedEmailSendDefinition }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "DeprecatedEmailSendDefinition")
    public JAXBElement<DeprecatedEmailSendDefinition> createDeprecatedEmailSendDefinition(DeprecatedEmailSendDefinition value) {
        return new JAXBElement<>(_DeprecatedEmailSendDefinition_QNAME, DeprecatedEmailSendDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendDefinitionList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendDefinitionList }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SendDefinitionList")
    public JAXBElement<SendDefinitionList> createSendDefinitionList(SendDefinitionList value) {
        return new JAXBElement<>(_SendDefinitionList_QNAME, SendDefinitionList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link APIFault }{@code >}
     */
    @XmlElementDecl(namespace = "urn:fault.partner.exacttarget.com", name = "apifault")
    public JAXBElement<APIFault> createApifault(APIFault value) {
        return new JAXBElement<>(_Apifault_QNAME, APIFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "PartnerKey", scope = APIObject.class)
    public JAXBElement<String> createAPIObjectPartnerKey(String value) {
        return new JAXBElement<>(_APIObjectPartnerKey_QNAME, String.class, APIObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ModifiedDate", scope = APIObject.class)
    public JAXBElement<XMLGregorianCalendar> createAPIObjectModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_APIObjectModifiedDate_QNAME, XMLGregorianCalendar.class, APIObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ObjectID", scope = APIObject.class)
    public JAXBElement<String> createAPIObjectObjectID(String value) {
        return new JAXBElement<>(_APIObjectObjectID_QNAME, String.class, APIObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Id", scope = Category.class)
    public JAXBElement<Integer> createCategoryId(Integer value) {
        return new JAXBElement<>(_CategoryId_QNAME, Integer.class, Category.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ParentId", scope = Category.class)
    public JAXBElement<Integer> createCategoryParentId(Integer value) {
        return new JAXBElement<>(_CategoryParentId_QNAME, Integer.class, Category.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "MemberId", scope = Category.class)
    public JAXBElement<Long> createCategoryMemberId(Long value) {
        return new JAXBElement<>(_CategoryMemberId_QNAME, Long.class, Category.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "EnterpriseId", scope = Category.class)
    public JAXBElement<Long> createCategoryEnterpriseId(Long value) {
        return new JAXBElement<>(_CategoryEnterpriseId_QNAME, Long.class, Category.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Version", scope = Asset.class)
    public JAXBElement<Integer> createAssetVersion(Integer value) {
        return new JAXBElement<>(_AssetVersion_QNAME, Integer.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Locked", scope = Asset.class)
    public JAXBElement<Boolean> createAssetLocked(Boolean value) {
        return new JAXBElement<>(_AssetLocked_QNAME, Boolean.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ActiveDate", scope = Asset.class)
    public JAXBElement<XMLGregorianCalendar> createAssetActiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AssetActiveDate_QNAME, XMLGregorianCalendar.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ExpirationDate", scope = Asset.class)
    public JAXBElement<XMLGregorianCalendar> createAssetExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AssetExpirationDate_QNAME, XMLGregorianCalendar.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "MemberId", scope = Asset.class)
    public JAXBElement<Long> createAssetMemberId(Long value) {
        return new JAXBElement<>(_CategoryMemberId_QNAME, Long.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "EnterpriseId", scope = Asset.class)
    public JAXBElement<Long> createAssetEnterpriseId(Long value) {
        return new JAXBElement<>(_CategoryEnterpriseId_QNAME, Long.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "MinBlocks", scope = Asset.class)
    public JAXBElement<Integer> createAssetMinBlocks(Integer value) {
        return new JAXBElement<>(_AssetMinBlocks_QNAME, Integer.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "MaxBlocks", scope = Asset.class)
    public JAXBElement<Integer> createAssetMaxBlocks(Integer value) {
        return new JAXBElement<>(_AssetMaxBlocks_QNAME, Integer.class, Asset.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Id", scope = CategoryNameIdReference.class)
    public JAXBElement<Integer> createCategoryNameIdReferenceId(Integer value) {
        return new JAXBElement<>(_CategoryId_QNAME, Integer.class, CategoryNameIdReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ParentId", scope = CategoryNameIdReference.class)
    public JAXBElement<Integer> createCategoryNameIdReferenceParentId(Integer value) {
        return new JAXBElement<>(_CategoryParentId_QNAME, Integer.class, CategoryNameIdReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Id", scope = NameIdReference.class)
    public JAXBElement<Long> createNameIdReferenceId(Long value) {
        return new JAXBElement<>(_CategoryId_QNAME, Long.class, NameIdReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Order", scope = AttributeEntityV1 .class)
    public JAXBElement<Integer> createAttributeEntityV1Order(Integer value) {
        return new JAXBElement<>(_AttributeEntityV1Order_QNAME, Integer.class, AttributeEntityV1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NumberSent", scope = ListSend.class)
    public JAXBElement<Integer> createListSendNumberSent(Integer value) {
        return new JAXBElement<>(_ListSendNumberSent_QNAME, Integer.class, ListSend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NumberDelivered", scope = ListSend.class)
    public JAXBElement<Integer> createListSendNumberDelivered(Integer value) {
        return new JAXBElement<>(_ListSendNumberDelivered_QNAME, Integer.class, ListSend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Name", scope = UserAccess.class)
    public JAXBElement<String> createUserAccessName(String value) {
        return new JAXBElement<>(_UserAccessName_QNAME, String.class, UserAccess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Value", scope = UserAccess.class)
    public JAXBElement<String> createUserAccessValue(String value) {
        return new JAXBElement<>(_UserAccessValue_QNAME, String.class, UserAccess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Description", scope = UserAccess.class)
    public JAXBElement<String> createUserAccessDescription(String value) {
        return new JAXBElement<>(_UserAccessDescription_QNAME, String.class, UserAccess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "AccountUserID", scope = AccountUser.class)
    public JAXBElement<Integer> createAccountUserAccountUserID(Integer value) {
        return new JAXBElement<>(_AccountUserAccountUserID_QNAME, Integer.class, AccountUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SubscriptionID", scope = Subscription.class)
    public JAXBElement<Integer> createSubscriptionSubscriptionID(Integer value) {
        return new JAXBElement<>(_SubscriptionSubscriptionID_QNAME, Integer.class, Subscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Notes", scope = Subscription.class)
    public JAXBElement<String> createSubscriptionNotes(String value) {
        return new JAXBElement<>(_SubscriptionNotes_QNAME, String.class, Subscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NotificationTitle", scope = Subscription.class)
    public JAXBElement<String> createSubscriptionNotificationTitle(String value) {
        return new JAXBElement<>(_SubscriptionNotificationTitle_QNAME, String.class, Subscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NotificationMessage", scope = Subscription.class)
    public JAXBElement<String> createSubscriptionNotificationMessage(String value) {
        return new JAXBElement<>(_SubscriptionNotificationMessage_QNAME, String.class, Subscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NotificationFlag", scope = Subscription.class)
    public JAXBElement<String> createSubscriptionNotificationFlag(String value) {
        return new JAXBElement<>(_SubscriptionNotificationFlag_QNAME, String.class, Subscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NotificationExpDate", scope = Subscription.class)
    public JAXBElement<XMLGregorianCalendar> createSubscriptionNotificationExpDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_SubscriptionNotificationExpDate_QNAME, XMLGregorianCalendar.class, Subscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "ForAccounting", scope = Subscription.class)
    public JAXBElement<String> createSubscriptionForAccounting(String value) {
        return new JAXBElement<>(_SubscriptionForAccounting_QNAME, String.class, Subscription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "BrandID", scope = AccountDataItem.class)
    public JAXBElement<Integer> createAccountDataItemBrandID(Integer value) {
        return new JAXBElement<>(_AccountDataItemBrandID_QNAME, Integer.class, AccountDataItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "PrivateLabelID", scope = AccountDataItem.class)
    public JAXBElement<Integer> createAccountDataItemPrivateLabelID(Integer value) {
        return new JAXBElement<>(_AccountDataItemPrivateLabelID_QNAME, Integer.class, AccountDataItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "AccountType", scope = AccountDataItem.class)
    public JAXBElement<Integer> createAccountDataItemAccountType(Integer value) {
        return new JAXBElement<>(_AccountDataItemAccountType_QNAME, Integer.class, AccountDataItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "Subscription", scope = Account.class)
    public JAXBElement<Subscription> createAccountSubscription(Subscription value) {
        return new JAXBElement<>(_AccountSubscription_QNAME, Subscription.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NumberSent", scope = Send.class)
    public JAXBElement<Integer> createSendNumberSent(Integer value) {
        return new JAXBElement<>(_ListSendNumberSent_QNAME, Integer.class, Send.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "NumberDelivered", scope = Send.class)
    public JAXBElement<Integer> createSendNumberDelivered(Integer value) {
        return new JAXBElement<>(_ListSendNumberDelivered_QNAME, Integer.class, Send.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://exacttarget.com/wsdl/partnerAPI", name = "SentDate", scope = Send.class)
    public JAXBElement<XMLGregorianCalendar> createSendSentDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_SendSentDate_QNAME, XMLGregorianCalendar.class, Send.class, value);
    }

}
