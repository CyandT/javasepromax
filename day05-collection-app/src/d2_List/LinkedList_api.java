package d2_List;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedLise的api
 */
public class LinkedList_api {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        //1.栈  先进后出，后进先出
        stack.push("子弹1");
        stack.push("子弹2");
        stack.push("子弹3");
        stack.push("子弹4");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

        //2.队列  先进先出，后进后出
        LinkedList<String> ranks = new LinkedList<>();
        ranks.addLast("Num 1 ");
        ranks.addLast("Num 2 ");
        ranks.addLast("Num 3 ");
        ranks.addLast("Num 4 ");

        System.out.println(ranks.removeFirst());
        System.out.println(ranks.removeFirst());
        System.out.println(ranks);
    }
}
