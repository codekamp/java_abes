import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 27/10/15.
 */
public class Calculator extends JFrame implements ActionListener {
    private JButton buttonSix;
    private JButton button8;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonNine;
    private JButton button12;
    private JButton buttonZero;
    private JButton button16;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonFour;
    private JButton buttonFive;
    private JPanel mainPanel;
    private JButton buttonOne;
    private JTextField textField1;
    private JButton buttonAdd;
    private JButton buttonEqualTo;


    Double firstNumber = 0.0;
    String operation;
    Boolean enteringNumber = false;

    public Calculator() {
        this.setContentPane(mainPanel);
        this.pack();
        this.setVisible(true);

        this.buttonOne.addActionListener(this);
        this.buttonTwo.addActionListener(this);
        this.buttonAdd.addActionListener(this);
        this.buttonEqualTo.addActionListener(this);

        this.buttonOne.setActionCommand("digit_pressed");
        this.buttonTwo.setActionCommand("digit_pressed");

        this.buttonAdd.setActionCommand("add");
        this.buttonEqualTo.setActionCommand("calculate");
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand() == "digit_pressed") {
            JButton clickedButton = (JButton) e.getSource();

            this.digitPressed(clickedButton.getText());
        } else if(e.getActionCommand() == "calculate") {
            this.calculate();
        } else {
            this.operationPressed(e.getActionCommand());
        }
    }


    private void digitPressed(String digit) {
        if(this.enteringNumber) {
            this.textField1.setText(this.textField1.getText() + digit);
        } else {
            this.textField1.setText(digit);
        }

        this.enteringNumber = true;
    }

    private void operationPressed(String operation) {
        this.operation = operation;
        this.firstNumber = Double.parseDouble(this.textField1.getText());
        this.enteringNumber = false;
    }

    private void calculate() {
        this.enteringNumber = false;
        Double secondNumber = Double.parseDouble(this.textField1.getText());
        Double result = 0.0;
        if(this.operation == "add") {
            result = this.firstNumber + secondNumber;
        }


        this.textField1.setText(Double.toString(result));
    }

}
