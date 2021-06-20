package heranca;

public abstract class Animal
{
    private float fTamanho;
    private String sCor;
    
    public float GetTamanho()
    {
        return fTamanho;
    }
    
    public String GetCor()
    {
        return sCor;
    }
    
    public void SetTamanho(float fTamanho)
    {
        this.fTamanho = fTamanho;
    }
    
    public void SetCor(String sCor)
    {
        this.sCor = sCor;
    }
    
    abstract String Comer();
}
