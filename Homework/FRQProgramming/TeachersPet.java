public class TeachersPet extends StudentBot {
	private String name;
	
	public TeachersPet(String nm) {
		super(nm);
	}
	
	public String respondToGreeting(String greeting) {
		String ret = super.respondToGreeting(greeting);
		int i = greeting.indexOf("name is");
		if (i > 0)
			ret += greeting.substring(i+7);
		else
			ret += ".";
		
		return ret + "\nWhat are we going to do in class today?";
	}
}
