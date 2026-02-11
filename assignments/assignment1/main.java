package assignments.assignment1;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<book> books = new ArrayList<>();

        System.out.println("What would you like to do? (1: Add book, 2: Display books, 3: Display avaiable books, 4: Search by Author, 5: Check a book out, 6: Return a book, 7: Exit)");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Enter the book title:");
            String title = scanner.nextLine();
            System.out.println("Enter the book author:");
            String author = scanner.nextLine();
            System.out.println("Enter the book's ISBN:");
            String isbn = scanner.nextLine();
            books.add(new book(title, author, isbn, true));
        }

        else if (choice == 2){
            for (book book : books) {
                book.displayInfo();
            }
        }

        else if (choice == 3){
            for (book book : books) {
                if (book.getAvailable()) {
                    book.displayInfo();
                }
            }
        }
        else if (choice == 4){
            System.out.println("What author would you like to search?:");
            String authorSearch = scanner.nextLine();
            for (book book : books) {
                if (book.getAuthor().equals(authorSearch)) {
                    book.displayInfo();
                }
            }
        }

        else if (choice == 5){
            System.out.println("Which book would you like to check out?:");
            String title = scanner.nextLine();
            for (book book : books) {
                if (book.getTitle().equals(title)) {
                    if (book.getAvailable()) {
                        book.setAvailable(false);
                        System.out.println("Enjoy your book!");
                    } else {
                        System.out.println("This book is currently unavailable.");
                    }
                }
            }
        }
        
        else if (choice == 6){
            System.out.println("What book are you returning?:");
            String title = scanner.nextLine();
            for (book book : books) {
                if (book.getTitle().equals(title)) {
                    book.setAvailable(true);
                    System.out.println("Book returned.");
            }
        }

    }
}
