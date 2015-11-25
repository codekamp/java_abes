import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 25/11/15.
 */
public class Demo implements ActionListener {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Interface demo ABES");

        frame.setSize(400, 400);

        JPanel mainPanel = new JPanel();
        frame.add(mainPanel);

        JButton button = new JButton("Duplicate Window!");
        mainPanel.add(button);

        button.addActionListener(new Demo());






        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("create window button clicked");



        JFrame frame = new JFrame("Interface demo ABES");

        frame.setSize(400, 400);

        JPanel mainPanel = new JPanel();
        frame.add(mainPanel);

        JButton button = new JButton("Duplicate Window!");
        mainPanel.add(button);

        button.addActionListener(this);






        frame.setVisible(true);
    }
}
