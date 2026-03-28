import java.io.*;
import java.util.*;

class FileHandler {

    static void saveBooks(ArrayList<Book> books) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("data/books.txt"))) {
            for (Book b : books) {
                pw.println(b.toString());
            }
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    static ArrayList<Book> loadBooks() {
        ArrayList<Book> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data/books.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                list.add(new Book(parts[0], parts[1], Boolean.parseBoolean(parts[2])));
            }
        } catch (IOException e) {
            System.out.println("No previous data found.");
        }
        return list;
    }
}
