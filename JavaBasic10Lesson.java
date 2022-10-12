/**
 *Java Basic. Home work - 10.
 *
 * @author Maksym Samohorodskyi
 * @todo 10.10
 * @date 12.10
 **/

package swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class JavaBasic10Lesson extends JFrame {

    final private Color COLORS[] = {Color.pink, Color.magenta,
            Color.red, Color.green, Color.blue, Color.black};
    private Random random = new Random();

    public static void main(String[] args) {
        new JavaBasic10Lesson();
    }

    public JavaBasic10Lesson() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 500);

        CanvasPanel canvasPanel = new CanvasPanel();
        canvasPanel.setBackground(Color.lightGray);

        Button button = new Button("Repaint");
        button.addActionListener(e -> {
            System.out.println("Repaint");
            canvasPanel.repaint();
        });

        add(canvasPanel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class CanvasPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            //рисуем что хотим
            for (int i = 0; i < 100; i++) {
                g.setColor(COLORS[random.nextInt(COLORS.length)]);
                int x = random.nextInt(500);
                int y = random.nextInt(400);
                int dx = random.nextInt(100);
                int dy = random.nextInt(100);
                if (random.nextBoolean()) {
                    g.fillRect(x, y, dx, dy);
                } else {
                    g.fillOval(x, y, dx, dy);
                }
            }
        }
    }
}
