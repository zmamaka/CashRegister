import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float pear, apple, tomatoes, banana, aubergine;
        float pPrice = 2.14f, aPrice = 3.67f, tPrice = 1.11f, bPrice = 0.95f, auPrice = 5f;
        float cost;

        System.out.print("Armut kaç kilo => ");
        pear = scan.nextFloat();

        System.out.print("Elma kaç kilo => ");
        apple = scan.nextFloat();

        System.out.print("Domates kaç kilo => ");
        tomatoes = scan.nextFloat();

        System.out.print("Muz kaç kilo => ");
        banana = scan.nextFloat();

        System.out.print("Patlıcan kaç kilo => ");
        aubergine = scan.nextFloat();

        cost = (pear * pPrice) + (apple * aPrice) + (tomatoes * tPrice) + (banana * bPrice) + (aubergine * auPrice);

        System.out.print("Tutar => " + cost);

    }
}
