/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class MarketDataSwitchOperationApiController {

	@Autowired
	MarketDataSwitchOperationApiService service;
	
	@BQ("distributions")
	@Operate.ExecutePost
	public BianResponse<DistributionBaseWithIdAndRoot> executePostDistributions(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<DistributionBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostDistributions(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("distributions")
	@Operate.ExecutePut
	public BianResponse<DistributionBaseWithIdAndRoot> executePutDistributions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<DistributionBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutDistributions(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Record
	public BianResponse<MarketDataSwitchOperationRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<MarketDataSwitchOperationRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Operate.RequestPost
	public BianResponse<OperatingSessionBaseWithId> requestPost(@RequestBody BianRequest<OperatingSessionBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Operate.RequestPut
	public BianResponse<OperatingSessionBaseWithId> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<OperatingSessionBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<OperatingSessionBaseWithId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("distributions")
	@Operate.Retrieve
	public BianResponse<DistributionBaseWithIdAndRoot> retrieveDistributions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDistributions(crReferenceId, bqReferenceId));
	}
	
	@BQ("feed-uploads")
	@Operate.Retrieve
	public BianResponse<FeedUploadBaseWithIdAndRoot> retrieveFeedUploads(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFeedUploads(crReferenceId, bqReferenceId));
	}
	
	@BQ("publishes")
	@Operate.Retrieve
	public BianResponse<PublishBaseWithIdAndRoot> retrievePublishes(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePublishes(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("reportings")
	@Operate.Retrieve
	public BianResponse<ReportingBaseWithIdAndRoot> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
}
