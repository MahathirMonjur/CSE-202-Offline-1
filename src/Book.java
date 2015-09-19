/**
 * Created by User on 15-Sep-15.
 */
public class Book  {
    private String name;
    private Author author;
    private double price;
    private int stock;
    public Book(String name, Author author, double price, int stock)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }
    public Book(String name, Author author)
    {
        this.name = name;
        this.author = author;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setStock(int stock)
    {
        this.stock=stock;
    }
    public String getName()
    {
        return name;
    }
    public Author getAuthor()
    {
        return author;
    }
    public String getAuthorName()
    {
        return author.getName();
    }
    public double getPrice()
    {
        return price;
    }
    public int getStock()
    {
        return stock;
    }
    public void borrowBook(int amount)
    {
        if(stock>=amount)
        {
            stock-=amount;
        }
        else
        {
            System.out.println("Borrowing Amount Exceededs the Current Stock!");
        }
    }
    public void returnBook(int amount)
    {
        stock+=amount;
    }
    public void print()
    {
        System.out.println("Author: "+getAuthorName()+ " Name: "+name+" Price: "+price+ " Stock: "+stock);
    }
    public Book()
    {

    }
}
