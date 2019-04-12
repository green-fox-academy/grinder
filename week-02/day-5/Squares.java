import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Squares {
    public static void mainDraw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));

            int x = 0;
            int y = 0;
            int size = WIDTH;
            int count = 10;
            g.setColor(Color.pink);
            lines(g, x, y, size, count);

    }

    public static void lines(Graphics g, int x, int y, int size, int count) {

        if (count > 0) {
            lines(g, x, y + size / 3, size / 3, count - 1);
        }
        if (count > 0) {
            lines(g, x + size / 3, y, size / 3, count - 1);
        }
        if (count > 0) {
            lines(g, x + size / 3 * 2, y + size / 3, size / 3, count - 1);
        }
        if (count > 0) {
            lines(g, x + size / 3, y + size / 3 * 2, size / 3, count - 1);
        }

            g.drawLine(x + 0, y + size / 3, x + size, y + size / 3);
            g.drawLine(x + 0, y + (int) (size / 3 * 2), x + size, y + (int) (size / 3 * 2));
            g.drawLine(x + size / 3, y + 0, x + size / 3, y + size);
            g.drawLine(x + (int) (size / 3 * 2), y + 0, x + (int) (size / 3 * 2), y + size);

        }



    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
