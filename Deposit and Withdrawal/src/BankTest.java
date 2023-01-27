import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankTest extends JFrame{
    JPanel p1=new JPanel(new GridLayout(10,2,3,3));
    JLabel ide=new JLabel("Please choose your identity (0-peopleontheground,1-peopleunderground) :");
    JTextField identity=new JTextField(null);
    JButton idbut=new JButton("Sure");
    String id=null;

    JLabel acc=new JLabel("Please enter account ID :");
    JTextField account=new JTextField(null);
    JButton acbut=new JButton("Sure");
    String accountid=null;

    JTextField money=new JTextField(null);
    JLabel temp1=new JLabel();
    JLabel temp2=new JLabel();

    JLabel ope=new JLabel("Please enter your opertion (0-putmoney,1-exist) :");
    JTextField opertion=new JTextField(null);
    JButton opbut=new JButton("Sure");
    String newopertion=null;

    JLabel num=new JLabel("Please enter number :");
    JTextField number=new JTextField(null);
    JButton nubut=new JButton("Sure");
    String newnumber=null;

    JTextField now=new JTextField(null);
    JLabel temp3=new JLabel();
    JLabel temp4=new JLabel();

    JLabel end=new JLabel("Thanks for your use.");

    JLabel temp5=new JLabel();
    JLabel temp6=new JLabel();
    JLabel temp7=new JLabel();
    JLabel temp8=new JLabel();
    JLabel temp9=new JLabel();
    public BankTest(){
        this.setLayout(new BorderLayout());
       // p1.setLayout(new GridLayout(10,3,3,3));
        this.add(p1,BorderLayout.NORTH);
        p1.add(ide);
        p1.add(identity);
        p1.add(idbut);
       // p1.add(temp2);

        p1.add(acc);
        p1.add(account);
        p1.add(acbut);
        //p1.add(temp1);

        p1.add(money);
        p1.add(temp5);
        p1.add(temp7);
        //p1.add(temp9);

        p1.add(ope);
        p1.add(opertion);
        p1.add(opbut);
        //p1.add(temp3);

        p1.add(num);
        p1.add(number);
        p1.add(nubut);
        p1.add(temp4);

        p1.add(now);
        p1.add(temp6);
        p1.add(temp8);


        p1.add(end);
        this.setSize(1000,600);
        this.setVisible(true);
        acc.setVisible(false);
        account.setVisible(false);
        money.setVisible(false);
        ope.setVisible(false);
        opertion.setVisible(false);
        num.setVisible(false);
        number.setVisible(false);
        now.setVisible(false);
        end.setVisible(false);

        acbut.setVisible(false);
        opbut.setVisible(false);
        nubut.setVisible(false);
        ide.setVisible(true);
        identity.setVisible(true);
        idbut.setVisible(true);
    }

    public static void main(String[] args) {
        BankTest bt=new BankTest();

        account[] ac = new account[1000];
        for(int i = 0;i < ac.length;i++) {
            ac[i] = new account();
        }

        /*try {

            File f = new File("/Users/mm/Documents/软件工程/software_experiment_the_nether_world_management_system/软工实验（存取钱）/src/bank .dat");//每次先将文件中内容读入到数组中，操作后重新存入文件中，起到更新作用
            if(!f.exists()) {
                f.createNewFile();
            }
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
            ac = (account[])in.readObject();

        }catch(Exception e) {
            e.printStackTrace();
        }*/
		
		/*for(int i = 0;i < 10;i++) {
			System.out.println(ac[i].getName() + ac[i].getMoney());
		}*/

        Bank bank = new Bank(ac);
        // System.out.print("Please choose your identity (0-peopleontheground,1-peopleunderground) :");//选择自己的身份
        bt.idbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bt.id = bt.identity.getText();
                bt.acc.setVisible(true);
                bt.account.setVisible(true);
                bt.acbut.setVisible(true);
                if (bt.id.equals("0") == true) {
                    bt.acbut.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            bt.accountid = bt.account.getText();
                    /*bank.checkID(bt.accountid);//检查账号是否存在
                    bt.money.setVisible(true);*/
                            // bt.money.setText(bank.getMoney(bt.accountid));//输入账号后直接显示余额
                            bt.money.setText("your money is 0");
                            bt.money.setVisible(true);
                            /*bt.temp5.setVisible(true);
                            bt.temp7.setVisible(true);
                            bt.temp9.setVisible(true);*/

                            bt.ope.setVisible(true);
                            bt.opertion.setVisible(true);
                            bt.opbut.setVisible(true);

                            bt.opbut.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    bt.newopertion = bt.opertion.getText();
                                    //int op = sc.nextInt();
                                    if (bt.newopertion.equals("0") == true) {
                                        bt.num.setVisible(true);
                                        bt.number.setVisible(true);
                                        bt.nubut.setVisible(true);
                                        bt.nubut.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                bt.newnumber = bt.number.getText();
                                                bt.now.setText("now your money is"+bt.newnumber);
                                                bt.now.setVisible(true);
                                                bt.end.setVisible(true);
                                            }
                                        });//输入存钱数
                                        //bt.now.setText(bank.putMoney(Integer.parseInt(bt.newnumber), bt.accountid));


                                    } else {
                                        bt.end.setVisible(true);
                                    }//退出

                                }
                            });//输入操作
                        }
                    });//输入账号ID
                }
                else{
                    bt.acbut.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            bt.accountid = bt.account.getText();
                    /*bank.checkID(bt.accountid);//检查账号是否存在
                    bt.money.setVisible(true);*/
                            // bt.money.setText(bank.getMoney(bt.accountid));//输入账号后直接显示余额
                            bt.money.setText("your money is 0");

                            bt.ope.setVisible(true);
                            bt.opertion.setVisible(true);
                            bt.opbut.setVisible(true);

                            bt.opbut.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    bt.newopertion = bt.opertion.getText();
                                    //int op = sc.nextInt();
                                    if (bt.newopertion.equals("0") == true) {
                                        bt.num.setVisible(true);
                                        bt.number.setVisible(true);
                                        bt.nubut.setVisible(true);
                                        bt.nubut.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                bt.newnumber = bt.number.getText();
                                                bt.now.setText("now your money is"+bt.newnumber);
                                                bt.now.setVisible(true);
                                                bt.end.setVisible(true);
                                            }
                                        });//输入存钱数
                                        //bt.now.setText(bank.putMoney(Integer.parseInt(bt.newnumber), bt.accountid));


                                    } else {
                                        bt.end.setVisible(true);
                                    }//退出

                                }
                            });//输入操作
                        }
                    });//输入账号ID
                }
            }
        });//选择身份


        /*else{
            bt.acc.setVisible(true);
            bt.account.setVisible(true);
            bt.acbut.setVisible(true);
            bt.acbut.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    bt.accountid=bt.account.getText();
                }
            });//输入账号ID

            //String ID = sc.next();
            bank.checkID(bt.accountid);//检查账号是否存在
            bt.money.setVisible(true);
            bt.money.setText(bank.getMoney(bt.accountid));//输入账号后直接显示余额

            //System.out.print("Please enter your opertion (0-putmoney,1-exist) :");//选择操作
            bt.ope.setVisible(true);
            bt.opertion.setVisible(true);
            bt.opbut.setVisible(true);
            bt.opbut.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    bt.newopertion=bt.opertion.getText();
                }
            });//输入操作
            if(bt.newopertion.equals("0")==true){
                bt.num.setVisible(true);
                bt.number.setVisible(true);
                bt.nubut.setVisible(true);
                bt.nubut.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        bt.newnumber=bt.number.getText();
                    }
                });//输入取钱数
                bt.now.setText(bank.withdraw(Integer.parseInt(bt.newnumber),bt.accountid));
            }
            else{
                bt.end.setVisible(true);
            }//退出
        }*/
        try {

            File f = new File("/Users/mm/Documents/软件工程/software_experiment_the_nether_world_management_system/软工实验（存取钱）/src/bank .dat");
            if(!f.exists()) {
                f.createNewFile();
            }
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
            out.writeObject(ac);
			
			/*for(int i = 0;i < 10;i++) {
				System.out.println(ac[i].getName() + " " + ac[i].getMoney());
			}*/


        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}