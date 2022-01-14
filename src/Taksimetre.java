import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double min = 10.0,price;
        int km;

        Scanner data = new Scanner(System.in);
        System.out.print("Kaç kilometre gittiniz : ");
        km = data.nextInt();

        price = (km * 2.20);
        System.out.println(km>0&&(min+price)<20 ? "Minimum ödeme: 20TL":km>0? "Ödenecek ücret: "+ (min + price)+"TL" : "Taksi geri vitesle mi gitti :-)");
    }
}
