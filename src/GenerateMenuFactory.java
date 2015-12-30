
public class GenerateMenuFactory extends AbstractFactory_MenuGenerator{
	public MenuGeneratorInterface generateMenu(String MenuFormat){
		if(MenuFormat == null){
			return null;
	    }
		else if (MenuFormat.equalsIgnoreCase ("Plain Text")){
			return new PlainText ();
		}
		else if (MenuFormat.equalsIgnoreCase("HTML") ){
		return new HTML ();
		}
		else if (MenuFormat.equalsIgnoreCase("XML") ){
			return new XML ();
			}
		return null;
	}
}
