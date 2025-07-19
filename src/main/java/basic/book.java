package basic;

public class book {

    private String title;
    private String author;

    public book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        book mybook = new book("The Alchemist", "Paulo Coelho");
        mybook.displayInfo();
    }
}
