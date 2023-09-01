import java.util.*;
public class Hospital {
//FUNCTION DEFINED TO INPUT NAME FROM USER 
public static String  details ( ){
 Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
 System.out.println("**************************************************");
System.out.println("Enter NAME : ");  
System.out.println("**************************************************");
String str= sc.nextLine();              //INPUTS PARTICULAR NAME OF PATIENT  
System.out.println("PATIENT NAME IS :"+str);  

return str ;
}
// FUNCTION DEFINED TO INPUT HEIGHT FROM USER 
public static int height ( ){
    Scanner sc= new Scanner(System.in); //System.in is a standard input stream 
    
   System.out.print("ENTER HEIGHT  : ");  
    int height =sc.nextInt();
    
    System.out.println("**************************************************");
    System.out.println("HEIGHT IN CM  : " + height);
    System.out.println("**************************************************");
    return height ;
   
 

}
public static void main (String args[]){
details();                    //NAME FUNCTION CALLED 
height();                     // HEIGHT FUNCTION CALLED
    Scanner sc= new Scanner(System.in); //System.in is a standard input stream
    System.out.println("ENTER AGE  : ");  
    int age=sc.nextInt();                          //INPUT AGE 
    System.out.println("**************************************************");
    System.out.println("AGE IN YEARS " + age); //DISPLAY AGE
    System.out.println("**************************************************");
    
int n =sc.nextInt();

//HERE N IS THE ENTRY NUMBER IN HOSPITAL 

System.out.println("ENTRY NO : " + n);

 if (n%2!=0){
  System.out.println("**************************************************");
  System.out.println("THE PERSON HAS TO BE ADMITTED  ");
  System.out.println("**************************************************");
}
else if(n%2==0) {
  System.out.println("**************************************************");
  System.out.println("THE PERSON IS OKAY ");
  System.out.println("**************************************************");
}

   // P IS THE VARIABLE USED TO SHOW THE PATENT 
        for (int p=-10;p<=10;p++){
          System.out.println("PATIENT : " + p);
          if (p<0) {
            System.out.println("**************************************************");
            System.out.println("THE PERSON HAS TO BE TAKEN IN  ICU ");                  
            System.out.println("**************************************************");
             // HERE NEGATIVE NUMBER DEFINES THE REPORT IS NEGATIVE 
          }
          else {
            System.out.println("**************************************************");
            System.out.println("THE PERSON IS TAKEN IN GENERAL WARD");
            
            System.out.println("**************************************************");
            // HERE POSITIVE NUMBER DEFINES THAT REPORT IS POSITIVE
          }
            
        }
        
}
}

    
        