import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 21/01/16.
 */
public class ABESJFrame extends JFrame implements ActionListener {
    private JPanel mainPanel;

    private JButton changeColorButton;
    private JButton newWindowButton;
    private JLabel randomLabel;
    private ABESJFrame[] childWindows = new ABESJFrame[100];
    private int childCount = 0;

    public ABESJFrame() {
        super();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.mainPanel);

        this.changeColorButton.addActionListener(this);
        this.newWindowButton.addActionListener(this);
        this.changeColorButton.setActionCommand("change_color");

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "change_color") {
            this.changeLabelColor();
        } else {
            this.childWindows[this.childCount] = new ABESJFrame();
            this.childCount++;
        }
    }

    private void changeLabelColor() {
        this.randomLabel.setForeground(Color.red);
        for (int i = 0; i < this.childCount; i++) {
            this.childWindows[i].changeLabelColor();
        }
    }
}
