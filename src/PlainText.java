import java.io.*;

public class PlainText implements MenuGeneratorInterface {
	
	public static String padRight(String s, int n) {
	     return String.format("%1$-" + n + "s", s);  
	}
	
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
			writer = new PrintWriter("Menu.txt", "UTF-8");

			if(a>0){
				writer.println("BREAKFAST");
				writer.println();
				for(int j = 0; j<a; j++){
					writer.print(padRight(breakfastItemName[j], 80));
					if(breakfastItemCountry[j].equals("US")){
						writer.print("$");
					}else if(breakfastItemCountry[j].equals("GB")){
						writer.print("GBP");
					}
					writer.println(breakfastItemPrice[j]);
					writer.println(breakfastItemDescription[j]);
					writer.println();
				}
			}
			
			if(b>0){
				writer.println("SNACK");
				writer.println();
				for(int j = 0; j<b; j++){
					writer.print(padRight(snackItemName[j], 80));
					if(snackItemCountry[j].equals("US")){
						writer.print("$");
					}else if(snackItemCountry[j].equals("GB")){
						writer.print("GBP");
					}
					writer.println(snackItemPrice[j]);
					writer.println(snackItemDescription[j]);
					writer.println();
				}
			}
			
			if(c>0){
				writer.println("APPETIZER");
				writer.println();
				for(int j = 0; j<c; j++){
					writer.print(padRight(appetizerItemName[j], 80));
					if(appetizerItemCountry[j].equals("US")){
						writer.print("$");
					}else if(appetizerItemCountry[j].equals("GB")){
						writer.print("GBP");
					}
					writer.println(appetizerItemPrice[j]);
					writer.println(appetizerItemDescription[j]);
					writer.println();
				}
			}
			
			if(d>0){
				writer.println("LUNCH");
				writer.println();
				for(int j = 0; j<d; j++){
					writer.print(padRight(lunchItemName[j], 80));
					if(lunchItemCountry[j].equals("US")){
						writer.print("$");
					}else if(lunchItemCountry[j].equals("GB")){
						writer.print("GBP");
					}
					writer.println(lunchItemPrice[j]);
					writer.println(lunchItemDescription[j]);
					writer.println();
				}
			}
			
			if(e>0){
				writer.println("DINNER");
				writer.println();
				for(int j = 0; j<e; j++){
					writer.print(padRight(dinnerItemName[j], 80));
					if(dinnerItemCountry[j].equals("US")){
						writer.print("$");
					}else if(dinnerItemCountry[j].equals("GB")){
						writer.print("GBP");
					}
					writer.println(dinnerItemPrice[j]);
					writer.println(dinnerItemDescription[j]);
					writer.println();
				}
			}
			
			if(f>0){
				writer.println("DESSERT");
				writer.println();
				for(int j = 0; j<f; j++){
					writer.print(padRight(dessertItemName[j], 80));
					if(dessertItemCountry[j].equals("US")){
						writer.print("$");
					}else if(dessertItemCountry[j].equals("GB")){
						writer.print("GBP");
					}
					writer.println(dessertItemPrice[j]);
					writer.println(dessertItemDescription[j]);
					writer.println();
				}
			}
			
			if(g>0){
				writer.println("SIDE_DISH");
				writer.println();
				for(int j = 0; j<g; j++){
					writer.print(padRight(sideDishItemName[j], 80));
					if(sideDishItemCountry[j].equals("US")){
						writer.print("$");
					}else if(sideDishItemCountry[j].equals("GB")){
						writer.print("GBP");
					}
					writer.println(sideDishItemPrice[j]);
					writer.println(sideDishItemDescription[j]);
					writer.println();
				}
			}
			
			writer.close();
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	}
}
