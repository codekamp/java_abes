import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cerebro on 23/01/16.
 */
public class GameWindow extends JFrame implements ActionListener {
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

    private List<Wrestler> player1Wrestlers = new ArrayList<Wrestler>();
    private List<Wrestler> player2Wrestlers = new ArrayList<Wrestler>();

    private int turn = 0;

    public GameWindow() {
        super();

        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.player1Card = new WrestlerCard();
        this.player2Card = new WrestlerCard();

        this.player1CardPanel.add(this.player1Card.mainPanel);
        this.player2CardPanel.add(this.player2Card.mainPanel);

        this.shuffleButton.addActionListener(this);

        List<Wrestler> allWrestlersList = Wrestler.deck();
        Collections.shuffle(allWrestlersList);

        int count = 0;
        while (!allWrestlersList.isEmpty()) {
            count++;

            if((count % 2) == 0) {
                this.player2Wrestlers.add(allWrestlersList.remove(0));
            } else {
                this.player1Wrestlers.add(allWrestlersList.remove(0));
            }
        }

        this.playButton.setEnabled(false);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GameWindow();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.turn++;

        this.player1Card.reset();
        this.player2Card.reset();

        Collections.shuffle(this.player1Wrestlers);
        Collections.shuffle(this.player2Wrestlers);

        if((this.turn % 2) == 0) {
            this.player2Card.setWrestler(this.player2Wrestlers.get(0));
        } else {
            this.player1Card.setWrestler(this.player1Wrestlers.get(0));
        }

        this.shuffleButton.setEnabled(false);
        this.playButton.setEnabled(true);
    }
}
