package playjava;       //EXTENTION OF PROJECT(like .java) or the folder it is found inside

import java.util.Scanner;   //INpUT UTILITY

 class PlayJava{        //ACTUAL NAME OF CLASS 
    public static void main(String args[]){     //MAIN FXN....static specifier returnType and main fxn...PSV in short
        
               for (int i = 1; i <= 5; i++) {
for (int j = 5; j >= i; j--){
        System.out.print("*");
}
        System.out.println ( );
}
               
      for (int i = 5; i >= 0; i--) {
for (int j = 1; j <= i; j++){
System.out.print("*");
}
System.out.println ( );
}
      
      for (int i = 1; i <= 5; i++) {
for (int j = 1; j <= i; j++){
System.out.print (j);
}
System.out.println ( );
}
      
      
      
       /*   TUTS 1
        System.out.println("hello wolrd");
        int x=24;
        System.out.print("i live at house number ");
        System.out.println(x);
       
        Scanner pkay = new Scanner(System.in);  //creating object of the Scanner class
        System.out.println(pkay.nextLine());
        */
        
       /* TUT 2
       Scanner erb = new Scanner(System.in);        //creates an obj to be used by other variables
       double num1, num2, sum;
       System.out.println("enter your first number ");
       num1 = erb.nextDouble();                             //to use the object add its datatype which is found in it 
       System.out.println("enter your second number ");
       num2 = erb.nextDouble();
       sum = num1 + num2;
       System.out.println("the sum of the numbers is ");
       System.out.println(sum);
       */
       
       /* tut 3
       int age;
       age = 6;
       switch (age){
           case 1:
               System.out.println("you can talk");
               break;
           case 2:
               System.out.println("this is case two");
               break;
           case 3:
               System.out.println("this is case 3");
               break;
           default:
               System.out.println("this is the default");
               break; 
       }
       */
       
       
       /*TUT 4 FOR JAVACLASS CLASS
       javaClass classObject = new javaClass(); //dealt with the java class
       classObject.message();   //message in classObj, Object in JavaClass
       */
       
       
       /* TUT 5 FOR NAME CLASS
       Scanner nameInput = new Scanner(System.in);  //CREATE input
       name nameObject = new name();    //CREATE CLASS object in name class
       
       System.out.println("kindly enter your name");    //PROMPT
       String dzin = nameInput.nextLine();  //TAKE INPUT....method parameter equalized to store the scanner var + its string
       nameObject.myName(dzin);     //OUTPUT INPUT......object dot metho
       */
       
       /* TUT 6 for manyclass
       Scanner input = new Scanner(System.in);      //creat in input dyanamically...1st use 
       manyClass classObj = new manyClass();        //creat class object dynamically...2nd use but two times
       
       System.out.println("enter the name of your girl");   //prompt
       String temp = input.nextLine();      //temp var to hold input
       classObj.setName(temp);      //class object + fxn in other class for assignation 
       classObj.message();        //class object + output message
       
                                    // in sum, scanner, classObj, prompt, tempStorVar, Obj+methods
       */
       
       /*   TUT 7 for constructors
       constructor classObj = new constructor("Enyonam");       //allows assignation of value without input
       constructor classObj2 = new constructor("Debora");       //allows assignation of another value
       classObj.message();
       classObj2.message();
       */
        
       

      
       
    }
} 