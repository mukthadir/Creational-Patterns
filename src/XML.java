import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class XML implements MenuGeneratorInterface {
	public void generateMenu(ReturnDetails ret){
		String []country = ret.getCountry();
//		String []ID = ret.getID();
		String []name = ret.getName();
		String []description = ret.getDescription();
		String []category =ret.getCategory();
		String []price =ret.getPrice();
		
		int count = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		
		while(country[count]!=null){
			count++;
		}
		
		String []breakfastItemName = new String[100];
		String []breakfastItemPrice = new String[100];
		String []breakfastItemDescription = new String[500];
		String []breakfastItemCountry = new String[100];
		
		String []snackItemName = new String[100];
		String []snackItemPrice = new String[100];
		String []snackItemDescription = new String[500];
		String []snackItemCountry = new String[100];
		
		String []appetizerItemName = new String[100];
		String []appetizerItemPrice = new String[100];
		String []appetizerItemDescription = new String[500];
		String []appetizerItemCountry = new String[100];
		
		String []lunchItemName = new String[100];
		String []lunchItemPrice = new String[100];
		String []lunchItemDescription = new String[500];
		String []lunchItemCountry = new String[100];
		
		String []dinnerItemName = new String[100];
		String []dinnerItemPrice = new String[100];
		String []dinnerItemDescription = new String[500];
		String []dinnerItemCountry = new String[100];
		
		String []dessertItemName = new String[100];
		String []dessertItemPrice = new String[100];
		String []dessertItemDescription = new String[500];
		String []dessertItemCountry = new String[100];
		
		String []sideDishItemName = new String[100];
		String []sideDishItemPrice = new String[100];
		String []sideDishItemDescription = new String[500];
		String []sideDishItemCountry = new String[100];
		
		for(int i = 0; i<count;i++){
			if(category[i].equals("Breakfast")){
				breakfastItemName[a] = name[i];
				breakfastItemPrice[a] = price[i];
				breakfastItemDescription[a] = description[i];
				breakfastItemCountry[a] = country[i];				
				a++;
			}else if(category[i].equals("Snack")){
				snackItemName[b] = name[i];
				snackItemPrice[b] = price[i];
				snackItemDescription[b] = description[i];
				snackItemCountry[b] = country[i];
				b++;
			}else if(category[i].equals("Appetizer")){
				appetizerItemName[c] = name[i];
				appetizerItemPrice[c] = price[i];
				appetizerItemDescription[c] = description[i];
				appetizerItemCountry[c] = country[i];
				c++;
			}else if(category[i].equals("Lunch")){
				lunchItemName[d] = name[i];
				lunchItemPrice[d] = price[i];
				lunchItemDescription[d] = description[i];
				lunchItemCountry[d] = country[i];
				d++;
			}else if(category[i].equals("Dinner")){
				dinnerItemName[e] = name[i];
				dinnerItemPrice[e] = price[i];
				dinnerItemDescription[e] = description[i];
				dinnerItemCountry[e] = country[i];
				e++;
			}else if(category[i].equals("Dessert")){
				dessertItemName[f] = name[i];
				dessertItemPrice[f] = price[i];
				dessertItemDescription[f] = description[i];
				dessertItemCountry[f] = country[i];
				f++;
			}else if(category[i].equals("Side Dish")){
				sideDishItemName[g] = name[i];
				sideDishItemPrice[g] = price[i];
				sideDishItemDescription[g] = description[i];
				sideDishItemCountry[g] = country[i];
				g++;
			}
		}
		
		PrintWriter writer;
		try {
			writer = new PrintWriter("Menu.xml", "UTF-8");
		
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<MenuItems>");
		
		if(a>0){
			writer.println("\t<MenuCategory category = \"BREAKFAST\">");
			for(int j = 0; j<a; j++){
				writer.println("\t\t<MenuItem>");
				writer.println("\t\t\t<Name>"+breakfastItemName[j]+"</Name>");
				writer.println("\t\t\t<Price>");
				writer.print("\t\t\t\t<CurrencyCode>");
				if(breakfastItemCountry[j].equals("US")){
					writer.print("USD");
				}else if(breakfastItemCountry[j].equals("GB")){
					writer.print("GBP");
				}
				writer.println("</CurrencyCode>");
				writer.println("\t\t\t\t<Amount>"+ breakfastItemPrice[j] + "</Amount>");
				writer.println("\t\t\t</Price>");
				writer.println("\t\t\t<Description>" + breakfastItemDescription[j] + "</Description>");
				writer.println("\t\t</MenuItem>");
			}
			writer.println("\t</MenuCategory>");
		}
		
		if(b>0){
			writer.println("\t<MenuCategory category = \"SNACK\">");
			for(int j = 0; j<b; j++){
				writer.println("\t\t<MenuItem>");
				writer.println("\t\t\t<Name>"+snackItemName[j]+"</Name>");
				writer.println("\t\t\t<Price>");
				writer.print("\t\t\t\t<CurrencyCode>");
				if(snackItemCountry[j].equals("US")){
					writer.print("USD");
				}else if(snackItemCountry[j].equals("GB")){
					writer.print("GBP");
				}
				writer.println("</CurrencyCode>");
				writer.println("\t\t\t\t<Amount>"+ snackItemPrice[j] + "</Amount>");
				writer.println("\t\t\t</Price>");
				writer.println("\t\t\t<Description>" + snackItemDescription[j] + "</Description>");
				writer.println("\t\t</MenuItem>");
			}
			writer.println("\t</MenuCategory>");
		}
		
		if(c>0){
			writer.println("\t<MenuCategory category = \"APPETIZER\">");
			for(int j = 0; j<c; j++){
				writer.println("\t\t<MenuItem>");
				writer.println("\t\t\t<Name>"+appetizerItemName[j]+"</Name>");
				writer.println("\t\t\t<Price>");
				writer.print("\t\t\t\t<CurrencyCode>");
				if(appetizerItemCountry[j].equals("US")){
					writer.print("USD");
				}else if(appetizerItemCountry[j].equals("GB")){
					writer.print("GBP");
				}
				writer.println("</CurrencyCode>");
				writer.println("\t\t\t\t<Amount>"+ appetizerItemPrice[j] + "</Amount>");
				writer.println("\t\t\t</Price>");
				writer.println("\t\t\t<Description>" + appetizerItemDescription[j] + "</Description>");
				writer.println("\t\t</MenuItem>");
			}
			writer.println("\t</MenuCategory>");
		}
		
		if(d>0){
			writer.println("\t<MenuCategory category = \"LUNCH\">");
			for(int j = 0; j<d; j++){
				writer.println("\t\t<MenuItem>");
				writer.println("\t\t\t<Name>"+lunchItemName[j]+"</Name>");
				writer.println("\t\t\t<Price>");
				writer.print("\t\t\t\t<CurrencyCode>");
				if(lunchItemCountry[j].equals("US")){
					writer.print("USD");
				}else if(lunchItemCountry[j].equals("GB")){
					writer.print("GBP");
				}
				writer.println("</CurrencyCode>");
				writer.println("\t\t\t\t<Amount>"+ lunchItemPrice[j] + "</Amount>");
				writer.println("\t\t\t</Price>");
				writer.println("\t\t\t<Description>" + lunchItemDescription[j] + "</Description>");
				writer.println("\t\t</MenuItem>");
			}
			writer.println("\t</MenuCategory>");
		}
		
		if(e>0){
			writer.println("\t<MenuCategory category = \"DINNER\">");
			for(int j = 0; j<e; j++){
				writer.println("\t\t<MenuItem>");
				writer.println("\t\t\t<Name>"+dinnerItemName[j]+"</Name>");
				writer.println("\t\t\t<Price>");
				writer.print("\t\t\t\t<CurrencyCode>");
				if(dinnerItemCountry[j].equals("US")){
					writer.print("USD");
				}else if(dinnerItemCountry[j].equals("GB")){
					writer.print("GBP");
				}
				writer.println("</CurrencyCode>");
				writer.println("\t\t\t\t<Amount>"+ dinnerItemPrice[j] + "</Amount>");
				writer.println("\t\t\t</Price>");
				writer.println("\t\t\t<Description>" + dinnerItemDescription[j] + "</Description>");
				writer.println("\t\t</MenuItem>");
			}
			writer.println("\t</MenuCategory>");
		}
		
		if(f>0){
			writer.println("\t<MenuCategory category = \"DESSERT\">");
			for(int j = 0; j<f; j++){
				writer.println("\t\t<MenuItem>");
				writer.println("\t\t\t<Name>"+dessertItemName[j]+"</Name>");
				writer.println("\t\t\t<Price>");
				writer.print("\t\t\t\t<CurrencyCode>");
				if(dessertItemCountry[j].equals("US")){
					writer.print("USD");
				}else if(dessertItemCountry[j].equals("GB")){
					writer.print("GBP");
				}
				writer.println("</CurrencyCode>");
				writer.println("\t\t\t\t<Amount>"+ dessertItemPrice[j] + "</Amount>");
				writer.println("\t\t\t</Price>");
				writer.println("\t\t\t<Description>" + dessertItemDescription[j] + "</Description>");
				writer.println("\t\t</MenuItem>");
			}
			writer.println("\t</MenuCategory>");
		}
		
		if(g>0){
			writer.println("\t<MenuCategory category = \"SIDE_DISH\">");
			for(int j = 0; j<g; j++){
				writer.println("\t\t<MenuItem>");
				writer.println("\t\t\t<Name>"+sideDishItemName[j]+"</Name>");
				writer.println("\t\t\t<Price>");
				writer.print("\t\t\t\t<CurrencyCode>");
				if(sideDishItemCountry[j].equals("US")){
					writer.print("USD");
				}else if(sideDishItemCountry[j].equals("GB")){
					writer.print("GBP");
				}
				writer.println("</CurrencyCode>");
				writer.println("\t\t\t\t<Amount>"+ sideDishItemPrice[j] + "</Amount>");
				writer.println("\t\t\t</Price>");
				writer.println("\t\t\t<Description>" + sideDishItemDescription[j] + "</Description>");
				writer.println("\t\t</MenuItem>");
			}
			writer.println("\t</MenuCategory>");
		}
		writer.println("</MenuItems>");
		
		writer.close();
		
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	}
}
