import java.io.*;

class project3ioBonus{
    public static void main(String[]args){
        System.out.println("Hi Friends! :)");
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader p = new BufferedReader(r);
        System.out.println("Enter height of the ladder:");
        int num =0;
        try{
            num=Integer.valueOf(p.readLine());
        }
        catch(Exception j){
            System.out.println("Invalid Number!");

        }
        for(int e=1; e<=num; e++){
            for( int c=1; c<num -(c-1); c++){
                System.out.print(" ");
            }
            for( int h=1; h<=e; h++){
                System.out.print("*");
                for( int h1=1; h1<h; h1+=h){
                System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        System.out.println();
        
    }
}