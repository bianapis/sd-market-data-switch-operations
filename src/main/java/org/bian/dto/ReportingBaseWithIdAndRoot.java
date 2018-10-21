package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ReportingBaseWithIdAndRoot
 */
public class ReportingBaseWithIdAndRoot   {
  private String marketDataSwitchOperatingSessionReference = null;

  private String marketDataSwitchOperatingSessionReportReference = null;

  private String marketDataSwitchOperatingSessionReportType = null;

  private Object marketDataSwitchOperatingSessionStatistics = null;

  private Object marketDataSwitchOperatingSessionReport = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'Market Data Switch Operating Session Report Reference (refers to the service report)' 
   * @return marketDataSwitchOperatingSessionReportReference
  **/

  public String getMarketDataSwitchOperatingSessionReportReference() {
    return marketDataSwitchOperatingSessionReportReference;
  }

  public void setMarketDataSwitchOperatingSessionReportReference(String marketDataSwitchOperatingSessionReportReference) {
    this.marketDataSwitchOperatingSessionReportReference = marketDataSwitchOperatingSessionReportReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: 'Market Data Switch Operating Session Report Type (e.g. real-time status, session statistics)' 
   * @return marketDataSwitchOperatingSessionReportType
  **/

  public String getMarketDataSwitchOperatingSessionReportType() {
    return marketDataSwitchOperatingSessionReportType;
  }

  public void setMarketDataSwitchOperatingSessionReportType(String marketDataSwitchOperatingSessionReportType) {
    this.marketDataSwitchOperatingSessionReportType = marketDataSwitchOperatingSessionReportType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'Market Data Switch Operating Session Statistics(maintained service activity statistic)' 
   * @return marketDataSwitchOperatingSessionStatistics
  **/

  public Object getMarketDataSwitchOperatingSessionStatistics() {
    return marketDataSwitchOperatingSessionStatistics;
  }

  public void setMarketDataSwitchOperatingSessionStatistics(Object marketDataSwitchOperatingSessionStatistics) {
    this.marketDataSwitchOperatingSessionStatistics = marketDataSwitchOperatingSessionStatistics;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'Market Data Switch Operating Session Report (the session activity report)' 
   * @return marketDataSwitchOperatingSessionReport
  **/

  public Object getMarketDataSwitchOperatingSessionReport() {
    return marketDataSwitchOperatingSessionReport;
  }

  public void setMarketDataSwitchOperatingSessionReport(Object marketDataSwitchOperatingSessionReport) {
    this.marketDataSwitchOperatingSessionReport = marketDataSwitchOperatingSessionReport;
  }


}

