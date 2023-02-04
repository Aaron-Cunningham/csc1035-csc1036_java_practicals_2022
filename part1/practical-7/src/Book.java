import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    private final String title, author, genre, publisher;
    private final int numberOfPages;

    public Book(String title, String author, String genre, String publisher, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return "Book:   " + "\n" +
                "Title:           " + title + '\n' +
                "Author:          " + author + '\n' +
                "Genre:           " + genre + '\n' +
                "Publisher:       " + publisher + '\n' +
                "Number of Pages: " + numberOfPages;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Book b1 = new Book("Fake Book","Fake Author","Fake Genre","Fake Publisher ", 250);
        System.out.println(b1);

        File BookCSV = new File(
                Book.class.getResource("books.csv").getFile());

        ArrayList<String> records = new ArrayList<>();
        Scanner s = new Scanner(BookCSV);
        while(s.hasNextLine()){
            records.add(s.nextLine());

        }

        for (String line: records){
            String [] elements = line.split(",");
            Book b = new Book(elements[0], elements[1],elements[2],elements[3], Integer.parseInt(elements[4]));
            System.out.println(b);
        }


    }
}