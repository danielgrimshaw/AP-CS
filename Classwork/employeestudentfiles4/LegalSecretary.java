// A class to represent legal secretaries.

// Add class header below
public class LegalSecretary extends Secretary {
   public LegalSecretary() {
      super();
   }

   public LegalSecretary(String name) {
      super(name);
   }
		// Add method fileLegalBriefs that prints "I could file all day!"
   public void fileLegalBriefs() {
      System.out.println("I could file all day!");
   }

	// Add method that overrides getSalary from Employee class
   // for salary of 45000.0 per year
   public double getSalary() {
      return super.getSalary() + 5000; 
   }
}