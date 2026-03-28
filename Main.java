import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        // Load books
        lib.books = FileHandler.loadBooks();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");

            int choice;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // consume newline
            } else {
                System.out.println("Invalid input!");
                sc.nextLine();
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    lib.addBook(new Book(title, author, false));
                    break;

                case 2:
                    lib.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter title: ");
                    lib.searchBook(sc.nextLine());
                    break;

                case 4:
                    lib.viewBooks();
                    System.out.print("Enter index: ");
                    int issueIndex = sc.nextInt();

                    if (issueIndex >= 0 && issueIndex < lib.books.size()) {
                        lib.issueBook(issueIndex);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    lib.viewBooks();
                    System.out.print("Enter index: ");
                    int returnIndex = sc.nextInt();

                    if (returnIndex >= 0 && returnIndex < lib.books.size()) {
                        lib.returnBook(returnIndex);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 6:
                    FileHandler.saveBooks(lib.books);
                    System.out.println("Data saved. Exiting...");
                    sc.close();   // ✅ properly closed
                    return;       // exits program

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
