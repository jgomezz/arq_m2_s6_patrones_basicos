package pe.edu.tecsup.patrones._1_creacional.builder;

public class Application {

    public static void main(String[] args) {

        Product laptop = Product.builder()
                .name("Laptop HP")
                .price(1500.00)
                .stock(10)
                .build();

        Product smartphone = new Product("Smartphone Samsung", 800.00, 25);


    }
}
