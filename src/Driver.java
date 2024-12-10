import java.io.IOException;
import java.util.Scanner;

public class Driver{
    public static void main(String[] args) throws IOException {
        Scanner scnrI = new Scanner (System.in);
        Scanner scnrW = new Scanner (System.in);
        int userChoice;
        char uOpt;
        System.out.println("Please make a selection (Y/N)");
        uOpt = scnrW.nextLine().charAt(0);
        while(uOpt == 'y' || uOpt == 'Y'){
            System.out.println("Please enter a number between 1 and 10");
            userChoice = scnrI.nextInt();
            PolygonType poly =new PolygonType(userChoice);
            poly.getNumToImage();
            
            
            System.out.println("Would you like to continue? (Y/N)");
            uOpt = scnrW.nextLine().charAt(0);
        }
        System.out.println("Bye Bye :)");
        
        
    }
}
