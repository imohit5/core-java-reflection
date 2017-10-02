package reflection;

@CustomDemo(value1 = "123", value2 = "345")
public class TwoNumbers {

	private Double num1;
	private Double num2;

	public TwoNumbers() {
		System.out.println("Inside Default Constructor");
	}

	public TwoNumbers(Double num1, Double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public Double getNum1() {
		return num1;
	}

	public void setNum1(Double num1) {
		this.num1 = num1;
	}

	public Double getNum2() {
		return num2;
	}

	public void setNum2(Double num2) {
		this.num2 = num2;
	}
	
	public Double sum(Double num1, Double num2) {
		return num1+num2;
	}

}
