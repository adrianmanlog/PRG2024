package tema1;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ej9 extends JFrame {

    private JPanel contentPane;

    public ej9() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0, 0, 800, 600);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ej9 frame = new ej9();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void paint(Graphics g) {
 	super.paint(g);

	g.setColor(Color.orange);
	g.fillRect(0, 500, 1000, 500);
	g.fillRect(500, 430, 25, 85);

	g.setColor(Color.green);
	g.fillOval(480, 390, 65, 65);

	g.setColor(Color.yellow);
	g.fillOval(400, 250, 75, 75);

	g.setColor(Color.blue);
	g.fillOval(288, 360, 25, 25);
	
	g.setColor(Color.black);
	g.drawOval(400, 250, 75, 75);
	g.drawOval(288, 360, 25, 25);
	g.fillRect(290, 450, 25, 50);
	g.drawRect(250, 400, 100, 100);
	int[] vx2 = {250, 300, 350};
	int[] vy2 = {400, 325, 400};
	g.drawPolygon(vx2, vy2, 3);
	


    }

}