package books;
public class Exirsice5{
    public static void main(String[] args){
    Book Davinchi_book = new Book("Davinchi", "Dan Braown", 2005, 500);
    Book The_Man_book = new Book("The Man", "Ammar Rahmouni", 2019, 250);

    Davinchi_book.OpenBook();
    Davinchi_book.MoveToPage(50);
    Davinchi_book.PrintBookInfo();
    Davinchi_book.CloseBook();
    System.out.println("--------------");
    The_Man_book.OpenBook();
    The_Man_book.MoveToPage(40);
    The_Man_book.PrintBookInfo();
    The_Man_book.CloseBook();
    }
}