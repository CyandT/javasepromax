package project.bean;

public class Users {
    private String loginName;
    private String passWord;
    private String realName;
    private char sex;
    private String telephone;
    private double accountMoney;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public Users(String loginName, String passWord, String realName, char sex, String telephone, double accountMoney) {
        this.loginName = loginName;
        this.passWord = passWord;
        this.realName = realName;
        this.sex = sex;
        this.telephone = telephone;
        this.accountMoney = accountMoney;
    }

    public Users() {
    }
}
