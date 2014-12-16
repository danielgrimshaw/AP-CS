// A class to represent employees in general (20-page manual).
public class Employee {
   private String name, vacationForm = "yellow";
   private int years, workHours = 40, vacationDays = 10;
   private double salary = 40000;
   
   public Employee() {
      this("Bob");
   }
   
   public Employee(String name) {
      setName(name);
   }
   
   public String getName() {
      return name;
   }
   
   public int getHours() {
      return this.workHours;           // works 40 hours / week
   }
 
   public double getSalary() {
      return this.salary;      // $40,000.00 / year
   }
 
   public int getVacationDays() {
      return this.vacationDays;           // 2 weeks' paid vacation
   }

   public String getVacationForm() {
      return this.vacationForm;     // use the yellow form
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public void setHours(int hours) {
      this.hours = hours;
   }
   
   public void setVacationDays(int vacation) {
      this.vacationDays = vacation;
   }
   
   public void setSalary(double salary) {
      this.salary = salary;
   }
   
   public void set
}
