package PokerCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //生成并管理player
        PlayerContainer playerContainer = new PlayerContainer();

        //输入手牌信息
        Scanner in = new Scanner(System.in);

        String[] playerNameList = in.nextLine().split(" ");
        for (int i = 0; i < playerNameList.length; i++) {
            playerContainer.addPlayer(playerNameList[i]);
        }

        for (int i = 0; i < playerNameList.length; i++) {
            String[] handString = in.nextLine().split(" ");
//            Hand hand = new Hand(handString);
            playerContainer.getPlayerByName(playerNameList[i]).setHand(hand);
        }
/*
        ArrayList<String[]> handList = new ArrayList<>();
        String[] hand_1 = new String[]{"2S", "3S","2S","3S","4C"};
        String[] hand_2 = new String[]{"2S", "3S","2S","3S","4C"};
        String[] hand_3 = new String[]{"2S", "3S","2S","3C","4C"};
        handList.add(hand_1);
        handList.add(hand_2);
        handList.add(hand_3);

        for (int i = 1; i < 4; i++) {
            playerContainer.addPlayer(i+"");
            playerContainer.getPlayerByName(i+"").setHand(new Hand(handList.get(i-1)));
        }*/

        //比较hand大小
        WinnerDecider winnerDecider = WinnerDecider.getWinnerDecider();
        GameResult gameResult = winnerDecider.getWinner(playerContainer);


        //输出比较结果
        System.out.println(gameResult);

    }
}
