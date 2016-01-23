import javax.swing.*;
import java.awt.*;

/**
 * Created by cerebro on 22/01/16.
 */
public class CaculatorJFrame extends JFrame {
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel mainPanel;
    private JPanel internalPanel;

    public CaculatorJFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.mainPanel);

        this.button1.setForeground(Color.red);

        this.button1.ena
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {

        new CaculatorJFrame();

    }
}
