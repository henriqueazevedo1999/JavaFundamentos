package tarefacarro;

import java.util.Calendar;

public class Carro
{

    private String _placa;
    private String _modelo;
    private String _marca;
    private int _anoFabricacao;
    private String _cor;
    private int _capacidadeTanque;
    private float _kmLitro;

    public Carro(String placa)
    {
        _placa = placa;
    }

    public void setPlaca(String value)
    {
        _placa = value;
    }

    public String getPlaca()
    {
        return _placa;
    }

    public void setModelo(String value)
    {
        _modelo = value;
    }

    public String getModelo()
    {
        return _modelo;
    }

    public void setMarca(String value)
    {
        _marca = value;
    }

    public String getMarca()
    {
        return _marca;
    }

    public void setAnoFabricacao(int value)
    {
        _anoFabricacao = value;
    }

    public int getAnoFabricacao()
    {
        return _anoFabricacao;
    }

    public void setCor(String value)
    {
        _cor = value;
    }

    public String getCor()
    {
        return _cor;
    }

    public void setCapacidadeTanque(int value)
    {
        _capacidadeTanque = value;
    }

    public int getCapacidadeTanque()
    {
        return _capacidadeTanque;
    }

    public void setKmLitro(float value)
    {
        _kmLitro = value;
    }

    public float getKmLitro()
    {
        return _kmLitro;
    }

    public float CalcularAutonomia()
    {
        return _capacidadeTanque * _kmLitro;
    }

    public int CalcularIdade()
    {
        return Calendar.getInstance().get(Calendar.YEAR) - _anoFabricacao;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Placa: " + getPlaca());
        sb.append(System.getProperty("line.separator"));
        sb.append("Modelo: " + getModelo());
        sb.append(System.getProperty("line.separator"));
        sb.append("Marca: " + getMarca());
        sb.append(System.getProperty("line.separator"));
        sb.append("Ano de Fabricação: " + getAnoFabricacao());
        sb.append(System.getProperty("line.separator"));
        sb.append("Idade: " + CalcularIdade());
        sb.append(System.getProperty("line.separator"));
        sb.append("Cor: " + getCor());
        sb.append(System.getProperty("line.separator"));
        sb.append("Capacidade do tanque: " + getCapacidadeTanque());
        sb.append(System.getProperty("line.separator"));
        sb.append("Km por litro: " + getKmLitro());
        sb.append(System.getProperty("line.separator"));
        sb.append("Autonomia: " + CalcularAutonomia());
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }
}
