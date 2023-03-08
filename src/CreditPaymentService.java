public class CreditPaymentService {
    public double calculate(int sumCredit, double percent, int month) {
        double monthlyPayment = sumCredit * ((percent/100/12) + ((percent/100/12) / (Math.pow(1+ (percent/100/12), month) - 1)));
        return (int) monthlyPayment;
    }
}
