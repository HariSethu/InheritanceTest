class Movie extends Store
  {
    private String director;
    private double rating;
    private int year;

    ////super will take title, prrice and send that to the superclass which in this code is Store
    public Movie(String t, int p, int y, String d, double r)
    {
      super(t, p); 
      director = d;
      year = y;
      rating = r;
    }
    public String getInfo()
    {
      return "Director: " + director + "\n Year: " + year + String.format("\n Rating: %.2f", rating);
    }
     
  }