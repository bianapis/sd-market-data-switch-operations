package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PublishBaseWithIdAndRoot
 */
public class PublishBaseWithIdAndRoot   {
  private String marketDataSwitchInternalInformationFeedServiceSessionReference = null;

  private String marketDataSwitchOperatingSessionReference = null;

  private Object marketDataSwitchServiceConfigurationRecord = null;

  private String internalInformationFeedServiceReference = null;

  private Object internalInformationFeedServiceProfile = null;

  private String internalInformationFeedServiceRecordReference = null;

  private Object internalInformationFeedServiceRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'refers to the ongoing exchange of information records provided by an internal bank source' 
   * @return marketDataSwitchInternalInformationFeedServiceSessionReference
  **/

  public String getMarketDataSwitchInternalInformationFeedServiceSessionReference() {
    return marketDataSwitchInternalInformationFeedServiceSessionReference;
  }

  public void setMarketDataSwitchInternalInformationFeedServiceSessionReference(String marketDataSwitchInternalInformationFeedServiceSessionReference) {
    this.marketDataSwitchInternalInformationFeedServiceSessionReference = marketDataSwitchInternalInformationFeedServiceSessionReference;
  }


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'this refers to internal sources of published information e.g. bank rates' 
   * @return internalInformationFeedServiceReference
  **/

  public String getInternalInformationFeedServiceReference() {
    return internalInformationFeedServiceReference;
  }

  public void setInternalInformationFeedServiceReference(String internalInformationFeedServiceReference) {
    this.internalInformationFeedServiceReference = internalInformationFeedServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'this sets out the range of internally published information services/pages' 
   * @return internalInformationFeedServiceProfile
  **/

  public Object getInternalInformationFeedServiceProfile() {
    return internalInformationFeedServiceProfile;
  }

  public void setInternalInformationFeedServiceProfile(Object internalInformationFeedServiceProfile) {
    this.internalInformationFeedServiceProfile = internalInformationFeedServiceProfile;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'this refers to internal pages of information published' 
   * @return internalInformationFeedServiceRecordReference
  **/

  public String getInternalInformationFeedServiceRecordReference() {
    return internalInformationFeedServiceRecordReference;
  }

  public void setInternalInformationFeedServiceRecordReference(String internalInformationFeedServiceRecordReference) {
    this.internalInformationFeedServiceRecordReference = internalInformationFeedServiceRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'this is the internally generated information that is distributed over the switch' 
   * @return internalInformationFeedServiceRecord
  **/

  public Object getInternalInformationFeedServiceRecord() {
    return internalInformationFeedServiceRecord;
  }

  public void setInternalInformationFeedServiceRecord(Object internalInformationFeedServiceRecord) {
    this.internalInformationFeedServiceRecord = internalInformationFeedServiceRecord;
  }


}

