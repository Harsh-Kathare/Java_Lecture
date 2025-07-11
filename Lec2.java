public class Lec2 {
    public static void main(String[] args){

        /*
        Two types of variable:1.Primitive(like cash in hand) 2.Reference(like cheque)
         */

        // Two steps to create a variable
        //1.declaration
        //2.assignment

        //primitive variables
        int age = 18;
        double cgpa = 9.5;//same like float
        char initial = 'H';//only single character
        boolean isStudent = true;

        System.out.println("My age is:" + age);
        System.out.println("My CGPA is:" + cgpa );
        System.out.println("My name's initial is:" + initial);
        System.out.println(isStudent);

        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

        //Reference(String,Array,Object)
        String name = "Harsh";
        System.out.println("My name is:" + name);
    }
}
