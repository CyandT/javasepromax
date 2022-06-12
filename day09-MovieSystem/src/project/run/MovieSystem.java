package project.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import project.bean.Business;
import project.bean.Customer;
import project.bean.Movie;
import project.bean.Users;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MovieSystem {

    public static final List<Users> ALL_USERS = new ArrayList<>();

    public static final Map<Business,List<Movie>> ALL_MOVIES = new HashMap<>();

    public static final Scanner SYS_SC = new Scanner(System.in);

    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");
    //定义一个静态用户保存当前登陆成功的对象
    public static Users LoginUser;
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /*
     3、准备一些测试数据
     */
    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassWord("123456");
        c.setRealName("黑马刘德华");
        c.setSex('男');
        c.setAccountMoney(10000);
        c.setTelephone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setRealName("黑马关之琳");
        c1.setSex('女');
        c1.setAccountMoney(2000);
        c1.setTelephone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setRealName("黑马包租公");
        b.setAccountMoney(0);
        b.setSex('男');
        b.setTelephone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b , movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassWord("123456");
        b2.setRealName("黑马包租婆");
        b2.setAccountMoney(0);
        b2.setSex('女');
        b2.setTelephone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies3 = new ArrayList<>();
        ALL_MOVIES.put(b2 , movies3); // b2 = []
    }
    public static void main(String[] args) {
        showMain();
    }

    /**
     * 主界面
     */
    private static void showMain() {
        while (true) {
            System.out.println("====================可乐电影系统主界面====================");
            System.out.println("1、登陆 :");
            System.out.println("2、客户注册 :");
            System.out.println("3、商家入驻 :");
            System.out.println("4、退出");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    System.out.println("退出成功!");
                    return;
                default:
                    System.out.println("您输入的命令有误!");
                    break;
            }
        }
    }

    /**
     * 登陆功能
     */
    private static void login() {
        System.out.println("====================可乐电影系统登陆界面====================");
        System.out.println("请您输入登陆名称 :");
        String loginName = SYS_SC.nextLine();
        while (true) {
            System.out.println("请您输入登陆密码 :");
            String passWord = SYS_SC.nextLine();

            Users u = getUserLoginName(loginName);
            if(u != null){
                if(u.getPassWord().equals(passWord)){
                     // 密码正确后，判断登陆的是用户还是商家
                    LoginUser = u;
                     if(u instanceof Customer){
                         showCustomerMain();
                     }else {
                         showBusinessMain();
                     }
                     return;
                }else {
                    System.out.println("密码输入错误!请重新输入!");
                }
            }else {
                System.out.println("此账户不存在! 请先注册您的账号!");
                return;
            }
        }
    }

    /**
     * 商家操作界面
     */
    private static void showBusinessMain() {
        while (true) {
            System.out.println("====================可乐电影系统商家界面====================");
            System.out.println(LoginUser.getRealName() + (LoginUser.getSex() == '男' ? "先生" : "女士") +
                    "您好，请您选择商家操作的功能 :");
            System.out.println("1、展示电影");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1" ->
                        // 展示全部排片信息
                        showMoviesMessage();
                case "2" ->
                        // 上架电影信息
                        shelvesMovieMessage();
                case "3" ->
                        // 下架电影信息
                        deleteMovie();
                case "4" ->
                        // 修改电影信息
                        updateMovieMessage();
                case "5" -> {
                    System.out.println(LoginUser.getRealName() + "请您下次再来啊~~~");
                    return; // 干掉方法
                }
                default -> System.out.println("不存在该命令！！");
            }
        }
    }

    /**
     * 修改电梯信息
     */
    private static void updateMovieMessage() {
        System.out.println("=========修改电影信息界面========");
        Business business = (Business) LoginUser;
        List<Movie> movies = ALL_MOVIES.get(business); // 由键得到值，值就是电影对象集合
        if(movies.size() == 0){
            System.out.println("对不起，您尚未上架影片~请先上架!");
            return;
        }

        while (true) {
            System.out.println("请您输入您要修改的影片 :");
            String movieName = SYS_SC.nextLine();
            Movie movie = searchMovieName(movieName);
            if(movie != null){
                if(movie.getName().equals(movieName)){
                    System.out.println("请输入修改后的电影名称 :");
                    String name = SYS_SC.nextLine();
                    System.out.println("请输入修改后的演员名称 :");
                    String actor = SYS_SC.nextLine();
                    System.out.println("请输入修改后的电影时长 :");
                    double time =  SYS_SC.nextDouble();
                    System.out.println("请输入修改后的电影票价 :");
                    int saleTicket = SYS_SC.nextInt();
                    System.out.println("请输入修改后的电影总票 :");
                    int lastTicket = SYS_SC.nextInt();
                    while (true) {
                        try {
                            System.out.println("请输入电影修改后的开始时间 :");
                            String startTime = SYS_SC.nextLine();

                            movie.setName(name);
                            movie.setActor(actor);
                            movie.setTime(time);
                            movie.setSaleTicket(saleTicket);
                            movie.setLastTicket(lastTicket);
                            movie.setStartTime(sdf.parse(startTime));

                            System.out.println("《" + movie.getName() + "》" + "修改成功!");
                            System.out.println("您还要继续修改电影吗?");
                            System.out.println("请输入Y/N");
                            String command = SYS_SC.nextLine();
                            switch (command){
                                case "y":
                                    break;
                                case "n":
                                    return;
                                default:
                                    System.out.println("您输入的命令有误!");
                            }
                            return;
                        } catch (ParseException e) {
                            e.printStackTrace();
                            LOGGER.error("时间解析有误!");
                        }
                    }
                }
            }else {
                System.out.println("你没有上架该电影");
                return;
            }
        }
    }

    /**
     * 下架电影
     */
    private static void deleteMovie() {
        System.out.println("=========电影下架界面========");
        Business business = (Business) LoginUser;
        List<Movie> movies = ALL_MOVIES.get(business); // 由键得到值，值就是电影对象集合
        if(movies.size() == 0){
            System.out.println("对不起，您尚未上架影片~请先上架!");
            return;
        }

        while (true) {
            System.out.println("请您输入您要下架的影片 :");
            String movieName = SYS_SC.nextLine();
            Movie movie = searchMovieName(movieName);
            if(movie != null){
                if(movie.getName().equals(movieName)){
                    movies.remove(movie);
                    System.out.println("《" + movie.getName() + "》" + "下架成功!");
                    System.out.println("您还要继续下架电影吗?");
                    System.out.println("请输入y/n");
                    String command = SYS_SC.nextLine();
                    switch (command){
                        case "y":
                            break;
                        case "n":
                            return;
                        default:
                            System.out.println("您输入的命令有误!");
                    }
                }
            }else {
                System.out.println("你没有上架该电影");
                return;
            }
        }
    }
    /**
     * 商家查找电影
     */
    private static Movie searchMovieName(String movieName) {
        Business business = (Business) LoginUser;
        List<Movie> movies = ALL_MOVIES.get(business); // 由键得到值，值就是电影对象集合
        for (Movie movie : movies) {
            if(movie.getName().contains(movieName)){
                return movie;
            }
        }
        return null;
    }

    /**
     * 上架电影
     */
    private static void shelvesMovieMessage() {
        System.out.println("=========电影上架界面========");
        Business business = (Business) LoginUser;
        List<Movie> movies = ALL_MOVIES.get(business); // 由键得到值，值就是电影对象集合
        // 输入电影各变量，封装到一个电影对象中，最后加到集合里
//        public Movie(String name, String actor,  double time, int saleTicket, int lastTicket, Date startTime)
        System.out.println("请输入电影名称 :");
        String name = SYS_SC.nextLine();
        System.out.println("请输入演员名称 :");
        String actor = SYS_SC.nextLine();
        System.out.println("请输入电影时长 :");
        double time =  SYS_SC.nextDouble();
        System.out.println("请输入电影票价 :");
        int saleTicket = SYS_SC.nextInt();
        System.out.println("请输入电影总票 :");
        int lastTicket = SYS_SC.nextInt();
        while (true) {
            try {
                System.out.println("请输入电影开始时间 :");
                String startTime = SYS_SC.nextLine();

                Movie movie = new Movie(name,actor,time,saleTicket,lastTicket,sdf.parse(startTime));
                movies.add(movie);
                System.out.println("《" + movie.getName() + "》" + "上架成功!");
                return;
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间解析有误!");
            }
        }

    }

    /**
     * 展示商家信息和电影信息
     */
    private static void showMoviesMessage() {
        System.out.println("=========欢迎进入展示界面========");
        LOGGER.debug("商家进入详细界面");
        // 转换当前对象类型，获得business私有的变量
        Business business = (Business) LoginUser;
        System.out.println(business.getShopName() + "\t\t电话：" + business.getTelephone()
                + "\t\t地址:" + business.getAddress() + "\t\t余额：" + business.getAccountMoney());
        //business作为Map集合的键 提取对应的值就是其排片信息 ：Map<Business , List<Movie>> ALL_MOVIES
        List<Movie> movies = ALL_MOVIES.get(business); // 由键得到值，值就是电影对象集合
        if(movies.size() > 0) {
            System.out.println("片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName()+"\t\t\t" + movie.getActor()+ "\t\t" + movie.getTime()
                        + "\t\t" + movie.getScores() + "\t\t" + movie.getSaleTicket() + "\t\t" + movie.getLastTicket() + "\t\t"
                        +   sdf.format(movie.getStartTime()));
            }
        }else {
            System.out.println("无影片上架~");
        }
    }

    /**
     * 用户操作界面
     */
    private static void showCustomerMain() {
        while (true) {
            System.out.println("============黑马电影客户界面===================");
            System.out.println(LoginUser.getRealName() + (LoginUser.getSex()=='男'? "先生":"女士" + "欢迎您进入系统" +
                    "\t余额：" + LoginUser.getAccountMoney()));
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息
                    showAllMoviesMessage();
                    break;
                case "2":
                    searchMovieByName();
                    break;
                case "3":
                    // 评分功能

                    break;
                case "4":
                    // 购票功能
                    buyTicket();
                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     * 用户购票
     */
    private static void buyTicket() {
        System.out.println("============购票界面===========");
        showAllMoviesMessage();
        while (true) {
            System.out.println("您选择你要浏览的影院 :");
            String businessName = SYS_SC.nextLine();
            Business business = searchBusinessShop(businessName);
            if(business != null){
                List<Movie> movies = ALL_MOVIES.get(business);
                if(movies.size() >0) {
                    while (true) {
                        System.out.println("请输入您要购票的电影 :");
                        String movieName = SYS_SC.nextLine();
                        Movie movie = getMovieByShopAndName(business,movieName);
                        if (movie != null) {
                            System.out.println("当前您账户的存款还有 :" + LoginUser.getAccountMoney());
                            while (true) {
                                System.out.println("请您输入您要购买的票数 :");
                                int buyTicket = SYS_SC.nextInt();
                                if (movie.getLastTicket() >= buyTicket) {
                                    double totalMoney = BigDecimal.valueOf(buyTicket).
                                            multiply(BigDecimal.valueOf(movie.getSaleTicket())).doubleValue();
                                    System.out.println("您一共购买" + buyTicket + "张票 ,需要支付 :" + totalMoney);
                                    if (LoginUser.getAccountMoney() >= totalMoney) {
                                        movie.setLastTicket(movie.getLastTicket() - buyTicket);
                                        business.setAccountMoney(business.getAccountMoney() + totalMoney);
                                        LoginUser.setAccountMoney(LoginUser.getAccountMoney() - totalMoney);
                                        System.out.println("买票成功~~ 当前您的账户余额为: " + LoginUser.getAccountMoney());
                                        return;
                                    } else {
                                        System.out.println("对不起!您的余额不足!请先充值!");
                                        // 钱不够！
                                        System.out.println("是否继续~~");
                                        System.out.println("是否继续买票？y/n");
                                        String command = SYS_SC.nextLine();
                                        switch (command) {
                                            case "y":
                                                break;
                                            default:
                                                System.out.println("好的！");
                                                return;
                                        }
                                    }
                                } else {
                                    System.out.println("对不起!当前票数还剩" + movie.getLastTicket());
                                }
                            }
                        } else {
                            System.out.println("您输入的电影名称有误!请重新输入 :");
                        }
                    }
                }else {
                    System.out.println("该商家尚未上架电影!");
                }
            }else {
                System.out.println("您输入的商家不存在!请重新输入!");
            }
        }
    }

    /**
     * 根据商家和电影名称得到电影
     * @return 返回一个电影对象
     */
    private static Movie getMovieByShopAndName(Business business,String MovieName) {
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if(movie.getName().equals(MovieName)){
                return movie;
            }
        }
        return null;
    }

    /**
     * 查询商家
     * @return 返回一个商家对象
     */
    private static Business searchBusinessShop(String businessName) {
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            if(business.getShopName().equals(businessName)){
                return business;
            }
        }
        return null;
    }

    /**
     * 根据电影名称查询电影信息
     */
    private static void searchMovieByName() {
        System.out.println("============电影详情界面===========");
        while (true) {
            System.out.println("请输入您要查询的电影名称");
            String name = SYS_SC.nextLine();
            Movie movie = getMovieName(name);
            if (movie != null) {
                System.out.println("片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
                System.out.println(movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime()
                        + "\t\t" + movie.getScores() + "\t\t" + movie.getSaleTicket() + "\t\t" + movie.getLastTicket() + "\t\t"
                        + sdf.format(movie.getStartTime()));
                return;
            } else {
                System.out.println("对不起!没有该电影，请重新输入!");
            }
        }
    }

    private static Movie getMovieName(String name) {
        Collection<List<Movie>> values = ALL_MOVIES.values();
        for (List<Movie> value : values) {
            for (Movie movie : value) {
                if(movie.getName().equals(name)){
                    return movie;
                }
            }
        }
        return null;
    }

    /**
     * 展示所有排片信息（顾客）
     */
    private static void showAllMoviesMessage() {
        System.out.println("============电影展示界面===========");
        ALL_MOVIES.forEach((business, movies) ->{
        System.out.println(business.getShopName() + "\t\t电话：" + business.getTelephone()
                            + "\t\t地址:" + business.getAddress());
        System.out.println("片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
        for (Movie movie : movies) {
            System.out.println(movie.getName()+"\t\t\t" + movie.getActor()+ "\t\t" + movie.getTime()
                    + "\t\t" + movie.getScores() + "\t\t" + movie.getSaleTicket() + "\t\t" + movie.getLastTicket() + "\t\t"
                    +   sdf.format(movie.getStartTime()));
        }
        }
        );
    }

    /**
     * 遍历整个集合判断用户名
     * @param loginName 登陆名称
     * @return 返回值为一个用户对象
     */
    public static Users getUserLoginName(String loginName){
        for (Users allUser : ALL_USERS) {
             if(allUser.getLoginName().equals(loginName)){
                 return allUser;
             }
        }
        return null;
    }
}
