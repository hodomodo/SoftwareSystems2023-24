import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class NameManager
{
	/**
	 * Stores a list of names
	 */
	List<String> names = new ArrayList<String>();		
	public void addName(String name)
	{
		names.add(name);
	}
	
	 public void printNames()
	 {
		 for(String name : names)
		 {
			 System.out.println("The next name is" + name);
		 }
	 }
	
	 public void removeLongNames()
	 {
		 Iterator<String> iter = names.iterator();
		 while(iter.hasNext())
		 {
			 String name = iter.next();
			 if (name.length()>15)
				 iter.remove();
		 }
	 }
 }