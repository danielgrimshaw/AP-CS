public class EmployeesMain {
   public static void main(String[] args){
      Employee jan = new Employee("Jan");
      System.out.println("Employee "+jan.getName()+"'s's hours are " + jan.getHours());
      System.out.println("Employee "+jan.getName()+"'s pay is " + jan.getSalary());
      System.out.println("Employee "+jan.getName()+"'s vacation days is " 
         + jan.getVacationDays());
      System.out.println("Employee "+jan.getName()+"'s vacation form is " 
         + jan.getVacationForm());
      System.out.println();
      
    
      Secretary sam = new Secretary("Sam");
      System.out.println("Secretary "+sam.getName()+"'s hours are " 
         + sam.getHours());
      System.out.println("Secretary "+sam.getName()+"'s's pay is " 
         + sam.getSalary());
      System.out.println("Secretary "+sam.getName()+"'s's vacation days is " 
         + sam.getVacationDays());
      System.out.println("Secretary "+sam.getName()+"'s's vacation form is " 
         + sam.getVacationForm());
      System.out.print("Secretary "+sam.getName()+" is ");
      sam.takeDictation("I am not guilty!");
      System.out.println();
    
    
      Lawyer andy = new Lawyer("Andy");
      System.out.println("Lawyer "+andy.getName()+"'s hours are " 
         + andy.getHours());
      System.out.println("Lawyer "+andy.getName()+"'s pay is " 
         + andy.getSalary());
      System.out.println("Lawyer "+andy.getName()+"'s vacation days is " 
         + andy.getVacationDays());
      System.out.println("Lawyer "+andy.getName()+"'s vacation form is " 
         + andy.getVacationForm());
      System.out.print("Lawyer "+andy.getName()+" says: ");
      andy.sue();
      System.out.println();
    
    
      Marketer chris = new Marketer("Chris");
      System.out.println("Marketer "+chris.getName()+"' hours are " 
         + chris.getHours());
      System.out.println("Marketer "+chris.getName()+"' pay is " 
         + chris.getSalary());
      System.out.println("Marketer "+chris.getName()+"' vacation days is " 
         + chris.getVacationDays());
      System.out.println("Marketer "+chris.getName()+"' vacation form is " 
         + chris.getVacationForm());
      System.out.print("Marketer "+chris.getName()+" says: ");
      chris.advertise();
      System.out.println();
    
    
      LegalSecretary alex = new LegalSecretary("Alex");
      System.out.println("Legal Secretary "+alex.getName()+"'s hours are " 
         + alex.getHours());
      System.out.println("Legal Secretary "+alex.getName()+"'s pay is " 
         + alex.getSalary());
      System.out.println("Legal Secretary "+alex.getName()+"'s vacation days is " 
         + alex.getVacationDays());
      System.out.println("Legal Secretary "+alex.getName()+"'s vacation form is " 
         + alex.getVacationForm());
      System.out.print("Legal Secretary "+alex.getName()+" says: ");
      alex.fileLegalBriefs();
      System.out.println();
   }
}