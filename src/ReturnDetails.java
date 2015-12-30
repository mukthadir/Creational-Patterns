
public class ReturnDetails {
	private String[] country1;
	private String[] ID1;
	private String [] name1;
	private String [] description1;
	private String[] category1;
    private String[] price1;
    
    public ReturnDetails(String[] country1, String[] ID1, String[] name1,  String[] description1, String[] category1, String[] price1)
    {
        this.country1= country1;
    	this.ID1 = ID1;
        this.name1 = name1;
        this.description1 = description1;
        this.category1 = category1;
        this.price1 = price1;
    }

    public String[] getCountry() {
    	return country1;
    }
    public String[] getID() {
    	return ID1;
    }
    public String[] getName() {
    	return name1;
    }
    public String[] getDescription() {
    	return description1;
    }
    public String[] getCategory() {
    	return category1;
    }
    public String[] getPrice() {
    	return price1;
    }
}
