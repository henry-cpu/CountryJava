import java.util.*;

/**
 * @author harol
 *
 */
public class City {

	// variable instance

	protected String cityName;
	protected int population;
	protected String countryName;
	protected char category;

	// variable class

	public static int counter1;
	protected static int counter2;



	public City(){
//		System.out.println("creation of a city");
		cityName = "Unknow";
		population = 0;
		countryName = "Unknow";
		this.setCategory();

		counter1++;
		counter2++;

	}

	public City(String city, int popu, String country) throws PopulationException, CityNameException{


		if(popu < 0) {		
			throw new PopulationException(popu);

		}if(city.length() < 3){
			
			throw new CityNameException("the name of the city is under 3 letters! Name = " + city);
		}else {
//			System.out.println("creation of a city with parameter");
			cityName = city;
			population = popu;
			countryName = country;
			this.setCategory();

			counter1++;
			counter2++;

		}

	}





	// getters

	public String getCityName() {

		return cityName;
	}
	public int getPopulation() {

		return population;
	}
	public String getCountryName() {

		return countryName;
	}
	public char getCategory() {

		return category;
	}
	public static int getCounter2() {

		return counter2;
	}

	// setters

	public void setCityName(String city) {

		cityName = city;
	}
	public void setPopulation(int popu) {

		population = popu;
		this.setCategory();
	}
	public void setCountryName(String country) {

		countryName = country;
	}
	/**
	 * 
	 */
	private void setCategory() {

		int inhabitant[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char catg[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

		int i = 0;

		while(i < inhabitant.length && this.population > inhabitant[i])
			i++;

		category = catg[i];

	}

	// methode

	public String toString(){

		return (cityName + " is a city of " + countryName + " with " + population + " inhabitants (category = " + this.category + ")");
	}

	public String comparaison(City city) {

		String str = new String();

		if(city.getPopulation() > this.getPopulation())
			str = (city.getCityName() + " is more populated than " + this.cityName);
		else
			str = (this.cityName + " is more populated than " + city.getCityName());



		return str;
	}


	//	@Override
	//	public int hashCode() {
	//		final int prime = 31;
	//		int result = 1;
	//		result = prime * result + category;
	//		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
	//		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
	//		result = prime * result + population;
	//		return result;
	//	}

	// methode hash de la classe java.util.Objects (doit etre importer)

	public int hashCode() {

		return Objects.hash(category, population, countryName ,cityName);
	}


	//	@Override
	//	public boolean equals(Object obj) {
	//		if (this == obj)
	//			return true;
	//		if (obj == null)
	//			
	//			return false;
	//		if (getClass() != obj.getClass())
	//			return false;
	//		City other = (City) obj;
	//		if (category != other.category)
	//			return false;
	//		if (cityName == null) {
	//			if (other.cityName != null)
	//				return false;
	//		} else if (!cityName.equals(other.cityName))
	//			return false;
	//		if (countryName == null) {
	//			if (other.countryName != null)
	//				return false;
	//		} else if (!countryName.equals(other.countryName))
	//			return false;
	//		if (population != other.population)
	//			return false;
	//		return true;
	//	}

	// methode equals de la classe java.util.Objects (doit etre importer)

	public boolean equals(Object obj) {
		// on verifie si ils sont gleich
		if(obj == this) {

			return true;
		}
		// on s'assure qu'ils sont du meme type
		if(obj.getClass() != this.getClass()) {

			return false;
		}

		// on compare les attributs
		City other = (City) obj ;

		return Objects.equals(other.category, this.category) && Objects.equals(other.cityName, this.cityName) 
				&& Objects.equals(other.population, this.population) && Objects.equals(other.countryName, this.countryName);


	}


}






















