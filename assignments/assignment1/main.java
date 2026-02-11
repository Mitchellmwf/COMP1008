package assignments.assignment1;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<book> books = new ArrayList<>();
        int choice = 0;
        //test books
        books.add(new book("IT", "Steven King", "9780743273565", true));
        books.add(new book("Harry Potter", "JK Rowling", "9780061120084", true));
        books.add(new book("1984", "George Orwell", "9780451524935", true));

        //Menu
        while (choice != 7) {
            System.out.println("What would you like to do? (1: Add book, 2: Display books, 3: Display avaiable books, 4: Search by Author, 5: Check a book out, 6: Return a book, 7: Exit)");
            choice = scanner.nextInt();

            //Add book
            if (choice == 1) {
                String title = "";
                while (title.isEmpty()) {
                    System.out.println("Enter the book title:");
                    title = scanner.nextLine();
                }
                String author = "";
                while (author.isEmpty()) {
                    System.out.println("Enter the book author:");
                    author = scanner.nextLine();
                }
                String isbn = "";
                while (isbn.isEmpty() || isbn.length() != 13) {
                    System.out.println("Enter the book's ISBN (13 characters):");
                    isbn = scanner.nextLine();
                }
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
                while (authorSearch.isEmpty()) {
                    System.out.println("Author cannot be empty, please enter an author:");
                    authorSearch = scanner.nextLine();
                }
                int availableCount = 0;
                //sort through books and count how many are available and how many total
                for (book book : books) {
                    if (book.getAuthor().equals(authorSearch)) {
                        availableCount++;
                    }
                }

                //display results
                if (availableCount == 0) {
                    System.out.println("No books found by that author.");
                    continue;
                }

                System.out.println("Search Result: " + availableCount + " available");
                for (book book : books) {
                    if (book.getAuthor().equals(authorSearch)) {
                        book.displayInfo();
                    }
                }
            }

            //Check out a book
            else if (choice == 5){
                System.out.println("Which book would you like to check out?:");
                String titleSearch = scanner.nextLine();
                while (titleSearch.isEmpty()) {
                    System.out.println("Title cannot be empty, please enter a title:");
                    titleSearch = scanner.nextLine();
                }
                boolean found = false;
                for (book book : books) {
                    if (book.getTitle().equals(titleSearch)) {
                        if (book.getAvailable()) {
                            book.setAvailable(false);
                            found = true;
                            System.out.println("Enjoy your book!");
                        } else {
                            System.out.println("This book is currently unavailable.");
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found.");
                    }
                }
            }
            
            //Return a book
            else if (choice == 6){
                System.out.println("What book are you returning?:");
                String title = scanner.nextLine();
                while (title.isEmpty()) {
                    System.out.println("Title cannot be empty, please enter a title:");
                    title = scanner.nextLine();
                }
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
