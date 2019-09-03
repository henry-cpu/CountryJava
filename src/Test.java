import java.util.*;

public class Test {

	public static void main(String[] args) {

		String[] tab1 = {"Yaounde", "Brazzaville", "Lagos", "Abidjan", "Dakar", "Rabat"};
		int[] tab2 = {123456, 78456, 434551, 75832165, 90586, 24};

		City city[] = new City[6];
		
//		City cany = new City();
//		List tab = new ArrayList();
//		tab.add(12);
//		tab.add("sud");
//		tab.add(cany);
		
		List tableau = new LinkedList();
//		List<City> tabCity = new ArrayList<City>();
//		List<Capital> tabCap = new ArrayList<Capital>();
		City texas = new City();
		
		
		
		

		for(int i = 0; i < city.length; i++) {

			if(i < 3) {
				try {
					city[i] = new Capital(tab1[i], tab2[i], "Cameroon", "reunification");
				}catch (PopulationException | CityNameException e) {
					System.out.println(e.getMessage());
				}finally {
					if(city[i] == null)
						city[i] = new City();
				}
			}

			else {
				try {
					city[i] = new City(tab1[i], tab2[i], "Cameroon");
				}catch (PopulationException | CityNameException e) {
					System.out.println(e.getMessage());
				}finally {
					if(city[i] == null)
						city[i] = new Capital();
				}


			}
			
			tableau.add(city[i]);
	

		}
		
		
		
		System.out.println("-----------------------");
		System.out.println("-----------------------");
		
		
		zeigerS(tableau);
		
		System.out.println("-----------------------");
		System.out.println("-----------------------");



		for(Object s : city)	
			//gleich System.out.println(s)
			System.out.println(s.toString() + "\n");
		//		
		System.out.println("-----------------------");

		City cool = null;

		try{

			cool = new City("cool", 2584, "coolLand");

		}catch(PopulationException | CityNameException e){
			System.out.println(e.getMessage());
		}
		//		}catch(PopulationException e) {
		//			e.printStackTrace();
		//			
		//		}catch (CityNameException e2) {
		//			e2.printStackTrace();
		//			System.out.println(e2.getMessage());
		//			
		//		}
		finally {
			if(cool == null)
				cool = new City();
		}

		System.out.println(cool.toString());

	}
	
	
	static void zeiger(List<? extends City> list) {
		for(City v: list)
			System.out.println(v);
		
	}

	static void zeigerS(List<? super City> list) {
		for(Object c: list)
			System.out.println(c);
		
	}
}
