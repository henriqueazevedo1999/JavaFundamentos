package heranca;

public class Leao extends Animal
{
    private boolean bJuba = false;
    
    public boolean GetJuba()
    {
        return bJuba;
    }
    
    public void SetJuba(boolean bJuba)
    {
        this.bJuba = bJuba;
    }
    
    public String Cacar()
    {
        return "Leao cacando";
    }

    @Override
    public String Comer()
    {
        return "Leao comendo";
    }
}
