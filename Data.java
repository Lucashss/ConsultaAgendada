
    // Faz parte do Terceiro Construtor
public class Data 
{
    private int dia2;
    private int mes2;
    private int ano2;

    public String getDatas() 
    {
        String dt = (dia2 + "/" + mes2 + "/" + ano2);
        return dt;
    }

    public void setDatas(int a, int b, int c)
    {
        this.dia2 = a;
        this.mes2 = b;
        this.ano2 = c;
    }


}