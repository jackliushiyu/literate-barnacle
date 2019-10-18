package SimpleGame;


import java.util.ArrayList;
import java.util.Scanner;

class SimpleDotComGame {
    private String[] index_y = {"A","B","C","D","E","F","G"};
    private ArrayList<String> loc = new ArrayList<>();
    void startGame(){
        System.out.println("GAME START");
        System.out.println("create target");
        //创建3个目标
        int location_x = (int)(Math.random()*4);
        int location_y = (int)(Math.random()*4);
        loc.add(String.valueOf(location_x));
        loc.add(String.valueOf(location_x+1));
        loc.add(String.valueOf(location_x+2));
        SimpleDotCom company = new SimpleDotCom();
        company.setLocationCells(loc);
        System.out.println("create complete");
        while (true){
            //输入目标
            System.out.println("please input the target");
            Scanner scanner = new Scanner(System.in);
            String guess =scanner.next();
            String result = company.checkYourself(guess);
            if(result.equals("kill")){
                System.out.println("Game Over");
                break;
            }
        }

    }

}
