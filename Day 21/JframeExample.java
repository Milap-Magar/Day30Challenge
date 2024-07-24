import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomPaintingExample extends JFrame {
    public CustomPaintingExample() {
        setTitle("Custom Painting Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        CustomPanel panel = new CustomPanel();
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CustomPaintingExample::new);
    }
}

class CustomPanel extends JPanel {
    public CustomPanel() {
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked at: " + e.getPoint());
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);

        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 100);

        g.setColor(Color.GREEN);
        g.drawString("Custom Painting Example", 100, 200);
    }
}
