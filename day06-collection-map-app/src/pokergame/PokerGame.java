package pokergame;

import d2_collections.Car;

import java.util.*;

/**
 * 斗地主游戏
 */
public class PokerGame {
    //1、定义一个静态集合存放卡牌
    public static List<Card> cardList = new ArrayList<>();

    //2、利用静态代码块实现组牌功能
    static {
        String [] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String [] colors = {"♠", "♥", "♣", "♦"};

        int index = 0;//记录牌的大小
            for (String size : sizes) {
                index++;
                for (String color : colors) {
                    Card cards = new Card(size, color,index);
                    cardList.add(cards);
                }
            }
        Card card1 = new Card("S","🃏",++index);
        Card card2 = new Card("B","🃏",++index);
        Collections.addAll(cardList,card1,card2);
        System.out.println("新牌:" + cardList);
        }

    public static void main(String[] args) {
        //3、洗牌
        Collections.shuffle(cardList);
        System.out.println("洗牌:" + cardList);

        //4、发牌。每个人都定义成一个集合接受所得的牌(轮循算法)
        List<Card> X = new ArrayList<>();
        List<Card> Y = new ArrayList<>();
        List<Card> Z = new ArrayList<>();

        for (int i = 0; i < cardList.size()-3; i++) {
            Card card = cardList.get(i);
            switch (i % 3){
                case 0:
                    X.add(card);
                    break;
                case 1 :
                    Y.add(card);
                    break;
                case 2:
                    Z.add(card);
                    break;
                default:
                    System.out.println("添加错误!");
            }
        }

        //5、对每个人手中的牌进行排序
        sortCard(X);
        sortCard(Y);
        sortCard(Z);

        //6、底牌
        List<Card> lastCard = new ArrayList<>();
        lastCard = cardList.subList(cardList.size()-3,cardList.size());

        System.out.println(X);
        System.out.println(Y);
        System.out.println(Z);
        System.out.println("底牌:" + lastCard );
        
    }

    private static void sortCard(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getIndex() - o1.getIndex();
            }
        });
    }

}
