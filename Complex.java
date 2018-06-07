
public class Complex {

	private double Re;
	private double Im;

	public Complex(double Re, double Im) {
		this.Re = Re;
		this.Im = Im;
	}
	
	public double getRe() { //Get real number value
		return this.Re;
	}
	
	public double getIm() { //Get imaginary number value
		return this.Im;
	}
	
	public double mod() { //Distance of point from (0,0) axis
		return Math.sqrt(Math.pow(Re, 2) + Math.pow(Im, 2));
	}
	
	public double arg() { // Argument 
		return Math.atan2(Im, Re);
	}
	
	public Complex conj(){ // a - bi
		return new Complex(Re, -Im);
	}
	
	public Complex plus(Complex w) { // (a1 + a2 + i (b1 + b2))
		return new Complex(w.Re + this.Re, w.Im + this.Im);
	}
	
	public Complex minus(Complex w) { //  (a1 – a2 + i (b1 – b2) )
		return new Complex(w.Re - this.Re, w.Im - this.Im);
	}
	
	//(a.Re * a.Im - w.Re * w.Im) + i (a.Re * w.Im + a.Im * w.Re) )
	public Complex times(Complex w) {
		Complex a = this;
		double Re = a.Re * a.Im - w.Re * w.Im;
		double Im = a.Re * w.Im + a.Im * w.Re;
		return new Complex(Re, Im);
	}
	
	public Complex div(Complex w) {// ((a.Re * a.Im - w.Re * w.Im) + i (a.Re * w.Im + a.Im * w.Re)) / (w.Re^2+ a.Im^2)
		Complex a = this;
		double Re = (a.Re * a.Im + w.Re * w.Im) / (Math.pow(w.Re, 2) + Math.pow(a.Im, 2));
		double Im = (a.Re * w.Im - a.Im * w.Re) / (Math.pow(w.Re, 2) + Math.pow(a.Im, 2));
		return new Complex(Re, Im);
	}
	
	public String toString()
	{
		return String.format("%.3f + %.3fi", this.Re < 0.001 ? 0 : this.Re, this.Im < 0.001 ? 0 : this.Im);
	}
	
	public boolean equals(Object o) {
		Complex w = (Complex) o;
		return this.Re == w.Re && this.Im == w.Im;
	}
}

