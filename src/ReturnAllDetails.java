
public class ReturnAllDetails {
	private String[] country;
	private String[] ID;
	private String [] name;
	private String [] description;
	private String[] category;
    private String[] price;
    
    public ReturnAllDetails(String[] country, String[] ID, String[] name,  String[] description, String[] category, String[] price)
    {
        this.country= country;
    	this.ID = ID;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public String[] getCountry() {
    	return country;
    }
    public String[] getID() {
    	return ID;
    }
    public String[] getName() {
    	return name;
    }
    public String[] getDescription() {
    	return description;
    }
    public String[] getCategory() {
    	return category;
    }
    public String[] getPrice() {
    	return price;
    }
}
