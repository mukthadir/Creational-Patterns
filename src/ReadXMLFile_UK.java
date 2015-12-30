 
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;
 
public class ReadXMLFile_UK implements ReaderInterface{
 
  public ReturnAllDetails getDetails() {
 
	  int i = 0;
	  
	  String [] country = new String [500];
	  String [] ID = new String [500];
	  String [] name = new String [500];
	  String [] description = new String [500];
	  String [] category = new String [500];
	  String [] price = new String [500];
	  
	  try {
 
		  File fXmlFile = new File("FoodItemData.xml");
		  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		  Document doc = dBuilder.parse(fXmlFile);
 
		  doc.getDocumentElement().normalize();
 
//		  System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
 
		  NodeList nList = doc.getElementsByTagName("FoodItem");
 
//		  System.out.println("----------------------------");

		  for (int temp = 0; temp < nList.getLength(); temp++) {
 
			  Node nNode = nList.item(temp);
 
//			  System.out.println("\nCurrent Element :" + nNode.getNodeName());
 
			  if (nNode.getNodeType() == Node.ELEMENT_NODE) {
 
				  Element eElement = (Element) nNode;
 
				  country[i] = eElement.getAttribute("country");
				  
				  if(country[i].equals("GB")){
				  
				  ID[i] = eElement.getElementsByTagName("id").item(0).getTextContent();
				  name[i] = eElement.getElementsByTagName("name").item(0).getTextContent();
				  description[i] = eElement.getElementsByTagName("description").item(0).getTextContent();
				  category[i] = eElement.getElementsByTagName("category").item(0).getTextContent();
				  price[i] = eElement.getElementsByTagName("price").item(0).getTextContent();
				  i++;
				  }
//				  System.out.println("Item id : " + ID[i]);
//			   	  System.out.println("Name: " + name[i]);
//				  System.out.println("Description : " + description[i]);
//				  System.out.println("Category : " + category[i]);
//				  System.out.println("Price : " + price[i]);
			
//				  System.out.println("FoodItem country : " + eElement.getAttribute("country"));
//				  System.out.println("ID : " + eElement.getElementsByTagName("id").item(0).getTextContent());
//			  	  System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
//				  System.out.println("Description : " + eElement.getElementsByTagName("description").item(0).getTextContent());
//				  System.out.println("Category : " + eElement.getElementsByTagName("category").item(0).getTextContent());
//				  System.out.println("Price : " + eElement.getElementsByTagName("price").item(0).getTextContent());
 
			  	  }
			  	  
		  	}
	  	} catch (Exception e) {
	  	e.printStackTrace();
	  	}
    
	  	return new ReturnAllDetails(country, ID, name, description, category, price);
  }
}