package imaginaryNumberCalc;
import java.lang.Math;

public class ComplexNumber {
	
	protected double re, im;
	
	public ComplexNumber(){};
	
	public ComplexNumber(double _r, double _i){
		re = _r;
		im = _i;
	};
	
	public ComplexNumber(ComplexNumber rhs){
		re = rhs.re;
		im = rhs.im;
	};
	
	public void finalize(){};
	
	public void setR(double r){
		re = r;
	};
	
	public void setI(double i){
		im = i;
	};
	
	public double getR(){
		return re;
	};
	
	public double getI(){
		return im;
	};
	
	public String toString(){
		/*if(im == 0) return re + "";
		if(re == 0) return im + "";*/
		if(im < 0) return re + " - " + (-im) + "i";
		return re + " + " + im + "i";
	};
	
	ComplexNumber add(ComplexNumber rhs){
		return new ComplexNumber (this.re + rhs.re, this.im + rhs.im);
	};
	
	ComplexNumber sub(ComplexNumber rhs){
		return new ComplexNumber(this.re - rhs.re, this.im - rhs.im);
	};
		
	ComplexNumber mult(ComplexNumber rhs){
		double a = this.re, b = this.im, c = rhs.re, d = rhs.im;
		return new ComplexNumber(((a*c)-(b*d)), ((a*d) + b*c));
	};
	
	ComplexNumber div(ComplexNumber rhs){
		double a = this.re, b = this.im, c = rhs.re, d = rhs.im;
		double div = (c*c)+(d*d);
		if (Math.abs(div) < .00001) return new ComplexNumber(0,0); 
		return new ComplexNumber((((a*c) + (b*d))/(div)), (((b*c) - (a*d))/(div)));
	};
	
	public double mag(){
		return Math.hypot(re, im);		
	};
	
	ComplexNumber conj(){
		return new ComplexNumber(re, -im);
	};
	
	ComplexNumber sqrt(){
		
		double a = this.re, b = this.im;
		double top = Math.sqrt((a*a)+(b*b));
		
		if (b == 0)
			if (a >= 0) return new ComplexNumber(
					Math.sqrt(a), 0				
					);
			else return new ComplexNumber(0, Math.sqrt(-a));
		
		return new ComplexNumber(
				Math.sqrt((a+top)/2),
				Math.sqrt((-a+top)/2)
			);
		
		/*
		double a = this.re, b = this.im;
		// This seems to be fine, but...
		if (1 > b && b < 1 && a >= 0.0) return new ComplexNumber(
				Math.sqrt(a), 0
				);
		// I don't think this part is working
		if (1 > b && b < 1 && a < 0.0) return new ComplexNumber(
				0, Math.sqrt(-a)
				);
		return new ComplexNumber(
				Math.sqrt((a + Math.sqrt((a*a) + (b*b)))/2), 
				Math.sqrt((-a + Math.sqrt((a*a) + (b*b)))/2)
				);
				*/
	};
	
	public boolean equals(ComplexNumber rhs){
		double a = this.re, b = this.im, c = rhs.re, d = rhs.im;
		if (a == c && b == d) return true;
		return false;
	};
}