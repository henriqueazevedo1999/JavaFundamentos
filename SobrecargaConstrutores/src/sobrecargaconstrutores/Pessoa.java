package sobrecargaconstrutores;

public class Pessoa
{

    private String _nome;
    private int _idade;
    private float _peso;
    private float _altura;

    //Construtores com sobrecarga
    private Pessoa()
    {
    }

    private Pessoa(String nome, int idade)
    {
        this();
        _nome = nome;
        _idade = idade;
    }

    public Pessoa(String nome, int idade, float peso, float altura)
    {
        this(nome, idade);
        _peso = peso;
        _altura = altura;
    }

    public void setNome(String value){
        _nome=value;
    }
    public String getNome(){
        return _nome;
    }
    
    public void setIdade(int value){
        _idade=value;
    }
    public int getIdade(){
        return _idade;
    }
    
    public void setPeso(float value){
        _peso=value;
    }
    public float getPeso(){
        return _peso;
    }
    
    public void setAltura(float value){
        _altura=value;
    }
    public float getAltura(){
        return _altura;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome...: " + _nome);
        sb.append(System.getProperty("line.separator"));
        sb.append("Idade..: " + _idade);
        sb.append(System.getProperty("line.separator"));
        sb.append("Peso...: " + _peso);
        sb.append(System.getProperty("line.separator"));
        sb.append("Altura.: " + _altura);
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }
}
