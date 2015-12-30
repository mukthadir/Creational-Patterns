
public class RestaurantFactory extends AbstractFactory_RestaurantCategory{
	public MenuCreatorInterface identifyMenuCategory(String restCategory){
		if(restCategory == null){
			return null;
	    }
		else if (restCategory.equalsIgnoreCase ("Diner")){
			return new RestaurantCategoryDiner ();
		}
		else if (restCategory.equalsIgnoreCase("Evening Only") ){
		return new RestaurantCategoryEvening ();
		}
		else if (restCategory.equalsIgnoreCase("All Day") ){
			return new RestaurantCategoryAll ();
			}
		return null;		
	}
}
