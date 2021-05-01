
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("java");
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Elektronik";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Elektronik 2";
		
		Product product1 = new Product(1,category1,"Lenovo v14",3499.9,"4gb ram",15);	
		Product product2 = new Product(2,category2,"Lenovo v15",6488.99,"16gb ram",10);
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setName("Huawei 12");
		product3.setUnitPrice(10000);
		product3.setDetails("32 GB RAM");
		product3.setCategory(category1);
		product3.setDiscount(10);
		
		Product[] products = { 
				product1,
				product2,
				product3
		};
		System.out.println(products.length);
		
		for(Product product : products) {
			System.out.println("id = " + product.getId());
			System.out.println("Name = " + product.getName());
			System.out.println("Price = " + product.getUnitPrice());
			System.out.println("Details = " + product.getDetails());
			System.out.println("Category = " + product.getCategory().name);
			System.out.println("Discount = " + product.getDiscount());
			System.out.println("Unit Price After Discount = " + product.getUnitPriceAfterDiscount());
			System.out.println("");
			
		}
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
	}

}
