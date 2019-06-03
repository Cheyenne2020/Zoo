package animals;
import types.Primate;

public class Ring_Tailed_Lemurs extends Primate
{
    private String age;

    public Ring_Tailed_Lemurs()
    {
        super("Lolo the Ring Tailed Lemur", "brown with a black and white stripped tail");
        this.age = "very young";
    }
    @Override
    public String makeNoise()
    {
        // put your code here
        return "various vocalizations";
    }

}
