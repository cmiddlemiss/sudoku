import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Board {

    public Board() {
        JFrame frame = new JFrame("Sudoku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //1. Big Grid
        JPanel bigGrid = new JPanel();
        bigGrid.setLayout(new GridLayout(3, 3));

        for (int i = 1; i <= 9; i++) {
            JPanel panel = new JPanel(new GridLayout(3, 3));
            panel.setBorder(BorderFactory.createLineBorder(Color.blue));
            for (int j = 1; j <= 9; j++) {
                JPanel smallPanel = new JPanel();
                smallPanel.setBorder(BorderFactory.createLineBorder(Color.black));
                panel.add(smallPanel);
            }
            bigGrid.add(panel);
        }
        frame.add(bigGrid);






        /*
        //1. Create the long 3 columns
        JPanel panelBoxLeft = new JPanel();
        panelBoxLeft.setLayout(new BoxLayout(panelBoxLeft, BoxLayout.Y_AXIS));
        panelBoxLeft.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel panelBoxMiddle = new JPanel();
        panelBoxMiddle.setLayout(new BoxLayout(panelBoxMiddle, BoxLayout.Y_AXIS));
        panelBoxMiddle.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel panelBoxRight = new JPanel();
        panelBoxRight.setLayout(new BoxLayout(panelBoxRight, BoxLayout.Y_AXIS));
        panelBoxRight.setBorder(BorderFactory.createLineBorder(Color.black));
        //2. Create big boxes
        JPanel bigSquare_1 = new JPanel();
        bigSquare_1.setLayout(new BoxLayout(bigSquare_1, BoxLayout.Y_AXIS));
        bigSquare_1.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel bigSquare_2 = new JPanel();
        bigSquare_2.setLayout(new BoxLayout(bigSquare_2, BoxLayout.Y_AXIS));
        bigSquare_2.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel bigSquare_3 = new JPanel();
        bigSquare_3.setLayout(new BoxLayout(bigSquare_3, BoxLayout.Y_AXIS));
        bigSquare_3.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel bigSquare_4 = new JPanel();
        bigSquare_4.setLayout(new BoxLayout(bigSquare_4, BoxLayout.Y_AXIS));
        bigSquare_4.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel bigSquare_5 = new JPanel();
        bigSquare_5.setLayout(new BoxLayout(bigSquare_5, BoxLayout.Y_AXIS));
        bigSquare_5.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel bigSquare_6 = new JPanel();
        bigSquare_6.setLayout(new BoxLayout(bigSquare_6, BoxLayout.Y_AXIS));
        bigSquare_6.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel bigSquare_7 = new JPanel();
        bigSquare_7.setLayout(new BoxLayout(bigSquare_7, BoxLayout.Y_AXIS));
        bigSquare_7.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel bigSquare_8 = new JPanel();
        bigSquare_8.setLayout(new BoxLayout(bigSquare_8, BoxLayout.Y_AXIS));
        bigSquare_8.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel bigSquare_9 = new JPanel();
        bigSquare_9.setLayout(new BoxLayout(bigSquare_9, BoxLayout.Y_AXIS));
        bigSquare_9.setBorder(BorderFactory.createLineBorder(Color.black));
        //3. Create small rows
        JPanel smallRow_1_1 = new JPanel();
        smallRow_1_1.setLayout(new BoxLayout(smallRow_1_1, BoxLayout.X_AXIS));
        smallRow_1_1.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_1_2 = new JPanel();
        smallRow_1_2.setLayout(new BoxLayout(smallRow_1_2, BoxLayout.X_AXIS));
        smallRow_1_2.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_1_3 = new JPanel();
        smallRow_1_3.setLayout(new BoxLayout(smallRow_1_3, BoxLayout.X_AXIS));
        smallRow_1_3.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_2_1 = new JPanel();
        smallRow_2_1.setLayout(new BoxLayout(smallRow_2_1, BoxLayout.X_AXIS));
        smallRow_2_1.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_2_2 = new JPanel();
        smallRow_2_2.setLayout(new BoxLayout(smallRow_2_2, BoxLayout.X_AXIS));
        smallRow_2_2.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_2_3 = new JPanel();
        smallRow_2_3.setLayout(new BoxLayout(smallRow_2_3, BoxLayout.X_AXIS));
        smallRow_2_3.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_3_1 = new JPanel();
        smallRow_3_1.setLayout(new BoxLayout(smallRow_3_1, BoxLayout.X_AXIS));
        smallRow_3_1.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_3_2 = new JPanel();
        smallRow_3_2.setLayout(new BoxLayout(smallRow_3_2, BoxLayout.X_AXIS));
        smallRow_3_2.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_3_3 = new JPanel();
        smallRow_3_3.setLayout(new BoxLayout(smallRow_3_3, BoxLayout.X_AXIS));
        smallRow_3_3.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_4_1 = new JPanel();
        smallRow_4_1.setLayout(new BoxLayout(smallRow_4_1, BoxLayout.X_AXIS));
        smallRow_4_1.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_4_2 = new JPanel();
        smallRow_4_2.setLayout(new BoxLayout(smallRow_4_2, BoxLayout.X_AXIS));
        smallRow_4_2.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_4_3 = new JPanel();
        smallRow_4_3.setLayout(new BoxLayout(smallRow_4_3, BoxLayout.X_AXIS));
        smallRow_4_3.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_5_1 = new JPanel();
        smallRow_5_1.setLayout(new BoxLayout(smallRow_5_1, BoxLayout.X_AXIS));
        smallRow_5_1.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_5_2 = new JPanel();
        smallRow_5_2.setLayout(new BoxLayout(smallRow_5_2, BoxLayout.X_AXIS));
        smallRow_5_2.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_5_3 = new JPanel();
        smallRow_5_3.setLayout(new BoxLayout(smallRow_5_3, BoxLayout.X_AXIS));
        smallRow_5_3.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_6_1 = new JPanel();
        smallRow_6_1.setLayout(new BoxLayout(smallRow_6_1, BoxLayout.X_AXIS));
        smallRow_6_1.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_6_2 = new JPanel();
        smallRow_6_2.setLayout(new BoxLayout(smallRow_6_2, BoxLayout.X_AXIS));
        smallRow_6_2.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_6_3 = new JPanel();
        smallRow_6_3.setLayout(new BoxLayout(smallRow_6_3, BoxLayout.X_AXIS));
        smallRow_6_3.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_7_1 = new JPanel();
        smallRow_7_1.setLayout(new BoxLayout(smallRow_7_1, BoxLayout.X_AXIS));
        smallRow_7_1.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_7_2 = new JPanel();
        smallRow_7_2.setLayout(new BoxLayout(smallRow_7_2, BoxLayout.X_AXIS));
        smallRow_7_2.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_7_3 = new JPanel();
        smallRow_7_3.setLayout(new BoxLayout(smallRow_7_3, BoxLayout.X_AXIS));
        smallRow_7_3.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_8_1 = new JPanel();
        smallRow_8_1.setLayout(new BoxLayout(smallRow_8_1, BoxLayout.X_AXIS));
        smallRow_8_1.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_8_2 = new JPanel();
        smallRow_8_2.setLayout(new BoxLayout(smallRow_8_2, BoxLayout.X_AXIS));
        smallRow_8_2.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_8_3 = new JPanel();
        smallRow_8_3.setLayout(new BoxLayout(smallRow_8_3, BoxLayout.X_AXIS));
        smallRow_8_3.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_9_1 = new JPanel();
        smallRow_9_1.setLayout(new BoxLayout(smallRow_9_1, BoxLayout.X_AXIS));
        smallRow_9_1.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_9_2 = new JPanel();
        smallRow_9_2.setLayout(new BoxLayout(smallRow_9_2, BoxLayout.X_AXIS));
        smallRow_9_2.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel smallRow_9_3 = new JPanel();
        smallRow_9_3.setLayout(new BoxLayout(smallRow_9_3, BoxLayout.X_AXIS));
        smallRow_9_3.setBorder(BorderFactory.createLineBorder(Color.black));
        //4. Create small boxes

         */

    frame.setSize(400, 400);
    frame.setVisible(true);
    }
}
