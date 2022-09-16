import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {


    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product book1 = new Book(1, "The time mashine", 450, "Wells");
    Product smartphone1 = new Smartphone(3, "Samsung", 21_999, "Korea");
    Product book2 = new Book(2, "Robin Hood", 300, "Milne");
    Product smartphone2 = new Smartphone(4,"Xiaomi", 18_000, "China");

    @BeforeEach
    public void setup() {
        manager.add(book1);
        manager.add(smartphone1);
        manager.add(book2);

    }

    @Test
    public void sholdRemoveById() {

        repo.removeById(3);

        Product[] expected = {book1, book2};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }



}
