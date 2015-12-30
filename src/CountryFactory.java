
public class CountryFactory extends AbstractFactory_Country {
	public ReaderInterface identifyCountry(String country){
		if(country == null){
			return null;
	    }
		else if (country.equalsIgnoreCase ("GB")){
			return new ReadXMLFile_UK ();
		}
		else if (country.equalsIgnoreCase("US") ){
		return new ReadJsonFile_US ();
		}
		return null;
	}
}
