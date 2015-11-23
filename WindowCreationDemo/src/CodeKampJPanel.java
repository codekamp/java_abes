import javax.swing.*;
import java.awt.*;

/**
 * Created by cerebro on 23/11/15.
 */
public class CodeKampJPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.red);
        g.fillOval(300,300, 100,100);

        g.setColor(Color.green);
        g.fillRect(300, 100, 450, 50);
    }
}
