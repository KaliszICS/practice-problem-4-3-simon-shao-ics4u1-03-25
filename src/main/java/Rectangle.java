/**
 * An object that contains length and width of a rectangle
 * @author Simon Shao
 * @version 1.0
 */

public class Rectangle{

    private double width;
    private double length;

    /**
     * sets the values of width and length as given
     */
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    /**
     * sets the values of length as given, defaults width to 8.0
     */

    public Rectangle(double length){
        this(length, 8.0);
    }

    /**
     * defaults width to 8.0 and legnth to 4.0
     */

    public Rectangle(){
        this(4.0, 8.0);
    }



    /**
     * to access the length
     * @return returns the length
     */
    public double getLength(){
        return this.length;
    }

    /**
     * to access the width
     * @return returns the width
     */
    public double getWidth(){
        return this.width;
    }

}