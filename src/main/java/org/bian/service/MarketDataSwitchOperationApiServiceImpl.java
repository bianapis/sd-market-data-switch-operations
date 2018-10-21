/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MarketDataSwitchOperationApiServiceImpl implements MarketDataSwitchOperationApiService {

	public DistributionBaseWithIdAndRoot executePostDistributions(String crReferenceId, DistributionBase request){
		return JsonReader.read("executePost-DistributionBaseWithIdAndRoot.json",new TypeReference<DistributionBaseWithIdAndRoot>(){});
	}
	
	public DistributionBaseWithIdAndRoot executePutDistributions(String crReferenceId, String bqReferenceId, DistributionBase request){
		return JsonReader.read("executePut-DistributionBaseWithIdAndRoot.json",new TypeReference<DistributionBaseWithIdAndRoot>(){});
	}
	
	public MarketDataSwitchOperationRecordResponse record(String crReferenceId, MarketDataSwitchOperationRecordRequest request){
		return JsonReader.read("record-MarketDataSwitchOperationRecordResponse.json",new TypeReference<MarketDataSwitchOperationRecordResponse>(){});
	}
	
	public OperatingSessionBaseWithId requestPost(OperatingSessionBase request){
		return JsonReader.read("requestPost-OperatingSessionBaseWithId.json",new TypeReference<OperatingSessionBaseWithId>(){});
	}
	
	public OperatingSessionBaseWithId requestPut(String crReferenceId, OperatingSessionBase request){
		return JsonReader.read("requestPut-OperatingSessionBaseWithId.json",new TypeReference<OperatingSessionBaseWithId>(){});
	}
	
	public OperatingSessionBaseWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-OperatingSessionBaseWithId.json",new TypeReference<OperatingSessionBaseWithId>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public DistributionBaseWithIdAndRoot retrieveDistributions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DistributionBaseWithIdAndRoot.json",new TypeReference<DistributionBaseWithIdAndRoot>(){});
	}
	
	public FeedUploadBaseWithIdAndRoot retrieveFeedUploads(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FeedUploadBaseWithIdAndRoot.json",new TypeReference<FeedUploadBaseWithIdAndRoot>(){});
	}
	
	public PublishBaseWithIdAndRoot retrievePublishes(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PublishBaseWithIdAndRoot.json",new TypeReference<PublishBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ReportingBaseWithIdAndRoot.json",new TypeReference<ReportingBaseWithIdAndRoot>(){});
	}
	
}
