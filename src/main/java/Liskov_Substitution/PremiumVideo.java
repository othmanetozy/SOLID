package Liskov_Substitution;

public class PremiumVideo extends Video{
    private int premiumId;

    @Override
    public void playRandomAd() throws Exception{
        throw new Exception("No ads for Premium Video");
    }
}
