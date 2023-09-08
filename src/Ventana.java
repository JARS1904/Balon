import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Ventana extends JFrame {
    private int contador = 0;
    private Timer timer;
    private int x = 30,y = 30, w = 150, h = 150;

    public Ventana() {
        this.setTitle("Ejercicio balon");
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        InicializarComponentes();
    }

    public void InicializarComponentes() {
        JPanel panel = new JPanel();
        panel.setSize(500, 500);
        this.getContentPane().add(panel);
        panel.setBounds(30,25,625,620);
        panel.setBackground(Color.white);
        panel.setLayout(null);

        ImageIcon imagen = new ImageIcon("balon.jfif");
        JLabel etiqueta = new JLabel();
        etiqueta.setLayout(null);
        etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH)));
        panel.add(etiqueta);

        timer = new Timer(-1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (contador < 410) {
                    etiqueta.setBounds(x, y, w, h);
                }
                else if (contador == 410) {
                    JOptionPane.showMessageDialog(null,"Gooooooooooooooooool");
                }
                else {
                    timer.stop();
                }
                x+=1;
                y+=1;
                contador++;
            }
        });
        timer.start();
    }

}
