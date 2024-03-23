// if try and catch is not present then the execution will stop at the line of exception
public class  {
    public static void main(String[] args) {

        // int i = 4; --- no exception is present

        int i = 0; // exception is present
        int j = 0;

        try { // try -- try to execute the code

            j = 18 / i;// if it dont work then it will execute the catch block
            if(j==0){
                throw new ArithmeticException(); // throwing the exception
            }

        } 
        catch(ArithmeticException e){ //specific type of exception Arithmetic Exception only handles arithmetic issues
            System.out.println("cannot divide by zero");
        }
        catch (Exception e) { // catch -- try to catch the exception and only be executed when there is
                                // exception is present
                                //Exception handles all type of exceptions
            System.out.println("something went wrong"+e);
        }
        System.out.println(j);
        System.out.println("bye");
    }

}
