package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FeedUploadBaseWithIdAndRoot
 */
public class FeedUploadBaseWithIdAndRoot   {
  private String marketDataSwitchUploadInformationFeedServiceSessionReference = null;

  private String marketDataSwitchOperatingSessionReference = null;

  private Object marketDataSwitchServiceConfigurationRecord = null;

  private String marketInformationFeedServiceReference = null;

  private Object marketInformationFeedServiceProfile = null;

  private String marketInformationFeedServiceRecordReference = null;

  private Object marketInformationFeedServiceRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Market Data Switch Upload Information Feed Service Session Reference (Refers to the ongoing exchange of information records provided by an information provider - note there may be many providers active during a switch operating session).' 
   * @return marketDataSwitchUploadInformationFeedServiceSessionReference
  **/

  public String getMarketDataSwitchUploadInformationFeedServiceSessionReference() {
    return marketDataSwitchUploadInformationFeedServiceSessionReference;
  }

  public void setMarketDataSwitchUploadInformationFeedServiceSessionReference(String marketDataSwitchUploadInformationFeedServiceSessionReference) {
    this.marketDataSwitchUploadInformationFeedServiceSessionReference = marketDataSwitchUploadInformationFeedServiceSessionReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Market Information Feed Service Reference (this refers to the market feed service.Note- service operated by SD Information Provider Operation)' 
   * @return marketInformationFeedServiceReference
  **/

  public String getMarketInformationFeedServiceReference() {
    return marketInformationFeedServiceReference;
  }

  public void setMarketInformationFeedServiceReference(String marketInformationFeedServiceReference) {
    this.marketInformationFeedServiceReference = marketInformationFeedServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'this sets out the range of information services/pages available - possibly with some form of selection menu' 
   * @return marketInformationFeedServiceProfile
  **/

  public Object getMarketInformationFeedServiceProfile() {
    return marketInformationFeedServiceProfile;
  }

  public void setMarketInformationFeedServiceProfile(Object marketInformationFeedServiceProfile) {
    this.marketInformationFeedServiceProfile = marketInformationFeedServiceProfile;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Market Information Feed Service Record Reference(this refers to packets of information/records provided, perhaps with real-time updates)' 
   * @return marketInformationFeedServiceRecordReference
  **/

  public String getMarketInformationFeedServiceRecordReference() {
    return marketInformationFeedServiceRecordReference;
  }

  public void setMarketInformationFeedServiceRecordReference(String marketInformationFeedServiceRecordReference) {
    this.marketInformationFeedServiceRecordReference = marketInformationFeedServiceRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'Market Information Feed Service Record (this is the market information that is distributed over the switch - its content is updated dynamically during the session)' 
   * @return marketInformationFeedServiceRecord
  **/

  public Object getMarketInformationFeedServiceRecord() {
    return marketInformationFeedServiceRecord;
  }

  public void setMarketInformationFeedServiceRecord(Object marketInformationFeedServiceRecord) {
    this.marketInformationFeedServiceRecord = marketInformationFeedServiceRecord;
  }


}

