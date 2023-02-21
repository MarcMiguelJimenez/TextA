import java.util.Date;
public class CreditCardDate extends Payment{

    private String cardName;
    private String cardNumber;
    private Date cardExpDate;

    public CreditCardDate(double payCharge){
        super(payCharge);
    }
    public double handlePayment(double pay){
        return pay * super.getpaymentCharge();
    }

    public void setCreditCardExpDate(){
        cardExpDate = new Date();
    }
    public Date getCreditCardExpDate(){
        return cardExpDate;


    }
}
