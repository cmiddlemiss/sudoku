import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;



public class Square extends JPanel{
    private boolean isPreSet;

    private JLabel num = new JLabel();

    private Square s = this;

    public Square() {
        isPreSet = false;
        Color purpleTwo = new Color(210, 145, 255);
        num.setText("");
        this.setOpaque(true);
        Font font = new Font(Font.SANS_SERIF, 0, 50);
        num.setFont(font);
        this.add(num);
        this.setFocusable(true);
        this.requestFocus();
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {
                num.setForeground(Color.BLACK);
                if(e.getKeyCode() == KeyEvent.VK_1) {
                    num.setText("1");
                    setBackground(purpleTwo);
                    isValidInput(s);
                }
                if(e.getKeyCode() == KeyEvent.VK_2) {
                    num.setText("2");
                    setBackground(purpleTwo);
                    isValidInput(s);
                }
                if(e.getKeyCode() == KeyEvent.VK_3) {
                    num.setText("3");
                    setBackground(purpleTwo);
                    isValidInput(s);
                }
                if(e.getKeyCode() == KeyEvent.VK_4) {
                    num.setText("4");
                    setBackground(purpleTwo);
                    isValidInput(s);
                }
                if(e.getKeyCode() == KeyEvent.VK_5) {
                    num.setText("5");
                    setBackground(purpleTwo);
                    isValidInput(s);
                }
                if(e.getKeyCode() == KeyEvent.VK_6) {
                    num.setText("6");
                    setBackground(purpleTwo);
                    isValidInput(s);
                }
                if(e.getKeyCode() == KeyEvent.VK_7) {
                    num.setText("7");
                    setBackground(purpleTwo);
                    isValidInput(s);
                }
                if(e.getKeyCode() == KeyEvent.VK_8) {
                    num.setText("8");
                    setBackground(purpleTwo);
                    isValidInput(s);
                }
                if(e.getKeyCode() == KeyEvent.VK_9) {
                    num.setText("9");
                    setBackground(purpleTwo);
                    isValidInput(s);
                }
                if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    num.setText("");
                    setBackground(purpleTwo);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
        this.setFocusable(true);
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Board.setAllSquaresWhite();
                if(!isPreSet) {
                    setBackground(purpleTwo);
                    s.requestFocus();
                    isValidInput(s);
                }
            }
        });
    }


    public void setNumOG(String str) {
        Color custom = new Color(160, 32, 240);
        num.setForeground(custom);
        num.setText(str);
        this.add(num);
        if (!str.equals("")) {
            isPreSet = true;
        }

    }
    public void setPreSet(boolean bl) {
        isPreSet = bl;
    }
    public int getNum() {
        return Integer.parseInt(this.num.getText());
    }

    @Override
    public String toString() {
        String square = num.getText();
        int r = 0;
        int c = 0;
        Square[][] squares = Board.getPanelArray();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (squares[row][col] == s) {
                    r = row;
                    c = col;
                }
            }
        }
        return "Square " + r + c + ", has num " + square;
    }

    public void isValidInput(Square q) {
        if(q.num.getText().equals("")) {
            return;
        }
    //CHECKS SQUARES
        Square[][] panelArrayAgain = Board.getPanelArray();
        Square[] checkArr = new Square[9];
        Square[][] panelArrayTwo = new Square[9][9];
        Square[] checkArrTwo = new Square[9];
        Square[] checkArrThree = new Square[9];
        boolean notNull = false;
        boolean notNullTwo = false;
        boolean notNullThree = false;

        for (Square[] firstSquare : panelArrayAgain) {
            for (Square s : firstSquare) {
                if (s == q) {
                    checkArr = firstSquare;
                    notNull = true;
                }
            }
        }
        //ORGANIZES ROWS AND COLUMNS?
        int shift = -3;
        for (int j = 0; j < 3; j++) {
            int i = 0;
            shift += 3;
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    panelArrayTwo[j][i] = panelArrayAgain[row][col + shift];
                    i++;
                }
            }
        }
        shift = -3;
        for (int j = 3; j < 6; j++) {
            int i = 0;
            shift += 3;
            for (int row = 3; row < 6; row++) {
                for (int col = 0; col < 3; col++) {
                    panelArrayTwo[j][i] = panelArrayAgain[row][col + shift];
                    i++;
                }
            }
        }
        shift = -3;
        for (int j = 6; j < 9; j++) {
            int i = 0;
            shift += 3;
            for (int row = 6; row < 9; row++) {
                for (int col = 0; col < 3; col++) {
                    panelArrayTwo[j][i] = panelArrayAgain[row][col + shift];
                    i++;
                }
            }
        }
        //CHECKS ROWS
        for (Square[] firstRow : panelArrayTwo) {
            for (Square s : firstRow) {
                if (s == q) {
                    checkArrTwo = firstRow;
                    notNullTwo = true;
                }
            }
        }
        //CHECKS COLUMNS
        int columnNumber = 0;
        for (int col = 0; col < 9; col++) {
            for(int row = 0; row < 9; row++) {
                if (panelArrayTwo[row][col] == q) {
                    columnNumber = col;
                    notNullThree = true;
                }
            }
        }
        for(int row = 0; row < 9; row++) {
            checkArrThree[row] = panelArrayTwo[row][columnNumber];
        }
        //CHECKING CHECK ARRAYS
        Color red = new Color(224, 76, 76);
        for(int i = 0; i < 9; i++) {
            if(!checkArr[i].num.getText().equals("")) {
                if (notNull && q.getNum() == checkArr[i].getNum() && q != checkArr[i]) {
                    setBackground(red);
                }
            }
            if(!checkArrTwo[i].num.getText().equals("")) {
                if (notNullTwo && q.getNum() == checkArrTwo[i].getNum() && q != checkArrTwo[i]) {
                    setBackground(red);
                }
            }
            if(!checkArrThree[i].num.getText().equals("")) {
                if (notNullThree && q.getNum() == checkArrThree[i].getNum() && q != checkArrThree[i]) {
                    setBackground(red);
                }
            }
        }
    }


}







