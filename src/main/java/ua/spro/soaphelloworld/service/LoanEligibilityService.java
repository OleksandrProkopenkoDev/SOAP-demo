package ua.spro.soaphelloworld.service;

import java.util.List;
import org.springframework.stereotype.Service;
import ua.spro.soaphelloworld.loaneligibility.Acknowledgement;
import ua.spro.soaphelloworld.loaneligibility.CustomerRequest;

@Service
public class LoanEligibilityService {

  public static final int MIN_AGE = 30;
  public static final int MAX_AGE = 60;
  public static final int MIN_INCOME = 200_000;
  public static final int MIN_SCORE = 500;
  public static final int ZERO_APPROVED_AMOUNT = 0;
  public static final int DEFAULT_APPROVED_AMOUNT = 500_000;

  public Acknowledgement checkLoanEligibility(CustomerRequest request) {
    Acknowledgement acknowledgement = new Acknowledgement();
    List<String> mismatchCriteriaList = acknowledgement.getCriteriaMismatch();

    boolean validAge = request.getAge() > MIN_AGE && request.getAge() <= MAX_AGE;

    if (!validAge) {
      mismatchCriteriaList.add("Person age should in between " + MIN_AGE + " to " + MAX_AGE);
    }

    boolean validIncome = request.getYearlyIncome() > MIN_INCOME;

    if (!validIncome) {
      mismatchCriteriaList.add("minimum income should be more than " + MIN_INCOME);
    }

    boolean validScore = request.getCibilScore() > MIN_SCORE;
    if (!validScore) {
      mismatchCriteriaList.add("Low CIBIL Score, please try after 6 months");
    }

    if (!mismatchCriteriaList.isEmpty()) {
      acknowledgement.setApprovedAmount(ZERO_APPROVED_AMOUNT);
      acknowledgement.setEligible(false);
    } else {
      acknowledgement.setApprovedAmount(DEFAULT_APPROVED_AMOUNT);
      acknowledgement.setEligible(true);
    }

    return acknowledgement;
  }
}
