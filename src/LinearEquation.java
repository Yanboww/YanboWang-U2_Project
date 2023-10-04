public class LinearEquation {
    //instance variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String coord1;
    private String coord2;
    private double slope;
    private double yInt;
    private String formula;
    private double distance;

    //one constructor to set up the essential information
    public LinearEquation(int x1, int y1, int x2, int y2,String coord1, String coord2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.coord1 = coord1;
        this.coord2 = coord2;
    }


//finds the slope of the coordinates using the slope formula and round using the Math class
    public double findSlope()
    {
        slope = Math.round((double)(y1-y2)/(x1-x2)*100.0)/100.0;
        return slope;

    }

    //gets the y-intercept by rewriting the equation and round using Math class
    public double getYInt()
    {
        yInt  = Math.round((y2 - x2*slope)*100.0)/100.0;
        return yInt;
    }

    //calculates the numerator and denominator then concatenate them with other instance variables
    public String findFormula()
    {   int top = y2-y1;
        int bottom = x2-x1;
        formula = "y = " + top + "/" + bottom + "x + " + yInt;
        return formula;
    }
    //use the distance formula and Math methods before rounding
    public double getDistance()
    {
        distance = Math.round(Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2))*100.0)/100.0;
        return distance;
    }
    //calculate the y value of x value by getting x as an argument and use the slop formula. Then reformat y and x into coordinate points
    public String calcY(double x)
    {
        double y = Math.round((slope*x + yInt)*100.0)/100.0;
        String coordinate = "(" + x +"," + y + ")";
        return coordinate;
    }
    //return relevant information about the object
    public String toString()
    {
        findSlope();
        getYInt();
        findFormula();
        getDistance();
        String summary = "First Pair: " + coord1 + "\nSecond Pair: " + coord2 + "\n";
        summary += "Slope of line: " + slope + "\nY-intercept: " + yInt + "\n" ;
        summary += "Slope intercept form: " + formula + "\nDistance between points: " + distance;
        return summary;
    }
}
