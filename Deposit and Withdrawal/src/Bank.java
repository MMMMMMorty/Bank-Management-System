import java.io.Serializable;

public class Bank implements Serializable{

    account[] ac = new account[1000];

    Bank(account[] ac) {
        this.ac = ac;
    }

    public void checkID(String ID) {//检查账户是否存在，若不存在则新建，账户余额初始值为0
        int i;
        for(i = 0;i< ac.length && ac[i].getName() != null;i++) {
            if(ID.equals(ac[i].getName())) {
                return;
            }
        }
        ac[i].setName(ID);
    }

    public String getMoney(String ID) {//查询到余额
        int x;
        for(x=0; x<ac.length; x++){
            if(ID.equals(ac[x].getName())){

                break;
            }
        }
        return  "Your money is: " + ac[x].getMoney();
    }

    public String putMoney(int inputMoney,String ID){//（地面上的人）存钱
        int money;
        int x;
        for(x=0; x<ac.length; x++){
            if(ID.equals(ac[x].getName())){
                money=ac[x].getMoney();
                ac[x].setMoney(money+inputMoney);
                break;
            }
        }
        return "Your money is "+ac[x].getMoney() + " now";
    }

    public String withdraw(int withdrawMoney,String ID){//（地面下的人）取钱
        int money;
        String str=null;
        for(int x=0; x<ac.length; x++){
            if(ID.equals(ac[x].getName())){
                money=ac[x].getMoney();
                if((money-withdrawMoney) <= 0) {
                    str="Money is not enough";
                }
                else {
                    ac[x].setMoney(money-withdrawMoney);
                    str="Your money is "+ac[x].getMoney() + " now";
                }
            }
        }
        return str;
    }
}