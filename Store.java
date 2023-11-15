//This is going to be the SuperClass
class Store
  {
    private String title;
    private int price;
    public Store(String t, int p)
      {
        title = t;
        price = p;
      }
    public String getProduct()//This will print out everything that the user has given in Store object
      {
        return "Title: " + title + "\n Price: $" + price;
      }
    
  }