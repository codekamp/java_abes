import javax.swing.*;

/**
 * Created by cerebro on 23/01/16.
 */
public class GameWindow extends JFrame {
    private JButton shuffleButton;
    private JButton playButton;
    private JLabel player1CardCountLabel;
    private JLabel player2CardCountLabel;
    private JPanel player1CardPanel;
    private JPanel player2CardPanel;
    private JComboBox attributeComboBox;
    private JPanel mainPanel;
    private WrestlerCard player1Card;
    private WrestlerCard player2Card;

    public GameWindow() {
        super();

        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.player1Card = new WrestlerCard();
        this.player2Card = new WrestlerCard();

        this.player1CardPanel.add(this.player1Card.mainPanel);
        this.player2CardPanel.add(this.player2Card.mainPanel);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GameWindow();


    }

}
