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
		return new Complex(this.Re - w.Re, this.Im - w.Im);
	}
	
	//(a.Re * a.Im - w.Re * w.Im) + i (a.Re * w.Im + a.Im * w.Re) )
	public Complex times(Complex w) {
	
		double Re = (this.Re*w.Re)-(this.Im*w.Im);
		double Im = (this.Re*w.Im)+(this.Im*w.Re);
		return new Complex(Re,Im);
	}
	 
	 
	 
	 public Complex div(Complex w) 
	 {
		Complex t= w.times(w.conj());
		Complex n = new Complex(1/t.Re,0);
		return this.times(n.times(w.conj()));
	 }
	 
	 
	 
	 public String toString()
	 {
		 if(this.Re<0.001&&this.Re>-0.001&&this.Im<0.001&&this.Im>-0.001)
			 return "0.000";
 
		 if(this.Im<0.001&&this.Im>-0.001)
			 return String.format("%.3f", this.Re);
		 if(this.Re<0.001&&this.Re>-0.001)
			 return String.format("%.3f", this.Im)+"i";
		 return String.format("%.3f", this.Re)+" + "+String.format("%.3f", this.Re)+"i";
	 }
	 
	 
	 public boolean equals(Object o)
	 {
		 String text;
		 
		  text = String.format("%.3f",this.Re);
		 double Re = Double.parseDouble(text);
		
		 text = String.format("%.3f",this.Im );
		 double Im = Double.parseDouble(text);
		  
		 text = String.format("%.3f",((Complex)o).Re );
		 double oRe = Double.parseDouble(text);
		 
		 text = String.format("%.3f",((Complex)o).Im );
		 double oIm = Double.parseDouble(text);
		 

		 
		 
		 if((Re != oRe)||(Im != oIm))
			 return false;
		 return true;
		 
		 
		 
		 
	 }
	 
	/* public Complex power(Complex o)
	 {
		 
		 double p = this.mod();
		 double theta = Math.atan(this.y/this.x);
		 double pPowA2 = Math.pow(p,o.x );
		 double ePow = Math.pow(Math.exp(1),(-1)*o.y*theta);
		 double x = Math.cos(o.y*Math.log(p)+o.y*theta);
		 double y = Math.sin(o.y*Math.log(p)+o.y*theta);
		 
		 Complex t = Complex()
		 
	 }*/
	 
}

