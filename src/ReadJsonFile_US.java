import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

	
public class ReadJsonFile_US implements ReaderInterface{

	    public  ReturnAllDetails getDetails() {
	 
	    String [] country = new String [500];
	  	String [] ID = new String [500];
	  	String [] name = new String [500];
	  	String [] description = new String [500];
	  	String [] category = new String [500];
	  	String [] price = new String [500];	
	    
	  	String [] country1 = new String [500];
	  	String [] ID1 = new String [500];
	  	String [] name1 = new String [500];
	  	String [] description1 = new String [500];
	  	String [] category1 = new String [500];
	  	String [] price1 = new String [500];
	    	
		ObjectMapper mapper = new ObjectMapper();
		
		
		try {
	 
			User user = mapper.readValue(new File("FoodItemData.json"), User.class);
			int  i = 0;
			while(i<47){
				country[i] = user.getFoodItemData().get(i).getcountry();
				ID[i] = user.getFoodItemData().get(i).getId();
				name[i] = user.getFoodItemData().get(i).getName();
				description[i] = user.getFoodItemData().get(i).getDescription();
				category[i] = user.getFoodItemData().get(i).getCategory();
				price[i] = user.getFoodItemData().get(i).getPrice();
				
//				System.out.println("country: "+ country[i]);
//				System.out.println("ID: "+ ID[i]);
//				System.out.println("name: "+ name[i]);
//				System.out.println("description: "+ description[i]);
//				System.out.println("category: "+ category[i]);
//				System.out.println("price: "+ price[i]);
//				System.out.println();
				
				i++;
			}
			
			 	
			int j = 0;
			for(int k=0; k< i; k++){
				if( country[k].equals("US")){
					country1[j]= country[k];
					ID1[j]=ID[k];
					name1[j]=name[k];
					description1[j]=description[k];
					category1[j]=category[k];
					price1[j]=price[k];
					j++;
				}
			}
			
		} catch (JsonGenerationException e) {
	 
			e.printStackTrace();
	 
		} catch (JsonMappingException e) {
	 
			e.printStackTrace();
	 
		} catch (IOException e) {
	 
			e.printStackTrace();
	 
		}
	 
		return new ReturnAllDetails(country1, ID1, name1, description1, category1, price1);
	  }
}
