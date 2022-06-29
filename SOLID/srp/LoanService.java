package SOLID.srp;

public class LoanService {

    public void getLoanInfo(String type)
    {
        if(type.equalsIgnoreCase("Home"))
            System.out.println("Home Loan");
        if(type.equalsIgnoreCase("PersonalLoan"))
            System.out.println("Personal Loan");
    }

}
