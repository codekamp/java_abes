import javax.swing.*;

/**
 * Created by cerebro on 23/01/16.
 */
public class WrestlerCard {
    public JPanel mainPanel;
    private JLabel nameLabel;
    private JLabel weightLabel;
    private JLabel heightLabel;

    public void setWrestler(Wrestler wrestler) {
        this.nameLabel.setText(wrestler.name);
        this.weightLabel.setText(Float.toString(wrestler.weight));
        this.heightLabel.setText(Integer.toString(wrestler.height));
    }

    public void reset() {
        this.nameLabel.setText("****");
        this.weightLabel.setText("****");
        this.heightLabel.setText("****");
    }
}