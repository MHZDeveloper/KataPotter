import java.util.Scanner;

/**
 * Created by HICHEM on 10/07/2017.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Purchase purchase = new Purchase();

        System.out.println("Number of book1");
        purchase.getBooks().add(scanner.nextInt());
        System.out.println("Number of book2");
        purchase.getBooks().add(scanner.nextInt());
        System.out.println("Number of book3");
        purchase.getBooks().add(scanner.nextInt());
        System.out.println("Number of book4");
        purchase.getBooks().add(scanner.nextInt());
        System.out.println("Number of book5");
        purchase.getBooks().add(scanner.nextInt());
        System.out.println("Cost : "+ purchase.cost());
    }
}
