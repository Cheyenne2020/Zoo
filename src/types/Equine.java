package types;
import main.*;
import animal_qualities.Walking;

public class Equine extends Animal implements Walking {
    public Equine()
    {
        super("primate", "a lot of monkey types");

    }
    public Equine(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "neighs";
    }
    public String eat()
    {
        return "grass";
    }
    public String walk() {return "runs and walks";}

}
