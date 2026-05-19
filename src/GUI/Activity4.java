package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class OneFrame extends JFrame implements ActionListener {

    JCheckBox check1,check2;
    JTextField textField;
    OneFrame(){

        check1=new JCheckBox("Bold");
        check2 =new JCheckBox("Italic");

        textField = new JTextField(20);

        this.setLayout(new FlowLayout());
        this.add(check1);
        this.add(check2);
        this.add(textField);

        check1.addActionListener(this);
        check2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int bold =0;
        int italic =0;
        if(check1.isSelected()){
            bold = Font.BOLD;
         }

        if(check2.isSelected()){
            italic = Font.ITALIC;
         }

        textField.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));    }
}
public class Activity4 {

    public static void main(String args[]){

        OneFrame frame = new OneFrame();
        frame.setTitle("Document");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);

    }
}
