public class Product {
       private String id;
        private String name;
        private String price;
       private double quantity;

    public Product(String id,String name,String price, Double quantity);{
        this.id= id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;


}

    public java.lang.String getId() {
        return id;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getPrice() {
        return price;
    }

    public void setPrice(java.lang.String price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}