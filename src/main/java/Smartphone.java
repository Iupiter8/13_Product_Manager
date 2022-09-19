public class Smartphone extends Product {

    private String maker;

    public Smartphone(int id, String name, int price, String maker)  {
        super(id, name, price);
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    @Override
    public boolean matches(Product product, String search) {

        if (super.matches(product, search)) {
            return true;
        }

        if (getMaker().contains(search)) {
            return true;
        }

        return false;



    }
//
//    public void setMaker(String maker) {
//        this.maker = maker;
//    }



}
