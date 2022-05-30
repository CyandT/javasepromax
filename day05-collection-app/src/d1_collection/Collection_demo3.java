package d1_collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_demo3 {
    public static void main(String[] args) {
        Collection<Movie> mv = new ArrayList<>();

        mv.add(new Movie("我和我的祖国",9.0,"易烊千玺"));
        mv.add(new Movie("战狼",8.8,"吴京"));

        for (Movie movie : mv) {
            System.out.println("片名:"+movie.getName());
            System.out.println("评分:"+movie.getScores());
            System.out.println("演员:"+movie.getActor());
            System.out.println("-------------------");
        }
    }
}
