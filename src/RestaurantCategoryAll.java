
public class RestaurantCategoryAll implements MenuCreatorInterface {
	public ReturnDetails getFoodItemCategory(ReturnAllDetails details){
		
		String [] country = details.getCountry();
		String [] ID = details.getID();
		String [] name = details.getName();
		String [] description = details.getDescription();
		String [] category = details.getCategory();
		String [] price = details.getPrice();
		
		return new ReturnDetails(country, ID, name, description, category, price);
	}
}
