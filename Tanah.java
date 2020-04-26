public class Tanah
{
    private String tanahjajahan ;
    private int panjang ;
    private int lebar ;
    private double mahar ; 
    
    public Tanah(String tanahjajahan , int panjang ,int lebar, double mahar)
    {
        this.tanahjajahan = tanahjajahan ;
        this.panjang = panjang ;
        this.lebar = lebar ;
        this.mahar = mahar ;
    }

    //this is set method
    public void setTanahJajahan(String x )
    {
        tanahjajahan = x ;
    }
    public void setPanjang(int x)
    {
         panjang = x ; 
    }
    public void setLebar(int x)
    {
         lebar = x ; 
    }
    public void setMahar(double x)
    {
        mahar = x ;
    } 

    //this is get method 
    public String getTanahJajahan() 
    { 
        return tanahjajahan ;
    }
    public int getPanjang()
     { 
         return panjang ;
        }
    public int getLebar() 
    {
         return lebar ;
        }
    public double getMahar() 
    { 
        return mahar ;
    }  


    //processor method
    public int ukurLuaspersegi()
    {
        return this.getPanjang() * this.getLebar() ;
    }
    
    public double kiraMaharTanah(int x)
    {
        mahar = 0.0 ;
        if(tanahjajahan.equalsIgnoreCase("Inderaputera"))
        {
            mahar = x * 5000 ;
        }
        else if (tanahjajahan.equalsIgnoreCase("Srivijaya"))
        {
            mahar = x * 4000 ; 
        }
        else if (tanahjajahan.equalsIgnoreCase("TanahJawi"))
        {
            mahar = x * 3500 ;
        }
        else if (tanahjajahan.equalsIgnoreCase("Fatani"))
        {
            mahar = x * 3800 ; 
        }
        return mahar ;
    }

    public Tanah bandingLuasTanah(Tanah x , Tanah y)
    {
        if(x.ukurLuaspersegi() > y.ukurLuaspersegi())
        {
            return x ;
        }
        else
        {
            return y ;
        }
    }
}