package heranca;

public class Cavalo extends Animal
{

    public Cavalo(String sRaca)
    {
        SetRaca(sRaca);
    }
    
    private String sRaca;
    
    public String GetRaca()
    {
        return sRaca;
    }
    
    public void SetRaca(String sRaca)
    {
        this.sRaca = sRaca;
    }
    
    public String Fugir()
    {
        return "Cavalo fugindo";
    }

    @Override
    public String Comer()
    {
       return "Cavalo comendo" ;
    }
}
