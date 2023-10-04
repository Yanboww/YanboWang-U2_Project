import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        //create new scanner object
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your first Coordinate point: ");
        String coord1 =  s.nextLine();
        //use the string coord1 to get its  coordinate substrings using indexOf and length method
        int x1 = Integer.parseInt(coord1.substring(1,coord1.indexOf(",")));
        int y1 = Integer.parseInt(coord1.substring(coord1.indexOf(",")+1,coord1.length()-1));
        System.out.print("Enter your second coordinate point: ");
        String coord2 = s.nextLine();
        int x2 = Integer.parseInt(coord2.substring(1,coord2.indexOf(",")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(",")+1,coord2.length()-1));
        //creates LinearEquation object
        LinearEquation idk = new LinearEquation(x1,y1,x2,y2,coord1,coord2);
        //prints out info
        System.out.println(idk);
        //asks for the last value
        System.out.print("Enter a third x value: ");
        String transX3 = s.nextLine();
        //parse string into double and then use the value in calcY method in a string
        double x3 = Double.parseDouble(transX3);
        System.out.println("Solve coordinate point is: " + idk.calcY(x3));





    }
}
