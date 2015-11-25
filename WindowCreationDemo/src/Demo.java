import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * Created by cerebro on 23/11/15.
 */
public class Demo {
    public static void main(String[] args) {
        JFrame jframe1 = new JFrame();
//        jframe1.setSize(800, 800);
        jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add stuff to window here

        Stage2Screen mainPanel = new Stage2Screen();
        mainPanel.setPreferredSize(new Dimension(800, 450));
        mainPanel.setFocusable(true);
        mainPanel.requestFocus();

        mainPanel.addKeyListener(mainPanel);


        mainPanel.addMouseListener(mainPanel);

        jframe1.add(mainPanel);
        jframe1.setResizable(false);
        jframe1.pack();

//        JButton button1 = new JButton("Click Me!");
//        mainPanel.add(button1);
//
//        JButton button2 = new JButton("And me as well!");
//        mainPanel.add(button2);
//
//        JTextField textField1 = new JTextField("enter text here");
//        mainPanel.add(textField1);

        jframe1.setVisible(true);


        int velocityX = 5;
        int velocityY = 5;

        BufferedImage image1 = Stage2Screen.loadImage("run_anim1.png");
        BufferedImage image2 = Stage2Screen.loadImage("run_anim2.png");
        BufferedImage image3 = Stage2Screen.loadImage("run_anim3.png");
        BufferedImage image4 = Stage2Screen.loadImage("run_anim4.png");
        BufferedImage image5 = Stage2Screen.loadImage("run_anim5.png");
        BufferedImage playerImages[] = {image1, image2, image3, image4, image5, image4, image3, image2};
        int counter = 0;
        Random generator = new Random();

        while(true) {

            if(!mainPanel.isPaused) {

                counter++;

                counter = counter % 8;

                mainPanel.playerImage = playerImages[counter];

                mainPanel.playerVelocityY += mainPanel.playerAccY;
                mainPanel.playerY += mainPanel.playerVelocityY;

                if (mainPanel.playerY >= 450 - 45 - 90) {
                    mainPanel.playerY = 450 - 45 - 90;
                    mainPanel.playerVelocityY = 0;
                    mainPanel.playerAccY = 0;
                }

                if (mainPanel.cloud1X <= -100) {
                    mainPanel.cloud1Y = generator.nextInt(190) + 10;
                    mainPanel.cloud1X = 900;
                    mainPanel.cloud1Visible = true;
                }

                if (mainPanel.cloud2X <= -100) {
                    mainPanel.cloud2Y = generator.nextInt(190) + 10;
                    mainPanel.cloud2X = 900;
                }

                mainPanel.cloud1X -= 2;
                mainPanel.cloud2X -= 2;

                Rectangle playerRectangle = new Rectangle(100, mainPanel.playerY, 72, 90);
                Rectangle cloud1Rectangle = new Rectangle(mainPanel.cloud1X, mainPanel.cloud1Y, 128, 71);

                if(playerRectangle.intersects(cloud1Rectangle)) {
                    mainPanel.cloud1Visible = false;
                }

            }
            mainPanel.repaint();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
