package quiz.o.mania;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("WELCOME " + name + " TP QUIZ-O-MANIA");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("New Times Roman", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
             "1. The quiz contains total 15 questions : 10 Questions of Java and 5 Questions of OS." + "<br><br>" +
                "2. Each correct answer will be rewarded with 1 points." + "<br><br>" +
                "3. You will be given 30 Seconds to answer every question." + "<br><br>" +
                "4. Failure to response within the time limit will move to the next question." + "<br><br>" +
                "5. One 50-50 Lifeline will also be available to utilize once in the whole quiz." + "<br><br>" +
                "6. We emphasize the importance of integrity during the the process." + "<br><br>" +
                "7. Be honest with yourself and strive for improvement." + "<br><br>" +
                
            "<html>"

        );
        add(rules);
        
        back = new JButton("BACK");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("START");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("USER");
    }
}
