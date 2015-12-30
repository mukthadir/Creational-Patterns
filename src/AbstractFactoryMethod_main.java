
import java.util.*;

public class AbstractFactoryMethod_main {
	public static void main(String args[]){
		
		AbstractFactory_Country ReaderInterface = FactoryProducer_Country.getFactory("country");
		ReaderInterface country1 = ReaderInterface.identifyCountry("GB");
		ReaderInterface country2 = ReaderInterface.identifyCountry("US");		
		
		AbstractFactory_RestaurantCategory MenuCreatorInterface = FactoryProducer_ResCategory.getFactory("Menu");
		MenuCreatorInterface Menu1 = MenuCreatorInterface.identifyMenuCategory("Diner");
		MenuCreatorInterface Menu2 = MenuCreatorInterface.identifyMenuCategory("Evening Only");
		MenuCreatorInterface Menu3 = MenuCreatorInterface.identifyMenuCategory("All Day");
		
		AbstractFactory_MenuGenerator MenuGeneratorInterface = FactoryProducer_GenerateMenu.getFactory("Format");
		MenuGeneratorInterface Format1 = MenuGeneratorInterface.generateMenu("Plain Text");
		MenuGeneratorInterface Format2 = MenuGeneratorInterface.generateMenu("HTML");
		MenuGeneratorInterface Format3 = MenuGeneratorInterface.generateMenu("XML");		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String i;
		String j;
		String k;
		
		System.out.println("Please enter the country of your choice (US or GB):");
		i = scan.nextLine();
		if(i.equals("GB")){
			ReturnAllDetails allDetails = country1.getDetails();

			System.out.println("Enter the type of Menu Needed(Diner / Evening Only / All Day)");
			j = scan.nextLine();
			if(j.equals("Diner")){
				ReturnDetails details = Menu1.getFoodItemCategory(allDetails);
				
				System.out.println("Please enter the format(Plain Text/HTML/XML)");
				k = scan.nextLine();
				if(k.equals("Plain Text")){
					Format1.generateMenu(details);
				}else if(k.equals("HTML")){
					Format2.generateMenu(details);
				}else if(k.equals("XML")){
					Format3.generateMenu(details);
				}
			}else if(j.equals("Evening Only")){
				ReturnDetails details = Menu2.getFoodItemCategory(allDetails);
				
				System.out.println("Please enter the format(Plain Text/HTML/XML)");
				k = scan.nextLine();
				if(k.equals("Plain Text")){
					Format1.generateMenu(details);
				}else if(k.equals("HTML")){
					Format2.generateMenu(details);
				}else if(k.equals("XML")){
					Format3.generateMenu(details);
				}
			}else if(j.equals("All Day")){
				ReturnDetails details = Menu3.getFoodItemCategory(allDetails);
				
				System.out.println("Please enter the format(Plain Text/HTML/XML)");
				k = scan.nextLine();
				if(k.equals("Plain Text")){
					Format1.generateMenu(details);
				}else if(k.equals("HTML")){
					Format2.generateMenu(details);
				}else if(k.equals("XML")){
					Format3.generateMenu(details);
				}
			}	
		} else if(i.equals("US")){
			ReturnAllDetails allDetails1 = country2.getDetails();
			
			System.out.println("Enter the type of Menu Needed(Diner / Evening Only / All Day)");
			j = scan.nextLine();
			if(j.equals("Diner")){
				ReturnDetails details1 = Menu1.getFoodItemCategory(allDetails1);
				
				System.out.println("Please enter the format(Plain Text/HTML/XML)");
				k = scan.nextLine();
				if(k.equals("Plain Text")){
					Format1.generateMenu(details1);
				}else if(k.equals("HTML")){
					Format2.generateMenu(details1);
				}else if(k.equals("XML")){
					Format3.generateMenu(details1);
				}
			}else if(j.equals("Evening Only")){
				ReturnDetails details1 = Menu2.getFoodItemCategory(allDetails1);
				
				System.out.println("Please enter the format(Plain Text/HTML/XML)");
				k = scan.nextLine();
				if(k.equals("Plain Text")){
					Format1.generateMenu(details1);
				}else if(k.equals("HTML")){
					Format2.generateMenu(details1);
				}else if(k.equals("XML")){
					Format3.generateMenu(details1);
				}
			}else if(j.equals("All Day")){
				ReturnDetails details1 = Menu3.getFoodItemCategory(allDetails1);
				
				System.out.println("Please enter the format(Plain Text/HTML/XML)");
				k = scan.nextLine();
				if(k.equals("Plain Text")){
					Format1.generateMenu(details1);
				}else if(k.equals("HTML")){
					Format2.generateMenu(details1);
				}else if(k.equals("XML")){
					Format3.generateMenu(details1);
				}
			}
		}
	}	
}
