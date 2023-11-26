package Liskov_Substitution;

public class Video {
    private String title;
    private int time;
    private int likes;
    private int views;

    public double getNumbersOfNumbersPlayer(){
        return (time/ 3600)*views;
    }
    public void playRandomAd () throws Exception{
        // implements
    }
}
