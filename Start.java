import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Start extends JFrame {

    public static void main(String[] args) {

        new Start();
    }

    public Start() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Insects Combat");
                frame.add(new MenuPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setSize(700, 500);
            }
        });
    }

    public class MenuPane extends JPanel {

        public MenuPane() {
            setBorder(new EmptyBorder(10, 10, 10, 10));
            setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.anchor = GridBagConstraints.NORTH;

            add(new JLabel("<html><h1><strong><i>Insects Combat</i></strong></h1><hr></html>"), gbc);

            gbc.anchor = GridBagConstraints.CENTER;
            gbc.fill = GridBagConstraints.HORIZONTAL;

            JPanel buttons = new JPanel(new GridBagLayout());
            buttons.add(new JButton("Start"), gbc);
            buttons.add(new JButton("Scores"), gbc);
            buttons.add(new JButton("Exit"), gbc);

            gbc.weighty = 1;
            add(buttons, gbc);
        }

    }

}

        /*
        JFrame frame = new JFrame();
        frame.setSize(700, 500);
        frame.setTitle("Insects Combat");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



        JButton start = new JButton("START");
        JButton score = new JButton("SCORES");
        JButton quit = new JButton("QUIT");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(start, BorderLayout.CENTER);
        panel.add(score, BorderLayout.CENTER);
        panel.add(quit, BorderLayout.CENTER);

        frame.add(panel);
        */
