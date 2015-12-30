import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class HTML implements MenuGeneratorInterface {
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
			writer = new PrintWriter("Menu.html", "UTF-8");
		
			writer.println("<html>");
			writer.println("\t<head>");
			writer.println("\t\t<title>Menu</title>");
			writer.println("\t</head>");
			writer.println("\t<body>");
			writer.println("\t\t<center>Menu</center>");
			
			if(a>0){
				writer.println("\t\t<h1>BREAKFAST</h1>");	
				writer.println("\t\t<ul>");
				for(int j = 0; j<a; j++){
					writer.println("\t\t<li>" + breakfastItemName[j] + "</br>");
					writer.println("\t\t\t<i>" + breakfastItemDescription[j] + "</i></br>");
					if(breakfastItemCountry[j].equals("US")){
						writer.print("\t\t\tUSD");
					}else if(breakfastItemCountry[j].equals("GB")){
						writer.print("\t\t\tGBP");
					}
					writer.println(breakfastItemPrice[j]);
					writer.println("\t\t</li>");
				}
				writer.println("\t\t</ul>");
			}
			
			if(b>0){
				writer.println("\t\t<h1>SNACK</h1>");	
				writer.println("\t\t<ul>");
				for(int j = 0; j<b; j++){
					writer.println("\t\t<li>" + snackItemName[j] + "</br>");
					writer.println("\t\t\t<i>" + snackItemDescription[j] + "</i></br>");
					if(snackItemCountry[j].equals("US")){
						writer.print("\t\t\tUSD");
					}else if(snackItemCountry[j].equals("GB")){
						writer.print("\t\t\tGBP");
					}
					writer.println(snackItemPrice[j]);
					writer.println("\t\t</li>");
				}
				writer.println("\t\t</ul>");
			}
			
			if(c>0){
				writer.println("\t\t<h1>APPETIZER</h1>");	
				writer.println("\t\t<ul>");
				for(int j = 0; j<c; j++){
					writer.println("\t\t<li>" + appetizerItemName[j] + "</br>");
					writer.println("\t\t\t<i>" + appetizerItemDescription[j] + "</i></br>");
					if(appetizerItemCountry[j].equals("US")){
						writer.print("\t\t\tUSD");
					}else if(appetizerItemCountry[j].equals("GB")){
						writer.print("\t\t\tGBP");
					}
					writer.println(appetizerItemPrice[j]);
					writer.println("\t\t</li>");
				}
				writer.println("\t\t</ul>");
			}
			
			if(d>0){
				writer.println("\t\t<h1>LUNCH</h1>");	
				writer.println("\t\t<ul>");
				for(int j = 0; j<d; j++){
					writer.println("\t\t<li>" + lunchItemName[j] + "</br>");
					writer.println("\t\t\t<i>" + lunchItemDescription[j] + "</i></br>");
					if(lunchItemCountry[j].equals("US")){
						writer.print("\t\t\tUSD");
					}else if(lunchItemCountry[j].equals("GB")){
						writer.print("\t\t\tGBP");
					}
					writer.println(lunchItemPrice[j]);
					writer.println("\t\t</li>");
				}
				writer.println("\t\t</ul>");
			}
			
			if(e>0){
				writer.println("\t\t<h1>DINNER</h1>");	
				writer.println("\t\t<ul>");
				for(int j = 0; j<e; j++){
					writer.println("\t\t<li>" + dinnerItemName[j] + "</br>");
					writer.println("\t\t\t<i>" + dinnerItemDescription[j] + "</i></br>");
					if(dinnerItemCountry[j].equals("US")){
						writer.print("\t\t\tUSD");
					}else if(dinnerItemCountry[j].equals("GB")){
						writer.print("\t\t\tGBP");
					}
					writer.println(dinnerItemPrice[j]);
					writer.println("\t\t</li>");	
				}
				writer.println("\t\t</ul>");
			}
			
			if(f>0){
				writer.println("\t\t<h1>DESSERT</h1>");	
				writer.println("\t\t<ul>");
				for(int j = 0; j<f; j++){
					writer.println("\t\t<li>" + dessertItemName[j] + "</br>");
					writer.println("\t\t\t<i>" + dessertItemDescription[j] + "</i></br>");
					if(dessertItemCountry[j].equals("US")){
						writer.print("\t\t\tUSD");
					}else if(dessertItemCountry[j].equals("GB")){
						writer.print("\t\t\tGBP");
					}
					writer.println(dessertItemPrice[j]);
					writer.println("\t\t</li>");
				}
				writer.println("\t\t</ul>");
			}
			
			if(g>0){
				writer.println("\t\t<h1>SIDE_DISH</h1>");	
				writer.println("\t\t<ul>");
				for(int j = 0; j<g; j++){
					writer.println("\t\t<li>" + sideDishItemName[j] + "</br>");
					writer.println("\t\t\t<i>" + sideDishItemDescription[j] + "</i></br>");
					if(sideDishItemCountry[j].equals("US")){
						writer.print("\t\t\tUSD");
					}else if(sideDishItemCountry[j].equals("GB")){
						writer.print("\t\t\tGBP");
					}
					writer.println(sideDishItemPrice[j]);
					writer.println("\t\t</li>");
				}
				writer.println("\t\t</ul>");
			}
			writer.println("\t</body>");
			writer.println("</html>");
			
			writer.close();
		
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	
	
	}
}
