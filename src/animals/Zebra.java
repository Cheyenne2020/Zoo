package animals;

import types.Equine;


/**
 * Write a description of class animals.Ring_Tailed_Lemurs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zebra extends Equine
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Zebra
     */
    public Zebra()
    {
        super("Strips the Zebra", "black and white strips");
        this.age = "young";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * 
     */
    @Override
    public String makeNoise()
    {
        // put your code here
        return "bray and snort";
    }
}
