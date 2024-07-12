package sec02.exam01;

public class DriverExam {

	public static void main(String[] args) {

		Avante avante = new Avante();
		Car car = (Car)avante;
		
		Driver driver = new Driver();
		driver.run(car);
		
		Spark spark = new Spark();
		driver.run(spark);
	}

}
