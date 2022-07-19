package constructor;

public class ConstrructorClass {
	int i;
	String name;
	String value;
	
	//Required Args Constructor
	public ConstrructorClass(int i, String name) {
		
	}	
	
	//All Argument Constructor
	public ConstrructorClass(int i, String name, String value) {
		this.i = i;
		this.name = name;
		this.value = value;
	}


	// No Args Constructor
	public ConstrructorClass() {
		this.i=0;
		this.name="";
	}
	
	public ConstrructorClass(ConstrructorClass constrructorClass) {
		this.i=constrructorClass.i;
		this.name="";
	}
	
	// No Argumement constructor
	// ConstrructorClass()
	
	// Paramterized constructor.
	public void printNum() {
		System.out.println("Hii");
	}
	
	

}
