package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DistributionBase
 */
public class DistributionBase   {
  private String marketDataSwitchServiceUserSessionRecordReference = null;

  private Object marketDataSwitchServiceUserSessionRecord = null;

  private Object marketDataSwitchServiceConfigurationRecord = null;

  private String marketDataSwitchUserAccessRightsRecordReference = null;

  private Object marketDataSwitchUserAccessRightsRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Market Data Switch Service User Session Record Reference (refers to a user's market switch access session - where they receive the information as per their registered access rights)' 
   * @return marketDataSwitchServiceUserSessionRecordReference
  **/

  public String getMarketDataSwitchServiceUserSessionRecordReference() {
    return marketDataSwitchServiceUserSessionRecordReference;
  }

  public void setMarketDataSwitchServiceUserSessionRecordReference(String marketDataSwitchServiceUserSessionRecordReference) {
    this.marketDataSwitchServiceUserSessionRecordReference = marketDataSwitchServiceUserSessionRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'Market Data Switch Switch Service User Session Record (defines the switch service - content - that the user will receive for this session - reflecting their user access rights)' 
   * @return marketDataSwitchServiceUserSessionRecord
  **/

  public Object getMarketDataSwitchServiceUserSessionRecord() {
    return marketDataSwitchServiceUserSessionRecord;
  }

  public void setMarketDataSwitchServiceUserSessionRecord(Object marketDataSwitchServiceUserSessionRecord) {
    this.marketDataSwitchServiceUserSessionRecord = marketDataSwitchServiceUserSessionRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'defines how the operational facility is set-up, including the offered external market information feeds/services and internal information records' 
   * @return marketDataSwitchServiceConfigurationRecord
  **/

  public Object getMarketDataSwitchServiceConfigurationRecord() {
    return marketDataSwitchServiceConfigurationRecord;
  }

  public void setMarketDataSwitchServiceConfigurationRecord(Object marketDataSwitchServiceConfigurationRecord) {
    this.marketDataSwitchServiceConfigurationRecord = marketDataSwitchServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Market Data Switch Access Rights Record Reference' 
   * @return marketDataSwitchUserAccessRightsRecordReference
  **/

  public String getMarketDataSwitchUserAccessRightsRecordReference() {
    return marketDataSwitchUserAccessRightsRecordReference;
  }

  public void setMarketDataSwitchUserAccessRightsRecordReference(String marketDataSwitchUserAccessRightsRecordReference) {
    this.marketDataSwitchUserAccessRightsRecordReference = marketDataSwitchUserAccessRightsRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'Market Data Switch Access Rights Record (this captures the users that are registered to access different services/information made available through the switch - it is used to control access)' 
   * @return marketDataSwitchUserAccessRightsRecord
  **/

  public Object getMarketDataSwitchUserAccessRightsRecord() {
    return marketDataSwitchUserAccessRightsRecord;
  }

  public void setMarketDataSwitchUserAccessRightsRecord(Object marketDataSwitchUserAccessRightsRecord) {
    this.marketDataSwitchUserAccessRightsRecord = marketDataSwitchUserAccessRightsRecord;
  }


}

