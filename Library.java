import java.util.*;

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully!");
    }

    void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            System.out.println(i + ". " + b.title + " | " + b.author + " | Issued: " + b.isIssued);
        }
    }

    void searchBook(String title) {
        boolean found = false;

        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                System.out.println("Found: " + b.title + " by " + b.author + " | Issued: " + b.isIssued);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    void issueBook(int index) {
        // ✅ index safety check
        if (index < 0 || index >= books.size()) {
            System.out.println("Invalid index!");
            return;
        }

        Book b = books.get(index);

        if (!b.isIssued) {
            b.isIssued = true;
            System.out.println("Book issued.");
        } else {
            System.out.println("Book already issued.");
        }
    }

    void returnBook(int index) {
        // ✅ index safety check
        if (index < 0 || index >= books.size()) {
            System.out.println("Invalid index!");
            return;
        }

        Book b = books.get(index);

        if (b.isIssued) {
            b.isIssued = false;
            System.out.println("Book returned.");
        } else {
            System.out.println("Book was not issued.");
        }
    }
}
