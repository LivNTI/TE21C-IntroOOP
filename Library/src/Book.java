import java.sql.SQLOutput;
import java.util.Scanner;

public class Book {
    // Attribute
    private int pages;
    private String title;
    private int weight;
    private String colour;

    // Constructor
    public Book(){
        start();
    }

    // Methods
    public void start(){
        Scanner scan= new Scanner(System.in);

        System.out.print("what is the title: ");
        String title= scan.nextLine();
        this.title= title;

    }

    //Getters & Setters

    public String getTitle() {
        return title;
    }
}
