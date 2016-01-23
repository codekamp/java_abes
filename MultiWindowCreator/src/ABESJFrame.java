import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 20/01/16.
 */
public class ABESJFrame extends JFrame implements ActionListener {

    public JButton changeColorButton;
    public JButton newWindowButton;
    public JLabel randomLabel;
    private ABESJFrame[] childWindows = new ABESJFrame[100];
    private int childCount = 0;

    public ABESJFrame() {
        super();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        this.setContentPane(mainPanel);
        mainPanel.setPreferredSize(new Dimension(600, 400));

        this.changeColorButton = new JButton("change color");
        this.changeColorButton.setActionCommand("change_color");
        this.newWindowButton = new JButton("Create Clone");
        this.randomLabel = new JLabel("Some random string");

        this.changeColorButton.addActionListener(this);
        this.newWindowButton.addActionListener(this);

        mainPanel.add(this.changeColorButton);
        mainPanel.add(this.newWindowButton);
        mainPanel.add(this.randomLabel);

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
