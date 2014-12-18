// A class to represent legal secretaries.

// Add class header below
public class LegalSecretary extends Secretary {
   public LegalSecretary() {
      super();
      super.setSalary(super.getSalary()+5000);
   }

   public LegalSecretary(String name) {
      super(name);
      super.setSalary(super.getSalary()+5000);
   }
		// Add method fileLegalBriefs that prints "I could file all day!"
   public void fileLegalBriefs() {
      System.out.println("I could file all day!");
   }
}