import java.io.Serializable;

class account implements Serializable{//账户（属于地面下的人）
    private int money;
    private String name;
    public account(int money,String name){
        this.money=money;
        this.name=name;
    }
    public account() {}
    public int getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public void setName(String name) {
        this.name = name;
    }
}
