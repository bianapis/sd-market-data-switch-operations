/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface MarketDataSwitchOperationApiService {

	DistributionBaseWithIdAndRoot executePostDistributions(String crReferenceId, DistributionBase request);
	
	DistributionBaseWithIdAndRoot executePutDistributions(String crReferenceId, String bqReferenceId, DistributionBase request);
	
	MarketDataSwitchOperationRecordResponse record(String crReferenceId, MarketDataSwitchOperationRecordRequest request);
	
	OperatingSessionBaseWithId requestPost(OperatingSessionBase request);
	
	OperatingSessionBaseWithId requestPut(String crReferenceId, OperatingSessionBase request);
	
	OperatingSessionBaseWithId retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	DistributionBaseWithIdAndRoot retrieveDistributions(String crReferenceId, String bqReferenceId);
	
	FeedUploadBaseWithIdAndRoot retrieveFeedUploads(String crReferenceId, String bqReferenceId);
	
	PublishBaseWithIdAndRoot retrievePublishes(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	ReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId);
	
}
