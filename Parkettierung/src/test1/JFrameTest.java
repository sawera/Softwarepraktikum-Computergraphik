package test1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JFrameTest {

    private JFrame mainMap;
    private Polygon poly;

    public JFrameTest() {

        initComponents();

    }

    private void initComponents() {

        mainMap = new JFrame();
        mainMap.setResizable(false);

        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        int xPoly[] = {150, 300, 355, 400, 450};
        int yPoly[] = {150, 100, 155, 225, 400};

        poly = new Polygon(xPoly, yPoly, xPoly.length);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.drawPolygon(poly);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(800, 600);
            }
        };
        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameTest();
            }
        });
    }
	

}
