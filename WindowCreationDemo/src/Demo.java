import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

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
        jframe1.add(mainPanel);
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
        while(true) {

            counter++;

            counter = counter % 8;

            mainPanel.playerImage = playerImages[counter];

            if(mainPanel.ballX == 0) {
                velocityX = 5;
            }
            if(mainPanel.ballX == 750) {
                velocityX = -5;
            }
            if(mainPanel.ballY == 0) {
                velocityY = 5;
            }
            if(mainPanel.ballY == 750) {
                velocityY = -5;
            }

            mainPanel.ballX += velocityX;
            mainPanel.ballY += velocityY;


            mainPanel.repaint();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
