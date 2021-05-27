package AmazonImplementation;

public class Search {
	
	// creating a  method that  display the products
	
	public String displayProduct(Product product) {
		
	if (product.getProductList().contains(product.getProductName())) {
		
		return product.getProductName();
	}
	return null;	
	}

}
