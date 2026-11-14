class Product
{
    private int id;
    private int quantity;
    private int price;
    private String name;

    // Parameterized constructor
    public Product(int id, int quantity, int price, String name) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    // Copy constructor
    public Product(Product other) {
        this.id = other.id;
        this.quantity = other.quantity;
        this.price = other.price;
        this.name = other.name;
    }

    // Static method: returns the more expensive product among the two
    public static Product getExpensive(Product a, Product b) {
        if (a.price >= b.price)
            return a;
        return b;
    }

    // Instance method: compares 'this' with the given product
    public Product getExpensive(Product other) {
        if (this.price >= other.price)
            return this;
        return other;
    }

    // Checks whether the product's name equals the given name
    public boolean equalName(String name) {
        return this.name.equals(name);
    }
}

class MainClass
{
	public static void main(String []args) {
		Product p1 = new Product(101,20,200,"Gourmet");
		Product p2 = new Product(p1);
		Product p3 = new Product(102,20,2500,"Shampoo");
		Product exp = Product.getExpensive(p1, p2);
		Product exp2 =p1.getExpensive(p2);
		if(p3.equalName("Oil"))
			System.out.println("OIL");
	}
}