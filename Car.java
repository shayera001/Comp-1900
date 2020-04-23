public class Car{
	private String make;
	private String model;
	private String color;
	private double price;
	private double mileage;

	public Car(){
		//set to zero with nothing input;
		this("default make","default model","default color",0);
	}
	public Car(String make, String model,String color, int price){
		//with all parameters input;
		this.make=make;
		this.model=model;
		this.color=color;
		this.price=price;
		this.mileage=0;

	}
	public void setPrice(double p){
        price=p;
		System.out.println("price is "+p+" $");

	}
	public void paint(String c){
		color=c;
		System.out.println("it is no painted as "+c);

	}
	public void displayCarInfo(){
		System.out.println("it is a " +make+" "+model+" "+color+" "+"with "+price+"$ "+mileage+" mileage travelled");

	}
	public void travel(double distance){
		mileage=distance;
		System.out.println("the car travelled " +distance+" mileage");
	}
}