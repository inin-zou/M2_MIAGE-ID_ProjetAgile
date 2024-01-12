package AutoJava;

public class AudioSystem
{
    // instance variables
    private double prixAudio;
    private String marqueAudio;
    private Voiture voiture;

    /**
     * Constructor for objects of class AudioSystem
     */
    public AudioSystem()
    {
        // initialise instance variables
        prixAudio = 5000;
        marqueAudio = "Bose";
    }
    public double getPrixAudio()
    {
        return prixAudio;
    }
    public void setPrixAudio(double prix)
    {
        this.prixAudio = prix;
    }


    public double promoAudio(double promo)
    {
        return prixAudio * promo;
    }

    public double sumPrix(Voiture voiture)
    {
        return prixAudio + voiture.getPrixVoiture();
    }

    public double PrixBlackFriday(Voiture voiture, double promo)
    {
        return prixAudio*promo + voiture.promoVoiture(promo);
    }

}

