public class EmployeesMain {
   public static void main(String[] args){
      Employee jan = new Employee();
      System.out.println("Employee Jan's hours are " + jan.getHours());
      System.out.println("Employee Jan's pay is " + jan.getSalary());
      System.out.println("Employee Jan's vacation days is " 
         + jan.getVacationDays());
      System.out.println("Employee Jan's vacation form is " 
         + jan.getVacationForm());
      System.out.println();
      
    
      Secretary sam = new Secretary();
      System.out.println("Secretary Sam's hours are " 
         + sam.getHours());
      System.out.println("Secretary Sam's pay is " 
         + sam.getSalary());
      System.out.println("Secretary Sam's vacation days is " 
         + sam.getVacationDays());
      System.out.println("Secretary Sam's vacation form is " 
         + sam.getVacationForm());
      System.out.print("Secretary Sam is ");
      sam.takeDictation("I am not guilty!");
      System.out.println();
    
    
      Lawyer andy = new Lawyer();
      System.out.println("Lawyer Andy's hours are " 
         + andy.getHours());
      System.out.println("Lawyer Andy's pay is " 
         + andy.getSalary());
      System.out.println("Lawyer Andy's vacation days is " 
         + andy.getVacationDays());
      System.out.println("Lawyer Andy's vacation form is " 
         + andy.getVacationForm());
      System.out.print("Lawyer Andy says: ");
      andy.sue();
      System.out.println();
    
    
      Marketer chris = new Marketer();
      System.out.println("Marketer Chris' hours are " 
         + chris.getHours());
      System.out.println("Marketer Chris' pay is " 
         + chris.getSalary());
      System.out.println("Marketer Chris' vacation days is " 
         + chris.getVacationDays());
      System.out.println("Marketer Chris' vacation form is " 
         + chris.getVacationForm());
      System.out.print("Marketer Chris says: ");
      chris.advertise();
      System.out.println();
    
    
      LegalSecretary alex = new LegalSecretary();
      System.out.println("Legal Secretary Alex's hours are " 
         + alex.getHours());
      System.out.println("Legal Secretary Alex's pay is " 
         + alex.getSalary());
      System.out.println("Legal Secretary Alex's vacation days is " 
         + alex.getVacationDays());
      System.out.println("Legal Secretary Alex's vacation form is " 
         + alex.getVacationForm());
      System.out.print("Legal Secretary Alex says: ");
      alex.fileLegalBriefs();
      System.out.println();
   }
}