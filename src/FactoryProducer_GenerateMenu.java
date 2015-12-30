
public class FactoryProducer_GenerateMenu {
	public static AbstractFactory_MenuGenerator getFactory(String choice){
		if(choice.equalsIgnoreCase("Format")){
			return new GenerateMenuFactory();  
	    }
	      
	    return null;
	}
}
