class GraphicNovel extends Book
  {
    private String illustrator;
    
    //super will take title, price, year, and author and send that to the subclass which in this code is Book
    public GraphicNovel(String t, int p, int y, String a, String i)
    {
      super(t, p, y, a);
      illustrator = i;

    }
    public String getInfo()
    {
      String output = super.getInfo();
      return output + "\nIllustrator: " + illustrator;
    } 
  }