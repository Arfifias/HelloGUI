import javax.swing.*;
import java.awt.*;


public class helloThere extends JFrame{

    public JButton button;
    public JButton again;
    public JLabel label;
    public JPanel panel;

    public JLabel h;
    public JLabel e2;
    public JLabel l;
    public JLabel l1;
    public JLabel o;

    helloThere(){


        button = new JButton("Hello");
        button.setFont(new Font("Verdana",Font.ITALIC,20));
        button.setForeground(new Color(255,255,255));
        button.setBackground(new Color(0,0,0));
        button.setFocusable(false);
        button.setBounds(215,700,250,140);
        button.addActionListener(e -> h.setVisible(true));
        button.addActionListener(e -> e2.setVisible(true));
        button.addActionListener(e -> l.setVisible(true));
        button.addActionListener(e -> l1.setVisible(true));
        button.addActionListener(e -> o.setVisible(true));



        again = new JButton("Again");
        again.setFont(new Font("Verdana",Font.ITALIC,20));
        again.setForeground(new Color(255,255,255));
        again.setBackground(new Color(0,0,0));
        again.setFocusable(false);
        again.setBounds(575,700,250,140);
        again.addActionListener(e -> h.setVisible(false));
        again.addActionListener(e -> e2.setVisible(false));
        again.addActionListener(e -> l.setVisible(false));
        again.addActionListener(e -> l1.setVisible(false));
        again.addActionListener(e -> o.setVisible(false));


        label = new JLabel("Hello GUI!");
        label.setFont(new Font("Verdana",Font.ITALIC,40));
        label.setForeground(new Color(255,255,255));

        h = new JLabel("H");
        h.setFont(new Font("Verdana",Font.ITALIC,40));
        h.setBounds(300,300,40,40);
        h.setOpaque(true);
        h.setForeground(new Color(0,0,0));

        e2 = new JLabel("E");
        e2.setFont(new Font("Verdana",Font.ITALIC,40));
        e2.setBounds(400,300,40,40);
        e2.setOpaque(true);
        e2.setForeground(new Color(0,0,0));

        l = new JLabel("L");
        l.setFont(new Font("Verdana",Font.ITALIC,40));
        l.setBounds(500,300,40,40);
        l.setOpaque(true);
        l.setForeground(new Color(0,0,0));

        l1 = new JLabel("L");
        l1.setFont(new Font("Verdana",Font.ITALIC,40));
        l1.setBounds(600,300,40,40);
        l1.setOpaque(true);
        l1.setForeground(new Color(0,0,0));

        o = new JLabel("O");
        o.setFont(new Font("Verdana",Font.ITALIC,40));
        o.setBounds(700,300,40,40);
        o.setOpaque(true);
        o.setForeground(new Color(0,0,0));

        panel = new JPanel();
        panel.setBounds(0,0,1000,100);
        panel.setBackground(new Color(0,0,0));
        panel.add(label);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setResizable(false);
        this.setBounds(0,0,1000,1000);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.add(h);
        this.add(e2);
        this.add(l);
        this.add(l1);
        this.add(o);
        this.add(button);
        this.add(again);
        this.setVisible(true);

    }

}

