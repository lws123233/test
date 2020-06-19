package week;


public class Product {
     private String id;
     private String name;
     private String price;
     private String comment;
	public Product(String id, String name, String price, String comment) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.comment = comment;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", comment=" + comment + "]";
	}
     
}
