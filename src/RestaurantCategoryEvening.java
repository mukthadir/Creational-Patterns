
public class RestaurantCategoryEvening implements MenuCreatorInterface {
	public ReturnDetails getFoodItemCategory(ReturnAllDetails details){
		
		String [] category = details.getCategory();
		
		int j = 0;
		while(category[j]!=null){
			if((category[j].equals("Breakfast")||category[j].equals("Snack")||category[j].equals("Lunch"))){
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
	}			
		
//		if((details.getCategory().equals("Appetizer")||details.getCategory().equals("Dinner")||details.getCategory().equals("Dessert")||details.getCategory().equals("Side Dish"))){
//			String [] country = details.getCountry();
//			String [] ID = details.getID();
//			String [] name = details.getName();
//			String [] description = details.getDescription();
//			String [] price = details.getPrice();
//			
//			return new ReturnDetails(country, ID, name, description, category, price);
//		}
//				
//		if(!(details.getCategory().equals("Breakfast")||details.getCategory().equals("Lunch")||details.getCategory().equals("Snack"))){
//			String [] country = details.getCountry();
//			String [] ID = details.getID();
//			String [] name = details.getName();
//			String [] description = details.getDescription();
//			String [] price = details.getPrice();
//			
//			return new ReturnDetails(country, ID, name, description, category, price);
//		}
//		else{
//			int j = 0;
//			while(category[j]!=null){
//				if((category[j].equals("Breakfast")||category[j].equals("Snack")||category[j].equals("Lunch"))){
//					category[j] = "Not Needed";
//				}
//				j++;
//			}
//		
//			String [] country = details.getCountry();
//			String [] ID = details.getID();
//			String [] name = details.getName();
//			String [] description = details.getDescription();
//			String [] price = details.getPrice();
//			
//			
//			return new ReturnDetails(country, ID, name, description, category, price);
//		}
//	}
}
