public class LinearEquation {
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


    public LinearEquation(int x1, int y1, int x2, int y2,String coord1, String coord2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.coord1 = coord1;
        this.coord2 = coord2;
    }



    public double findSlope()
    {
        slope = Math.round((double)(y1-y2)/(x1-x2)*100)/100;
        this.slope = slope;
        return slope;

    }

    public double getYInt()
    {
        yInt  = Math.round((y2 - x2*slope)*100)/100;
        return yInt;
    }

    public String findFormula()
    {   double top = y2-y1;
        double bottom = x2-x1;
        formula = "y = " + top + "/" + bottom + "x + " + yInt;
        return formula;
    }

    public double getDistance()
    {
        distance = Math.round((Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y2,2)))*100)/100;
        return distance;
    }

    public String CalcY(double x)
    {
        double y = Math.round((slope*x + yInt)*100)/100;
        String coordinate = "(" + x +"," + y + ")";
        return coordinate;
    }
    public String toString()
    {
        String summary = "First Pair: " + coord1 + "\nSecond Pair: " + coord2 + "\n";
        summary += "Slope of line: " + slope + "\nY-intercept: " + yInt + "\n" ;
        summary += "Slope intercept form: " + formula + "\nDistance between points: " + distance;
        return summary;
    }
}
