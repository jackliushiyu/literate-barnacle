package SimpleGame;

import java.util.ArrayList;

class SimpleDotCom {
    private ArrayList<String> locationCells;
    //private int[] locationCells;
    //private int hitNum =0;

    void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    String checkYourself(String guess){
        String result = "miss";
        int index = locationCells.indexOf(guess);
        if (index>=0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "kill";
            }else{
                result = "hit";
            }
        }
        /*
        for (int locationCell : locationCells) {
            if (locationCell == guess2) {
                result = "hit";
                hitNum++;
                break;
            }
        }
        if(hitNum==3){
            result="kill";
        }*/
        System.out.println(result);
        return result;
    }


}
