import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Purchase {

    private List<Integer> books;
    private double bestCost;
    private int bookCost;
    private List<Integer> discounts;

    public Purchase(){
        books = new ArrayList<>();
        bestCost =0;
        bookCost=8;
        discounts = new ArrayList<>();
    }

    public double cost() {
        bestCost=100;
        List<Integer> initialBooks = new ArrayList<>(books);
        double cost = 0;
        for(int j=0;j<50;j++) {
            books = new ArrayList<>(initialBooks);
            books.removeIf(x -> x == 0);
            discounts.clear();
            for (int i=0;i<5;i++) {
                discounts.add(ThreadLocalRandom.current().nextInt(1, 6));
            }
            for (int i = 0; i < discounts.size(); i++) {
                //System.out.println(discounts.get(i));
                if (discounts.get(i) == 5 && books.size() == 5) {
                    cost += (bookCost * 5) - ((bookCost * 5) * 0.25);
                    for (int k = 0; k < discounts.get(i); k++) {
                        books.set(k, books.get(k) - 1);
                    }
                }
                if (discounts.get(i) == 4 && books.size() >= 4) {
                    cost += (bookCost * 4) - ((bookCost * 4) * 0.2);
                    for (int k = 0; k < discounts.get(i); k++) {
                        books.set(k, books.get(k) - 1);
                    }
                }
                if (discounts.get(i) == 3 && books.size() >= 3) {
                    cost += (bookCost * 3) - ((bookCost * 3) * 0.1);
                    for (int k = 0; k < discounts.get(i); k++) {
                        books.set(k, books.get(k) - 1);
                    }
                }
                if (discounts.get(i) == 2 && books.size() >= 2) {
                    cost += (bookCost * 2) - ((bookCost * 2) * 0.05);
                    for (int k = 0; k < discounts.get(i); k++) {
                        books.set(k, books.get(k) - 1);
                    }
                }
                if (discounts.get(i) == 1 && books.size() >= 1) {
                    cost += 8;
                    books.set(0, books.get(0) - 1);

                }
                books.removeIf(x -> x == 0);
                if(i==4 && books.size()!=0){
                    cost=0;
                    break;
                }
                if(books.size() ==0){
                    break;
                }
            }
            //System.out.println("------------- "+ cost);
            if(cost !=0 && bestCost > cost){
                bestCost = cost;
            }
            cost=0;
        }
        return bestCost;
    }

    public List<Integer> getBooks() {
        return books;
    }

    public void setBooks(List<Integer> books) {
        this.books = books;
    }

    public double getCost() {
        return bestCost;
    }

    public void setCost(double cost) {
        this.bestCost = cost;
    }
}
