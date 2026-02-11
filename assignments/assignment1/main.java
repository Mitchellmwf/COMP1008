package assignments.assignment1;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<book> books = new ArrayList<>();
        int choice = 0;

        //Menu
        while (choice != 7) {
            System.out.println("What would you like to do? (1: Add book, 2: Display books, 3: Display avaiable books, 4: Search by Author, 5: Check a book out, 6: Return a book, 7: Exit)");
            choice = scanner.nextInt();

            //Add book
            if (choice == 1) {
                System.out.println("Enter the book title:");
                String title = scanner.nextLine();
                System.out.println("Enter the book author:");
                String author = scanner.nextLine();
                System.out.println("Enter the book's ISBN:");
                String isbn = scanner.nextLine();
                books.add(new book(title, author, isbn, true));
            }

            //Display all books
            else if (choice == 2){
                int availableCount = 0;
                int bookcount = 0;
                //sort through books and count how many are available and how many total
                for (book book : books) {
                    if (book.getAvailable()) {
                        availableCount++;
                    }
                    bookcount++;
                }
                //display results
                System.out.println("Search Result: " + bookcount + " books, " + availableCount + " available");
                System.out.println("Books in the library:");
                for (book book : books) {
                    book.displayInfo();
                }
            }

            //Display available books
            else if (choice == 3){
                for (book book : books) {
                    if (book.getAvailable()) {
                        book.displayInfo();
                    }
                }
            }

            //Search by author
            else if (choice == 4){
                System.out.println("What author would you like to search?:");
                String authorSearch = scanner.nextLine();
                int availableCount = 0;
                int bookcount = 0;
                //sort through books and count how many are available and how many total
                for (book book : books) {
                    if (book.getAvailable() || book.getAuthor().equals(authorSearch)) {
                        availableCount++;
                    }
                    bookcount++;
                }

                //display results
                System.out.println("Search Result: " + bookcount + " books, " + availableCount + " available");
                for (book book : books) {
                    if (book.getAuthor().equals(authorSearch)) {
                        book.displayInfo();
                    }
                }
            }

            //Check out a book
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
            
            //Return a book
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

            //exit
            else if (choice == 7){
                System.out.println("Goodbye!");
            }

            //bad input
            else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
