package imaginaryNumberCalc;

public class PolarNumber extends ComplexNumber{
	
	public PolarNumber(){};
	
	public PolarNumber(double r, double i){
		re = r;
		im = i;
	};
	
	public PolarNumber(PolarNumber cn){
		this.re = cn.re;
		this.im = cn.im;
	};
	
	public PolarNumber(ComplexNumber cn){
		this.re = cn.re;
		this.im = cn.im;
	};
	
	public void finalize(){};
	
	public void setR(double r){
		super.re = r;
	};
	
	public void setI(double i){
		super.im = i;
	};

	public double getRadius(){
		return Math.sqrt((re*re)+(im*im));
	};
	
	public double getTheta(){
		return Math.atan2(im, re);
	}
	
	public String toString(){
		double r = this.getRadius();
		double t = this.getTheta();
		return r + "(cos(" + t + ") + isin(" + t + "))";
	}
	
	PolarNumber mult(PolarNumber rhs){
		double r1 = this.getRadius(), t1 = this.getTheta(), r2 = rhs.getRadius(), t2 = rhs.getTheta();
		double r = r1*r2;
		double t = t1*t2;
		return new PolarNumber(r, t);
	}
	
	PolarNumber div(PolarNumber rhs){
		double r1 = this.getRadius(), t1 = this.getTheta(), r2 = rhs.getRadius(), t2 = rhs.getTheta();
		double r = r1/r2;
		double t = t1 - t2;
		if (Math.abs(r2) < .00001) return new PolarNumber(0,0);
		return new PolarNumber(r, t);
	}
	
	boolean equals(PolarNumber rhs){
		return super.equals(rhs);
	}
}
