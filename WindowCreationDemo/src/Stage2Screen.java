import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by cerebro on 23/11/15.
 */
public class Stage2Screen extends JPanel {

    public int ballX = 100;
    public int ballY = 0;
    BufferedImage playerImage = Stage2Screen.loadImage("run_anim1.png");
    BufferedImage grassImage = Stage2Screen.loadImage("grass.png");
    public Color skyBlueColor = new Color(208, 244, 247);

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(this.skyBlueColor);
        g.fillRect(0,0,800,450);

        g.drawImage(playerImage, 100, 450 - 45 - 90, null);
        g.drawImage(grassImage, 0, 450 - 45, null);


//        g.fillOval(ballX, ballY, 50, 50);
    }

    public static BufferedImage loadImage(String filename) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(Stage2Screen.class
                    .getResourceAsStream("/" + filename));
        } catch (IOException e) {
            System.out.println("Error while reading: " + filename);
            e.printStackTrace();
        }
        return img;
    }
}
