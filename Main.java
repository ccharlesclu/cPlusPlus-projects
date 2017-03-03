package imaginaryNumberCalc;

public class Main {

	public static void main(String[] args) {

		ComplexNumber c0 = new ComplexNumber(1,2);
		ComplexNumber c1 = new ComplexNumber(3,4);
		ComplexNumber c2 = new ComplexNumber(c0);
		
		System.out.println("c0: " + c0);
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		c2.setR(-1);
		c2.setI(0);
		System.out.println("c2: setR = -1, setI = 0");
		System.out.println("c2: getR: " + c2.getR() + ", getI: " + c2.getI());
		System.out.println("c0 add c1: " + c0.add(c1));
		System.out.println("c0 sub c1: " + c0.sub(c1));
		System.out.println("c0 mult c1: " + c0.mult(c1));
		System.out.println("c1 div c0: " + c1.div(c0));
		System.out.println("c0 mag: " + c0.mag());
		System.out.println("c0 conj " + c0.conj());
		System.out.println("c0 sqrt: " + c0.sqrt());
		System.out.println("c0 equals c1: " + c0.equals(c1));
	}

}