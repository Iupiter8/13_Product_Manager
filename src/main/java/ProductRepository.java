public class ProductRepository {


    private Product[] products = new Product[0];

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public void removeById(int id) {
        Product[] tpm = new Product[products.length - 1];
        int copyToIndex = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tpm[copyToIndex] = product;
                copyToIndex++;
            }
        }
        products = tpm;
    }
    public Product[] findAll(){
        return products;
    }


}
