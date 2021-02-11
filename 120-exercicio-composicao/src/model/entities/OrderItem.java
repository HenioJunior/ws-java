package model.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public Double subTotal(){
        return price * quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String toString(){
      StringBuilder sb = new StringBuilder();
      sb.append(product.getName());
      sb.append(", $");
      sb.append(price + "%.2f");
      sb.append(", Quantity: ");
      sb.append(quantity);
      sb.append(", Subtotal: $");
      sb.append(subTotal() + "%.2f");
        return sb.toString();
    }
}
