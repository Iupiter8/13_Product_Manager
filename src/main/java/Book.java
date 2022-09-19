public class Book extends Product {

    private String author;

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public boolean matches(Product product, String search) {
        if (super.matches(product, search)) {
            return true;
        }

        if (getAuthor().contains(search)) {
            return true;
        }

        return false;
    }

//
//    public void setAuthor(String author) {
//        this.author = author;
//    }



}
