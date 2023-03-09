public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyPayment = service.calculate(1000000, 9.99, 12);
        System.out.println(monthlyPayment);
    }
}