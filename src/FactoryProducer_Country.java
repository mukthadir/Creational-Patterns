
public class FactoryProducer_Country {
	public static AbstractFactory_Country getFactory(String choice){
		if(choice.equalsIgnoreCase("country")){
			return new CountryFactory();  
	    }
	      
	    return null;
	}
}
