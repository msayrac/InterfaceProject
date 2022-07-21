package inter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tutar gitiniz : ");
        double price = input.nextDouble();


        System.out.println("Kart No giriniz : ");
        String cardNumber = input.next();

        System.out.println("Son kullanim tarihi giriniz : ");
        String date = input.next();

        System.out.println("Guvenlik kodu : ");
        String cvc = input.next();

        System.out.println("1. A bankasi");
        System.out.println("2. B bankasi");
        System.out.println("3. C bankasi");

        System.out.println("Banka seciniz");

        int selectBank = input.nextInt();

        switch(selectBank){
            case 1 :
                ABankasi apos = new ABankasi("A  Bankasi","123456","123456");
                apos.connect("127.0.0.1");
                apos.payment(price,cardNumber,date,cvc);
                break;
            case 2 :
                BBankasi bpos = new BBankasi("B  Bankasi","123345456","123333456");
                bpos.connect("127.0.0.1");
                bpos.payment(price,cardNumber,date,cvc);
                break;
            default :
                System.out.println("Gecerli banka giriniz :");
        }









    }


}
