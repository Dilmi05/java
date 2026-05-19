package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class NewFrame extends JFrame  implements ActionListener {

    JLabel label;
    JButton button;
    JTextField textField;
    NewFrame(){

        textField = new JTextField();
        textField.setColumns(15);
        //textField.setText("Welcome");

        button=new JButton("Click");

        label = new JLabel("Empty field");

        this.setLayout(new FlowLayout());
        this.add(textField);
        this.add(button);
        this.add(label);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            label.setText(textField.getText());
        }

    }
}

public class Activity2 {
    public static void main(String args[]){

        NewFrame  frame = new NewFrame();
        frame.setTitle("Application");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);
    }
}
