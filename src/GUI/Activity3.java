package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Frame extends JFrame  implements ActionListener {

    JButton button;
    JTextArea textArea;

    Frame(){
        textArea = new JTextArea(10,40);

        button = new JButton("Add Text");


        this.setLayout(new FlowLayout());

        button.addActionListener(this);
        this.add(textArea);
        this.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){
            System.out.println(textArea.getText());
        }

    }
}

public class Activity3 {
    public static void main(String args[]){

        Frame frame = new Frame();
        frame.setTitle("Application");
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);


    }
}
