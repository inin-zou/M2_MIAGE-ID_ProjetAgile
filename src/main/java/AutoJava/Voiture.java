package AutoJava;

public class Voiture
{
    // instance variables
    private double prixVoiture;
    private String marqueVoiture;


    /**
     * Constructor for objects of class voiture
     */
    public Voiture()
    {
        // initialise instance variables
        prixVoiture = 10000;
        marqueVoiture = "Tesla";
    }
    public double getPrixVoiture()
    {
        return prixVoiture;
    }
    public void setPrixVoiture(double prixVoiture)
    {
        this.prixVoiture = prixVoiture;
    }
    public String getMarqueVoiture()
    {
        return marqueVoiture;
    }
    public void setMarqueVoiture(String marqueVoiture)
    {
        this.marqueVoiture = marqueVoiture;
    }


    public double promoVoiture(double y)
    {
        // put your code here
        return prixVoiture*y;
    }
}

