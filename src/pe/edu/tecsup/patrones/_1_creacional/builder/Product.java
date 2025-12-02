package pe.edu.tecsup.patrones._1_creacional.builder;

public class Product {

    private String name;
    private Double price;
    private Integer stock;

    Product(String name, Double price, Integer stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.stock = builder.stock;
    }

    public String getName() { return name; }
    public Double getPrice() { return price; }
    public Integer getStock() { return stock; }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public static class ProductBuilder {
        private String name;
        private Double price;
        private Integer stock;

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder price(Double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder stock(Integer stock) {
            this.stock = stock;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}