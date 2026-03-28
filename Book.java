class Book {
    String title;
    String author;
    boolean isIssued;

    // Constructor
    public Book(String title, String author, boolean isIssued) {
        this.title = title;
        this.author = author;
        this.isIssued = isIssued;
    }

    // Display format (for console)
    public void display(int index) {
        System.out.println(index + ". " + title + " | " + author + " | Issued: " + isIssued);
    }

    // Convert object to file format
    @Override
    public String toString() {
        return title + "," + author + "," + isIssued;
    }

    // Create object from file data
    public static Book fromString(String data) {
        String[] parts = data.split(",");
        return new Book(parts[0], parts[1], Boolean.parseBoolean(parts[2]));
    }
}
