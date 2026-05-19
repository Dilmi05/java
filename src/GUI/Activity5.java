package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class OurFrame extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3;
    JLabel label;

    OurFrame(){
        ButtonGroup group = new ButtonGroup();
        r1=new JRadioButton("Orange");
        r2=new JRadioButton("Mango");
        r3=new JRadioButton("Apple");

        group.add(r1);
        group.add(r2);
        group.add(r3);

        label = new JLabel("Not Selected");

        this.setLayout(new FlowLayout());
        this.add(r1);
        this.add(r2);
        this.add(r3);
        this.add(label);


        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
    }

    @Override
     public void actionPerformed(ActionEvent e){
        if(r1.isSelected()){
            label.setText(r1.getText());
        }

        if(r2.isSelected()){
            label.setText(r2.getText());
        }

        if(r3.isSelected()){
            label.setText(r1.getText());
    }



    }
}


public class Activity5 {

    public static void main(String args[]){

        OurFrame frame = new OurFrame();
        frame.setTitle("Document");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);

    }
}
