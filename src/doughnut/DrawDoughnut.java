package doughnut;

import javax.swing.JFrame;

public class DrawDoughnut extends JFrame {

    private static final long serialVersionUID = 7037345761135053760L;

    public DrawDoughnut() {

        add(new Doughnut());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 310);
        setLocationRelativeTo(null);
        setTitle("Doughnut");
        setVisible(true);
    }

    public static void main(String[] args) {
        new DrawDoughnut();
    }
}