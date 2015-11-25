import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by cerebro on 23/11/15.
 */
public class Stage2Screen extends JPanel implements KeyListener, MouseListener {
    public int cloud1X = 400;
    public int cloud1Y = 150;
    public int cloud2X = 900;
    public int cloud2Y = 70;
    public int playerVelocityY = 0;
    public int playerAccY = 0;
    public int playerY = 450 - 45 - 90;
    public boolean cloud1Visible = true;

    public boolean isPaused = false;

    BufferedImage playerImage = Stage2Screen.loadImage("run_anim1.png");
    BufferedImage grassImage = Stage2Screen.loadImage("grass.png");
    BufferedImage cloud1Image = Stage2Screen.loadImage("cloud1.png");
    BufferedImage cloud2Image = Stage2Screen.loadImage("cloud2.png");
    public Color skyBlueColor = new Color(208, 244, 247);

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.blue);
        g.fillRect(0,0,800,450);


        if (this.cloud1Visible) {
            g.drawImage(cloud1Image, cloud1X, cloud1Y, null);
        }

        g.drawImage(cloud2Image, cloud2X, cloud2Y, null);
        g.drawImage(playerImage, 100, playerY, null);
        g.drawImage(grassImage, 0, 450 - 45, null);
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


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE && this.playerY == 450 - 45 -90) {
            this.playerVelocityY = -20;
            this.playerAccY = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getX() > 750 && e.getY() < 50) {
            this.isPaused = !this.isPaused;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
