
class PopulationException extends Exception{
	
	public PopulationException(int popu) {
		
		System.out.println("you try to create a City with negativ number of Population");
		System.out.println(popu + " inhabitants");
		
	}

}
