import java.util.ArrayList;

public class LibMain {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ArrayList<Book> books= new ArrayList<Book>();

        int noBooks= 4;
        for (int i=0; i<noBooks; i++) {
            books.add(new Book());
        }

        for (Book myBook: books) {
            System.out.println(myBook.getTitle());

        }




        /*
        //create an arrayList of integers
        ArrayList<Integer> intArr= new ArrayList<Integer>();

        for (int i =0; i<15; i++){
            intArr.add(i+100);
        }


        for (int i =0; i<15; i++) {
            System.out.println(intArr.get(i));
        }

         */




    }
}