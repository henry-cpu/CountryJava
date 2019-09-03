import java.util.*;

public class Country {
	
	protected List<City> list = new ArrayList<City>();
	
	public void add(List<? extends City> listCity) {
		for(City v : listCity)
			list.add(v);
		
		System.out.println("These cities are located in this my country");
		
		for(City v : list)
			System.out.println(v);
		
	}

}
