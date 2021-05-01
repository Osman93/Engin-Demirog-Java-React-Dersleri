
public class Product {
	private int id;
	private Category category;
	private String name;
	private double unitPrice;
	private String details;
	private double discount;
	
	public Product() {
		System.out.println("Product Yapıcı çalıştı");
	}
	
	public Product(int id,Category category,String name,
			double unitPrice,String details,double discount) {
		this();
		
		System.out.println("Product Class Yapıcısı oluşturuldu" + id);
		this.id = id;
		this.category = category;
		this.name = name;
		this.unitPrice = unitPrice;
		this.details = details;
		this.discount = discount;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return unitPrice - (unitPrice * discount) / 100;
	}
	
	
}
