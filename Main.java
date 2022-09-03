import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {



        Book book1 = new Book("War and Peace", 1225, "Tolstoy", 1867);
        Book book2 = new Book("Crime and Punishment", 576, "Dostoevsky", 1866);
        Book book3 = new Book("Utopia", 359, "Thomas More", 1516);
        Book book4 = new Book("Alice in WonderLand", 208, "Lewis Carroll",1865);
        Book book5 = new Book("The Brothers Karamazov", 840, "Dostoevsky",1879);

        TreeSet<Book> bookSetName = new TreeSet<>();

        bookSetName.add(book1);
        bookSetName.add(book2);
        bookSetName.add(book3);
        bookSetName.add(book4);
        bookSetName.add(book5);

        for (Book book:bookSetName) {
            System.out.printf("Book Name: %-23s Page: %4d\n", book.getName(), book.getPageNum());
        }

        System.out.println("======================================");

        TreeSet<Book> bookSetPageNum = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getPageNum() - b2.getPageNum();
            }
        }.reversed());

        bookSetPageNum.add(book1);
        bookSetPageNum.add(book2);
        bookSetPageNum.add(book3);
        bookSetPageNum.add(book4);
        bookSetPageNum.add(book5);

        for (Book book:bookSetPageNum) {
            System.out.printf("Book Name: %-23s Page: %4d\n", book.getName(), book.getPageNum());
        }



    }
}
