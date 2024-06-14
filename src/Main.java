import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Main {


    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        Panel panel = new Panel();

        //Obejos
        JButton boton = new JButton("Calcular");
        boton.setBounds(115, 75, 100, 50);

        JTextField texto = new JTextField();
        texto.setBounds(25, 25, 125, 40);

        JTextField texto_2 = new JTextField();
        texto_2.setBounds(175, 25, 125, 40);


        //Variables para diseño
        String ingre = "Ingrese la masa en Kg";
        texto.setText(ingre);

        String ingre_2 = "Ingrese la Altura";
        texto_2.setText(ingre_2);

        //Diseño
        texto_2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (texto_2.getText().equals(ingre_2)) {
                    texto_2.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (texto_2.getText().isEmpty()) {
                    texto_2.setText(ingre_2);
                    texto_2.setForeground(Color.LIGHT_GRAY);
                }
            }
        });
        texto.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (texto.getText().equals(ingre)) {
                    texto.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (texto.getText().isEmpty()) {
                    texto.setText(ingre);
                }
            }
        });


        //Accion
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tex = texto.getText();
                String textoalt = texto_2.getText();

                double altura = Double.parseDouble(textoalt);
                double masa_1 = Double.parseDouble(tex);

                double altura2 = altura * altura;

                double total = masa_1 / altura2;

                String ya = Double.toString(total);

                JPanel Panel_2 = new JPanel();
                Panel_2.setBounds(65,140,200,125);
                Panel_2.setOpaque(true);
                Panel_2.setBackground(Color.WHITE);

                if (total < 18.5) {
                    JLabel resultado_1 = new JLabel(ya);
                    resultado_1.setBounds(65,10,75,40);
                    resultado_1.setOpaque(true);
                    resultado_1.setForeground(Color.BLACK);

                    JLabel mensaje = new JLabel("Bajo Peso");
                    mensaje.setBounds(20,60,180,40);
                    mensaje.setFont(new Font("Arial" ,Font.BOLD, 15));

                    Panel_2.revalidate();
                    Panel_2.repaint();
                    Panel_2.add(mensaje);
                    Panel_2.add(resultado_1);
                } else if (total >=18.6 && total <= 24.9) {
                    JLabel resultado_2 = new JLabel(ya);
                    resultado_2.setBounds(65,10,75,40);
                    resultado_2.setOpaque(true);
                    resultado_2.setForeground(Color.BLACK);

                    JLabel mensaje_2 = new JLabel("Saludable");
                    mensaje_2.setBounds(20,60,180,40);
                    mensaje_2.setFont(new Font("Arial" ,Font.BOLD, 15));

                    Panel_2.revalidate();
                    Panel_2.repaint();
                    Panel_2.add(mensaje_2);
                    Panel_2.add(resultado_2);
                } else if (total >= 25 && total <= 29.9) {
                    JLabel resultado_3 = new JLabel(ya);
                    resultado_3.setBounds(65,10,75,40);
                    resultado_3.setOpaque(true);
                    resultado_3.setForeground(Color.BLACK);

                    JLabel mensaje_3 = new JLabel("Sobrepeso");
                    mensaje_3.setBounds(20,60,180,40);
                    mensaje_3.setFont(new Font("Arial" ,Font.BOLD, 15));

                    Panel_2.revalidate();
                    Panel_2.repaint();
                    Panel_2.add(mensaje_3);
                    Panel_2.add(resultado_3);
                } else {
                    JLabel resultado_4 = new JLabel(ya);
                    resultado_4.setBounds(65,10,75,40);
                    resultado_4.setOpaque(true);
                    resultado_4.setForeground(Color.BLACK);

                    JLabel mensaje_4 = new JLabel("Obesidad");
                    mensaje_4.setBounds(20,60,180,40);
                    mensaje_4.setFont(new Font("Arial" ,Font.BOLD, 15));


                    Panel_2.revalidate();
                    Panel_2.repaint();
                    Panel_2.add(mensaje_4);
                    Panel_2.add(resultado_4);
                }



                ventana.revalidate();
                ventana.repaint();
                ventana.add(Panel_2);
            }
        });


        ventana.setLayout(null);
        ventana.setVisible(true);
        ventana.add(texto);
        ventana.add(texto_2);
        ventana.add(panel);
        ventana.add(boton);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setTitle("Indice de Masa Corporal");
    }

}
