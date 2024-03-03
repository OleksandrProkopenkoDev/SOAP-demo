package ua.spro.soaphelloworld.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ua.spro.soaphelloworld.loaneligibility.Acknowledgement;
import ua.spro.soaphelloworld.loaneligibility.CustomerRequest;
import ua.spro.soaphelloworld.service.LoanEligibilityService;

@Endpoint
@AllArgsConstructor
public class LoanEligibilityIndicatorEndpoint {
  public static final String NAMESPACE = "http://www.spro.ua/soaphelloworld/loanEligibility";
  private LoanEligibilityService service;

  @PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
  @ResponsePayload
  public Acknowledgement getLoanStatus(@RequestPayload CustomerRequest request){
    return service.checkLoanEligibility(request);
  }

}
