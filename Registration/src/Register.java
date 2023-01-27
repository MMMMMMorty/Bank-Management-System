import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class Register extends JFrame{
    JPanel panel=new JPanel();

    JLabel title;
    JPanel paneltemp=new JPanel();
    JButton button_register=new JButton("REGISTER");
    JPanel panel1=new JPanel();
    JLabel name_label=new JLabel("name");
    JTextField name_area=new JTextField();

    JLabel sex_label=new JLabel("sex");
    JTextField sex_area=new JTextField();

    JLabel member1=new JLabel("the first family member information:");
    JPanel pmember1=new JPanel();
    JLabel member1_identity=new JLabel("identity in family");
    JLabel member1_name=new JLabel("name");
    JLabel member1_job=new JLabel("job");
    JTextField member1identity=new JTextField();
    JTextField member1name=new JTextField();
    JTextField member1job=new JTextField();

    JLabel member2=new JLabel("the second family member information:");
    JPanel pmember2=new JPanel();
    JLabel member2_identity=new JLabel("identity in family");
    JLabel member2_name=new JLabel("name");
    JLabel member2_job=new JLabel("job");
    JTextField member2identity=new JTextField();
    JTextField member2name=new JTextField();
    JTextField member2job=new JTextField();

    JLabel dead_time=new JLabel("time of death");
    JTextField deadtime=new JTextField();

    JLabel dead_age=new JLabel("age at the time of death");
    JTextField deadage=new JTextField();

    JLabel reason=new JLabel("reason for death");
    JTextField deadreason =new JTextField();

    JLabel dead_job =new JLabel("job");
    JTextField deadjob=new JTextField();

    JLabel dead_account=new JLabel("account");
    JTextField deadaccount=new JTextField();

    JLabel negative_record=new JLabel("any negative record");
    JTextField negativerecord=new JTextField();

    JLabel dead_penalty=new JLabel("any penalty");
    JTextField penalty=new JTextField();

    JLabel dead_honesty=new JLabel("the degree of honesty");
    JTextField honesty=new JTextField();

    JButton button_assure=new JButton("COMPLETE");
    int i;
    public Register(dead_people p,int i) throws IOException {
           this.i=i;
            this.setLayout(new BorderLayout());
            panel.setLayout(new GridLayout(26, 2));
            panel.setBackground(Color.pink);
            panel1.setBackground(Color.pink);
            paneltemp.setBackground(Color.pink);
            pmember1.setBackground(Color.pink);
            pmember2.setBackground(Color.pink);
            title=new JLabel("This is the NO."+i+" person's information.");
            panel.add(title);
            panel.add(paneltemp);
            panel.add(button_register);
            panel.add(panel1);
        panel.add(name_label);
        panel.add(name_area);

        panel.add(sex_label);
        panel.add(sex_area);

        panel.add(member1);
        panel.add(pmember1);

        panel.add(member1_identity);
        panel.add(member1identity);

        panel.add(member1_name);
        panel.add(member1name);

        panel.add(member1_job);
        panel.add(member1job);

        panel.add(member2);
        panel.add(pmember2);

        panel.add(member2_identity);
        panel.add(member2identity);

        panel.add(member2_name);
        panel.add(member2name);

        panel.add(member2_job);
        panel.add(member2job);

        panel.add(dead_time);
        panel.add(deadtime);

        panel.add(dead_age);
        panel.add(deadage);

        panel.add(reason);
        panel.add(deadreason);

        panel.add(dead_job);
        panel.add(deadjob);

        panel.add(dead_account);
        panel.add(deadaccount);

        panel.add(negative_record);
        panel.add(negativerecord);

        panel.add(dead_penalty);
        panel.add(penalty);

        panel.add(dead_honesty);
        panel.add(honesty);

        panel.add(button_assure);
            this.add(panel, BorderLayout.NORTH);
            this.setSize(600, 1000);
            this.setVisible(true);



            button_assure.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    p.name = name_area.getText();
                    p.sex = sex_area.getText();

                    p.family_member1.identity = member1identity.getText();
                    p.family_member1.name = member1name.getText();
                    p.family_member1.job = member1job.getText();
                    p.family_member2.identity = member2identity.getText();
                    p.family_member2.name = member2name.getText();
                    p.family_member2.job = member2job.getText();

                    p.dead_time = deadtime.getText();
                    String temp = deadage.getText();
                    p.dead_age = Integer.parseInt(temp);
                    p.dead_reason = deadreason.getText();
                    p.job = deadjob.getText();
                    p.personal_account = deadaccount.getText();
                    p.negative_record = negativerecord.getText();
                    p.penalty = penalty.getText();
                    p.honesty = honesty.getText();

                }
            });
        }
        public static void main(String[] args) throws IOException {
            final int MAX_NUM = 100;
            dead_people[] p = new dead_people[MAX_NUM];
            Register re=new Register(p[0],1);
            /*for(int i=0;i<MAX_NUM;i++){
                p[i]=new dead_people();
            }
            for(int i=0;i<MAX_NUM;i++){
                Register re=new Register(p[i],i+1);
            }*/
        }

}
