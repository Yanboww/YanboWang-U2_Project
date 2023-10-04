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
        System.out.print("Enter your second cooridnate point: ");
        String coord2 = s.nextLine();
        int x2 = Integer.parseInt(coord2.substring(1,coord2.indexOf(",")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(",")+1,coord2.length()-1));
        //creates LinearEquation object
        LinearEquation idk = new LinearEquation(x1,y1,x2,y2,coord1,coord2);
        System.out.println(idk);





    }
}
