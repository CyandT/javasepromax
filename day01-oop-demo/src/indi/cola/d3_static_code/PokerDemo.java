package indi.cola.d3_static_code;

import java.util.ArrayList;

public class PokerDemo {
    /**
     *  制作扑克牌游戏
     */

    //1.定义一个公开的静态集合存放扑克牌
    public static ArrayList<String> Poker = new ArrayList<>();

    //2.使用静态代码块，保证运行前同类只加载一次
    static {

        //3.定义数组存放点数
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //4.定义数组存放花色
        String[] colors = {"♠","♥","♣","♦"};

        //5.循坏分配每张牌的花色
        for (int i = 0; i < sizes.length; i++) {
            //sizes[i] = "3.."
            for (int j = 0; j < colors.length; j++) {
                //color[i] = ”..“
                String cards = sizes[i] + colors[j];
                Poker.add(cards);
            }
        }
        Poker.add("大🃏");
        Poker.add("小🃏");
    }
    public static void main(String[] args) {
        System.out.println("新牌:"+Poker);
    }
}
