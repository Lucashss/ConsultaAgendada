    // Faz parte do Terceiro Construtor
public class Hora 
{
    private int hora2;
    private int min2;
    private int seg2;

    public void setHoras(int a, int b, int c) 
    {
        this.hora2 = a;
        this.min2 = b;
        this.seg2 = c;
    }

    public String getHoras() 
    {
        String hr = (this.hora2 + ":" + this.min2 + ":" + this.seg2);
        return hr;
    }
}