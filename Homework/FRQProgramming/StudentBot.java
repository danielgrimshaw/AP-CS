public class StudentBot extends ChatBot {
	private String name;
	
	public StudentBot(String nm) {
		super(nm);
	}
	
	public String respondToGreeting(String greeting) {
		if (greeting.indexOf("morning") > 0)
			return "Good morning";
		else if (greeting.indexOf("afternoon") > 0)
			return "Good afternoon";
		else
			return "Hello";
	}
}
