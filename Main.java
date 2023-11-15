class Main {
  public static void main(String[] args) {
    Store item1 = new Store("The Wizard of Oz", 10);
    System.out.println(item1.getProduct());//since get product returns as a string we will need to use a print statement

    Book item2 = new Book("A Clockwork Orange", 15, 1962, "Anthony Burgess");
    System.out.println("\n" + item2.getProduct() + "\n" + item2.getInfo());//Book inherites all methods of 

    Movie item3 = new Movie("The Lego Movie", 20, 2016, "Phil Lord & Chris Miller", 8.2);
    System.out.println("\n" + item3.getProduct() + "\n" + item3.getInfo());

    GraphicNovel item4 = new GraphicNovel("Watchmen", 25, 1987, "Alan Moore","Dave Gibbon" );
    System.out.println("\n" + item4.getProduct() + "\n" + item4.getInfo());

    Store item5 = new Book("Pride and Prejudice", 25, 1797, "Jane Austenm");//Store is my parent class, and Book is my child class 
    Book pP = (Book)item5;//Through this we were able to downcast the variables of item5
    System.out.println("\n" + pP.getProduct() + "\n" + pP.getInfo());//By downcasting, we were able to get the child method to work easily
    
    }
}