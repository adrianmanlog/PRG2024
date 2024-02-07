package tema1;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ej11 extends JFrame {

    private JPanel contentPane;

    public ej11() {
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
                    ej11 frame = new ej11();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void paint(Graphics g) {
 	super.paint(g);

	//Colores
	Color morado = new Color (172, 129, 186);
	Color blanco= new Color (255, 255, 255);
	Color cyan= new Color (74, 152, 245);	

	//Fondo morado
	g.setColor(morado);
	g.fillRect(0, 0, 800, 600);
	
	//Primer circulo exterior blanco
	g.setColor(blanco);
	g.fillOval(135, 70, 500, 500);

	//Segundo circulo 
	g.setColor(Color.black);
	g.fillOval(185, 120, 400, 400);

	//Tercer circulo 
	g.setColor(cyan);
	g.fillOval(235, 170, 300, 300);

	//Cuarto circulo
	g.setColor(Color.red);
	g.fillOval(285, 220, 200, 200);

	//Quinto circulo 
	g.setColor(Color.yellow);
	g.fillOval(335, 270, 100, 100);

	//Circulos negros divisores
	g.setColor(Color.black);
	g.drawOval(134, 70, 501, 501);
	g.drawOval(160, 95, 450, 450);
	g.drawOval(259, 195, 250, 250);
	g.drawOval(285, 220, 200, 200);
	g.drawOval(310, 245, 150, 150);
	g.drawOval(334, 269, 102, 102);
	g.drawOval(360, 295, 50, 50);
	g.drawOval(372, 308, 25, 25);

	//Circulo interior blanco divisor
	g.setColor(blanco);
	g.drawOval(210, 145, 350, 350);

	//Texto
	g.setColor(Color.black);
	g.drawString("10", 390, 325);
	g.drawString("9", 420, 325);
	g.drawString("8", 450, 325);
	g.drawString("7", 475, 325);
	g.drawString("6", 500, 325);
	g.drawString("5", 525, 325);
	g.drawString("2", 600, 325);
	g.drawString("1", 625, 325);

	g.setColor(Color.white);
	g.drawString("4", 550, 325);
	g.drawString("3", 575, 325);

    }

}