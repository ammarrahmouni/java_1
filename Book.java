package books;
public class Book{
    public String name;
    public String author;
    public int pubdate;
    public int last_page_number;
    public int current_page;
    public boolean is_open;

    public Book(String n, String a, int pdate, int lpage)
    {
        this.name = n;
        this.author = a;
        this.pubdate = pdate;
        this.last_page_number = lpage;
        this.is_open = false;
    }
    public void PrintBookInfo()
    {
        System.out.println("Books Name: " + this.name);
        System.out.println("Books author: " + this.author);
        System.out.println("Page Count: " + this.last_page_number);
        System.out.println("Books pubdate: " + this.pubdate);
    }
    public boolean MoveToPage(int page)
    {
        if(!is_open)
            return false;
        if(page > last_page_number || page < 1)
            return false;
        this.current_page = page;
            return true;
    }
    public void OpenBook()
    {
        if(is_open)
        {
            System.out.println("is open");
        }
        else
        this.is_open = true;
    }
    public void CloseBook()
    {
        if(is_open)
        {
           this.is_open = false;
        }
        else
        System.out.println("is closed");
    }
}