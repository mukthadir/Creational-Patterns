
public class RestaurantCategoryDiner implements MenuCreatorInterface {
	public ReturnDetails getFoodItemCategory(ReturnAllDetails details){
	
		String [] category = details.getCategory();

		int j = 0;
		while(category[j]!=null){
			if((category[j].equals("Dinner")||category[j].equals("Side Dish"))){
				category[j] = "Not Needed";
			}
			j++;
		}
		String [] country = details.getCountry();
		String [] ID = details.getID();
		String [] name = details.getName();
		String [] description = details.getDescription();
		String [] price = details.getPrice();
		
		return new ReturnDetails(country, ID, name, description, category, price);
		
//		if(!(details.getCategory().equals("Dinner")||details.getCategory().equals("Side Dish"))){
//			String [] country = details.getCountry();
//			String [] ID = details.getID();
//			String [] name = details.getName();
//			String [] description = details.getDescription();
//			String [] price = details.getPrice();
//			
//			return new ReturnDetails(country, ID, name, description, category, price);
//		}else{
//			return null;
//		}
	}
}
