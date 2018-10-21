package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * OperatingSessionBaseWithId
 */
public class OperatingSessionBaseWithId   {
  private String marketDataSwitchOperatingSessionReference = null;

  private String marketDataSwitchServiceConfigurationRecordReference = null;

  private Object marketDataSwitchServiceConfigurationRecord = null;

  private String marketDataSwitchUserAccessRightsRecordReference = null;

  private Object marketDataSwitchUserAccessRightsRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Market Data Switch Operating Session Reference' 
   * @return marketDataSwitchOperatingSessionReference
  **/

  public String getMarketDataSwitchOperatingSessionReference() {
    return marketDataSwitchOperatingSessionReference;
  }

  public void setMarketDataSwitchOperatingSessionReference(String marketDataSwitchOperatingSessionReference) {
    this.marketDataSwitchOperatingSessionReference = marketDataSwitchOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Market Data Switch Service Configuration Record Reference (used to access/update the service configuration)' 
   * @return marketDataSwitchServiceConfigurationRecordReference
  **/

  public String getMarketDataSwitchServiceConfigurationRecordReference() {
    return marketDataSwitchServiceConfigurationRecordReference;
  }

  public void setMarketDataSwitchServiceConfigurationRecordReference(String marketDataSwitchServiceConfigurationRecordReference) {
    this.marketDataSwitchServiceConfigurationRecordReference = marketDataSwitchServiceConfigurationRecordReference;
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

