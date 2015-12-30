
public class FactoryProducer_ResCategory {
	public static AbstractFactory_RestaurantCategory getFactory(String choice){
		if(choice.equalsIgnoreCase("Menu")){
			return new RestaurantFactory();  
	    }
	      
	    return null;
	}
}
