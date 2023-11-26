package single_responsability;

import java.util.ArrayList;

public class Board {
    ArrayList<String> spots;

    public Board(){
        this.spots=new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }
    }
    public ArrayList<String> FristRow (){
        ArrayList<String> fisrtrow = new ArrayList<String>();
        fisrtrow.add(this.spots.get(0));
        fisrtrow.add(this.spots.get(1));
        return fisrtrow;
    }

    public ArrayList<String> SecondRow (){
        ArrayList<String> secondrow = new ArrayList<String>();
        secondrow.add(this.spots.get(6));
        secondrow.add(this.spots.get(7));
        return secondrow;
    }
}
