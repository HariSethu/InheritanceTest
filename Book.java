//Book will inherit all the methods and instance of Store
class Book extends Store
  {
    private String author;
    private int year;
    //super will take title and price and send that to the superclass which in this code is Store   
    public Book(String t, int p, int y, String a)
    {
      super(t, p);
      author = a;
      year = y;
    }
    
    public String getInfo()
    {
      return "Author: " + author + "\n Year: " + year;
    }
    
  }