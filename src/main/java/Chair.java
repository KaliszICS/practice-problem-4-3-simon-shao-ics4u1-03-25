/**
 * An object resembling a chair, contains the number of legs and material
 * @author Simon Shao
 * @version 1.0
 */

 public class Chair{

    private int legs;
    private String material;

    /**
     * sets the number of legs and material as given
     */
    public Chair(int legs, String material){
        this.legs = legs;
        this.material = material;
    }

    /**
     * sets the number of legs as given, defaults material to wood
     */

    public Chair(int legs){
        this(legs, "wood");
    }

    /**
     * defaults number of legs to 4 and material to wood
     */

    public Chair(){
        this(4, "wood");
    }



    /**
     * to access the number of legs
     * @return returns the number of legs
     */
    public int getLegs(){
        return this.legs;
    }

    /**
     * to access the material
     * @return returns the material
     */
    public String getMaterial(){
        return this.material;
    }

}