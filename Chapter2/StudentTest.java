 public class StudentTest {
    public static void main(String[] args) {
       Student account1 = new Student("John Chris", 93.5);
       Student account2 = new Student("John Black", 60.75);
       Student account3 = new Student("John Piko", 80.75); 

      System.out.printf("%s's letter grade is: %s%n",
          account1.getName(), account1.getLetterGrade());      
      System.out.printf("%s's letter grade is: %s%n", 
         account2.getName(),  account2.getLetterGrade());   
       System.out.printf("%s's letter grade is: %s%n", 
         account3.getName(),  account3.getLetterGrade());   
   } 
} 