import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Panel extends JPanel {
    public Panel() {
        setBounds(325, 25, 200, 250);
        setLayout(null);
        Border borde = BorderFactory.createLineBorder(Color.BLACK, 2);
        setBorder(borde);

        Border borde_2 = BorderFactory.createLineBorder(Color.BLACK,2);
        //datos para ver si es buen IMC agregandolo al panel
        JLabel titulo = new JLabel("I.M.C");
        titulo.setBounds(0,0,99,49);
        titulo.setOpaque(true);
        titulo.setBackground(new Color(43, 80, 255));
        titulo.setFont(new Font("Arial", Font.BOLD,15));
        titulo.setForeground(Color.WHITE);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setVerticalAlignment(SwingConstants.CENTER);
        titulo.setBorder(borde_2);

        JLabel categoria = new JLabel("Categorias");
        categoria.setBounds(101,0,99,49);
        categoria.setOpaque(true);
        categoria.setBackground(new Color(43, 80, 255));
        categoria.setFont(new Font("Arial", Font.BOLD,15));
        categoria.setForeground(Color.WHITE);
        categoria.setHorizontalAlignment(SwingConstants.CENTER);
        categoria.setVerticalAlignment(SwingConstants.CENTER);
        categoria.setBorder(borde_2);

        JLabel pordeba = new JLabel("Por debajo "+"\n"+"de 18.5" );
        pordeba.setBounds(0,51,99,49);
        pordeba.setBackground(new Color(161, 161, 161));
        pordeba.setOpaque(true);
        pordeba.setFont(new Font("Arial",Font.BOLD,10));
        pordeba.setForeground(Color.BLACK);
        pordeba.setHorizontalAlignment(SwingConstants.CENTER);
        pordeba.setVerticalAlignment(SwingConstants.CENTER);
        pordeba.setBorder(borde_2);

        JLabel peso = new JLabel("Bajo Peso");
        peso.setBounds(101,51,99,49);
        peso.setBackground(new Color(161, 161, 161));
        peso.setOpaque(true);
        peso.setBorder(borde_2);
        peso.setForeground(Color.BLACK);

        JLabel sal = new JLabel("18.5 a 24.9");
        sal.setBounds(0,101,99,49);
        sal.setOpaque(true);
        sal.setBorder(borde_2);
        sal.setForeground(Color.BLACK);

        JLabel saludable = new JLabel("Saludable");
        saludable.setBounds(101,101,99,49);
        saludable.setOpaque(true);
        saludable.setBorder(borde_2);
        saludable.setForeground(Color.BLACK);

        JLabel sob = new JLabel("25.0 a 29.9");
        sob.setBounds(0,151,99,49);
        sob.setBackground(new Color(161, 161, 161));
        sob.setOpaque(true);
        sob.setBorder(borde_2);
        sob.setForeground(Color.BLACK);

        JLabel sobrepeso = new JLabel("Sobrepeso");
        sobrepeso.setBounds(101,151,99,49);
        sobrepeso.setOpaque(true);
        sobrepeso.setBackground(new Color(161, 161, 161));
        sobrepeso.setBorder(borde_2);
        sobrepeso.setForeground(Color.BLACK);


        JLabel ob = new JLabel("30.0 a 39.9");
        ob.setBounds(0,201,99,49);
        ob.setOpaque(true);
        ob.setBorder(borde_2);
        ob.setForeground(Color.BLACK);

        JLabel obesidad = new JLabel("Obesidad");
        obesidad.setBounds(101,201,99,49);
        obesidad.setOpaque(true);
        obesidad.setBorder(borde_2);
        obesidad.setForeground(Color.BLACK);

        //agregar los datos al panel
        add(titulo);
        add(categoria);
        add(pordeba);
        add(sal);
        add(sob);
        add(ob);
        add(peso);
        add(saludable);
        add(sobrepeso);
        add(obesidad);

    }

}

