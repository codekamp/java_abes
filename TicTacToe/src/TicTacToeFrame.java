import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cerebro on 23/01/16.
 */
public class TicTacToeFrame extends JFrame implements ActionListener {
    private JLabel resultLabel;
    private JButton button00;
    private JButton button01;
    private JButton button02;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JPanel mainPanel;

    private int turn = 0;
    private boolean gameOver = false;

    public TicTacToeFrame() {
        super();

        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        this.mainPanel.getGraphics().drawImage()

        this.button00.addActionListener(this);
        this.button01.addActionListener(this);
        this.button02.addActionListener(this);
        this.button10.addActionListener(this);
        this.button11.addActionListener(this);
        this.button12.addActionListener(this);
        this.button20.addActionListener(this);
        this.button21.addActionListener(this);
        this.button22.addActionListener(this);
    }

    public static void main(String[] args) {
        new TicTacToeFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.turn++;

        JButton clickedButton = (JButton)e.getSource();

        if((this.turn % 2) == 0) {
            clickedButton.setText("O");
        } else {
            clickedButton.setText("X");
        }

        clickedButton.setEnabled(false);

        //code for testing result of game

        if((this.button00.getText() == this.button01.getText()) && (this.button01.getText() == this.button02.getText())) {
            this.playerWon(this.button00.getText());
        }
        if((this.button10.getText() == this.button11.getText()) && (this.button11.getText() == this.button12.getText())) {
            this.playerWon(this.button10.getText());
        }

        if((this.button00.getText() == this.button11.getText()) && (this.button11.getText() == this.button22.getText())) {
            this.playerWon(this.button00.getText());
        }

        if(!this.gameOver && (this.turn == 9)) {
            this.resultLabel.setText("match draw");
        }
    }

    public void playerWon(String symbol) {
        if(symbol == "X") {
            this.resultLabel.setText("Player 1 won!");
            this.disableAllButtons();
            this.gameOver = true;
        } else if(symbol == "O") {
            this.resultLabel.setText("Player 2 won!");
            this.disableAllButtons();
            this.gameOver = true;
        }
    }

    public void disableAllButtons() {
        this.button00.setEnabled(false);
        this.button01.setEnabled(false);
        this.button02.setEnabled(false);
        this.button10.setEnabled(false);
        this.button11.setEnabled(false);
        this.button12.setEnabled(false);
        this.button20.setEnabled(false);
        this.button21.setEnabled(false);
        this.button22.setEnabled(false);
    }
}
