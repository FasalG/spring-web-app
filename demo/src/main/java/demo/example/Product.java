package demo.example;

public class Product {
	
	private int id;
	private String name;
	
	//default constructor
	public Product() {
		super();
		System.out.println("Default Constructor");
	}

	//Parameterised constructors
	public Product(int id) {
		super();
		this.id = id;
	}

	public Product(String name) {
		super();
		this.name = name;
	}
	
	
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	void product_details() {
		System.out.println(this.id + " " + this.name);
	}
	

}
