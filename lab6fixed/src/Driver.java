
public class Driver
{
	public static void testNameManager()
	{
		NameManager manager = new NameManager();
		
		manager.addName("M.Mickleson");
		manager.addName("Johnua Taylor Biggs");
		manager.addName("P.Smith");
		manager.addName("Peter Jonathan Smythton");
		manager.addName("P.Thompson");
		
		manager.printNames();// should print all names
		
		manager.removeLongNames();
		
		manager.printNames();// should now have longer names removed
	}
}
