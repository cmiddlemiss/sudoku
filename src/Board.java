import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Board {


    public Board() {
        JFrame frame = new JFrame("Sudoku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Square[][] panelArray = new Square[9][9];
        //1. Big Grid
        JPanel bigGrid = new JPanel();
        bigGrid.setLayout(new GridLayout(3, 3));

        for (int i = 1; i <= 9; i++) {
            JPanel panel = new JPanel(new GridLayout(3, 3));
            panel.setBorder(BorderFactory.createLineBorder(Color.blue));
            for (int j = 1; j <= 9; j++) {
                Square smallPanel = new Square();
                smallPanel.setBorder(BorderFactory.createLineBorder(Color.black));
                panelArray[i-1][j-1] = smallPanel;
                panel.add(smallPanel);
            }
            bigGrid.add(panel);
        }
        frame.add(bigGrid);

        //Difficulty buttons
        JPanel num_diff = new JPanel();
        JButton easy = new JButton("Easy");
        JButton medium = new JButton("Medium");
        JButton hard = new JButton("Hard");
        num_diff.add(easy);
        num_diff.add(medium);
        num_diff.add(hard);
        frame.add(num_diff, BorderLayout.SOUTH);


        easy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String[][] orig_num = {{"5", "3", "", "6", "", "", "", "9", "8"},
                        {"", "7", "", "1", "9", "5", "", "", ""},
                        {"", "", "", "", "", "", "", "6", ""},
                        {"8", "", "", "4", "", "", "7", "", ""},
                        {"", "6", "", "8", "", "3", "", "2", ""},
                        {"", "", "3", "", "", "1", "", "", "6"},
                        {"", "6", "", "", "", "", "", "", ""},
                        {"", "", "", "4", "1", "9", "", "8", ""},
                        {"2", "8", "", "", "", "5", "", "7", "9"}};

                for (int row = 0; row < 9; row++) {
                    for (int col = 0; col < 9; col++) {
                        panelArray[row][col].setNumOG(orig_num[row][col]);
                    }
                }
            }


        });

        medium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String[][] orig_num = {{"1", "4", "5", "6", "", "", "", "",""},
                        {"", "", "", "", "2", "", "9", "", ""},
                        {"", "", "", "", "8", "1", "", "", ""},
                        {"", "", "9", "7", "", "", "", "", ""},
                        {"", "", "", "4", "", "", "", "", ""},
                        {"", "", "", "", "9", "", "2", "", "7"},
                        {"", "", "", "", "", "3", "", "", "1"},
                        {"6", "", "1", "", "5", "", "", "7", "9"},
                        {"", "", "9", "", "", "", "5", "", "2"}};

                for (int row = 0; row < 9; row++) {
                    for (int col = 0; col < 9; col++) {
                        panelArray[row][col].setNumOG(orig_num[row][col]);
                    }
                }
            }

        });

        hard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String[][] orig_num = {{"", "", "6", "", "", "4", "1", "", ""},
                        {"3", "", "7", "", "", "", "", "", "6"},
                        {"", "", "", "", "", "5", "", "8", "2"},
                        {"2", "", "5", "", "", "", "9", "", ""},
                        {"", "3", "", "2", "", "", "", "7", ""},
                        {"1", "", "6", "3", "", "", "", "", "4"},
                        {"", "5", "", "", "1", "", "", "", "8"},
                        {"", "", "", "", "", "", "1", "", "9"},
                        {"", "", "", "", "", "", "", "4", ""}};
                for (int row = 0; row < 9; row++) {
                    for (int col = 0; col < 9; col++) {
                        panelArray[row][col].setNumOG(orig_num[row][col]);
                    }
                }
            }
        });













    frame.setSize(400, 400);
    frame.setVisible(true);
    }
}
