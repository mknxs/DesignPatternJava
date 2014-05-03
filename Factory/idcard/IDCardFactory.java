package idcard;
import framework.*;

public class IDCardFactory extends Factory {

	private List<Product> owners = new ArrayList<Product>();
	
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}
	
	protected void registerProduct(Product product) {
		owners.add(product);
	}
	
	public List<Product> getOwners() {
		return owners;
	}
}
