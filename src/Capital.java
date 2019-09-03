
public class Capital extends City{
	
	private String monument;
	
	public Capital() {
		
		super();
		monument = "Nothing";
		
	}
	public Capital(String city, int popu, String country, String monu) throws PopulationException, CityNameException{
		
		super(city, popu, country);
		this.monument = monu;
				
//		if(popu < 0) {
//			
//		}else {
//			
//			
//		}
		
		
	}
	//getters
	
	public String getMonument() {
		
		return monument;
	}
	
	// setters
	
	public void setMonument(String monu) {
		
		monument = monu;
	}
	// methode
	
	public String toString() {
		
		return (super.toString() + "\n \t ==> " + this.monument + " his is monument");
	}

}
