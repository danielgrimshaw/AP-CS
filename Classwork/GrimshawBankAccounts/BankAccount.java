public class BankAccount {

// static: Part of a class, rather than part of an object.
// Not copied into each object; shared by all objects of that class

  	/* static field: Stored in the class instead of each object.
  	  static field is a "shared" global field that all objects
       can access and modify.
     static field is like a class constant, except that the 
      value can be changed.
     In BankAccount, have a static count of how many accounts
        are created to track total accounts in the bank.
     (Note: Have only one count shared for the whole class.)
  	*/
  
  	// static count of how many accounts are created
  	// only one count shared for the whole class
   // Add static field below. - Note use of static keyword.
   private static int count = 0;

 	// The fields below are not static. They are replicated for each object.
 	// In BankAccount, the fields are the name and id of a unique bank account.
   private String name;
   private int id;

 	// The constructor below establishes a unique bank account object.
 	// Each object represents an individual's bank account.
   public BankAccount() {
      this("Anonymous");
   }
   
   public BankAccount(String name) {
      this.name = name;
      this.id = ++count;
   }
	
	   
   /* static method: Stored in a class, not in an object.
     static method is shared by all objects of the class,
       not replicated.
     static method does not have any implicit parameter, this;
      therefore, cannot access any particular object's fields.
     In BankAccount, clients can call getNumAccounts() to find 
       the # of accounts created.
	*/
  
  	// return the number of accounts (objects) that have been created.
   // Add static method here. - Note use of static keyword.
   public static int getNumAccounts() {
      return count;
   }
		
  	// The method below is not static. It is replicated for each object.
   public int getID() {   // return this account's id
      return this.id;
   }
   
   public String toString() {
      return this.name;
   }
}
