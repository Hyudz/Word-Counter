import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    public static void main(String[] args) {

        JFrame thiss = new JFrame();

        JLabel tittle = new JLabel();
        tittle.setText("Word Counter");
        tittle.setBounds(50, -25, 500, 100);
        tittle.setFont(new Font("Poppins", Font.BOLD, 50));
        thiss.add(tittle);

        JEditorPane field = new JEditorPane();
        field.setBounds(10, 50, 465, 375);
        thiss.add(field);

        JLabel text = new JLabel("Convert now!");
        text.setSize(500, 25);
        text.setLocation(190, 430);
        thiss.add(text);

        JButton button = new JButton("Count Words");
        button.setSize(125, 25);
        button.setFocusable(false);
        button.setLocation(25, 430);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String fieldText = field.getText();
                String[] indexes = fieldText.split(" ");
                if (field.getText().equalsIgnoreCase("")) {
                    text.setText("There are " + 0 + " word(s)");
                } else {
                    text.setText("There are " + indexes.length + " word(s)");
                }

            }

        });
        thiss.add(button);

        thiss.setLayout(null);
        thiss.setSize(500, 500);
        thiss.setResizable(false);
        thiss.setTitle("Word Counter");
        thiss.setVisible(true);
        thiss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
