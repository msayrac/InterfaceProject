package inter;

public interface IBanka {

    final String hostIpAddress = "127.0.0.1";
    boolean connect(String ipAddress);
// comment added
    boolean payment(double price, String cardNumber,String date, String cvc);

    // payment 2 added
    boolean payment2(double price, String cardNumber,String date, String cvc);



}
