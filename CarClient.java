public class CarClient{
	public static void main(String[] args) {
		//main test;
		Car black_p=new Car("Porsche","GTS","black",80700);//initialize black Porsche Cayman GTS
		Car red_t=new Car("Toyota","Corolla","red",19500);//initialize  red Toyota Corolla
		black_p.displayCarInfo();
		red_t.displayCarInfo();
		black_p.travel(5000);
		red_t.travel(5000);
		black_p.setPrice(72000);
		red_t.setPrice(15000);	
		black_p.displayCarInfo();
		red_t.displayCarInfo();
	}
}