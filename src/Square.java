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
                }
                if(e.getKeyCode() == KeyEvent.VK_2) {
                    num.setText("2");
                }
                if(e.getKeyCode() == KeyEvent.VK_3) {
                    num.setText("3");
                }
                if(e.getKeyCode() == KeyEvent.VK_4) {
                    num.setText("4");
                }
                if(e.getKeyCode() == KeyEvent.VK_5) {
                    num.setText("5");
                }
                if(e.getKeyCode() == KeyEvent.VK_6) {
                    num.setText("6");
                }
                if(e.getKeyCode() == KeyEvent.VK_7) {
                    num.setText("7");
                }
                if(e.getKeyCode() == KeyEvent.VK_8) {
                    num.setText("8");
                }
                if(e.getKeyCode() == KeyEvent.VK_9) {
                    num.setText("9");
                }
                if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    num.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
        this.setFocusable(true);
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Board.setAllSquaresWhite();
                System.out.println(this);
                if(!isPreSet) {
                    Color purpleTwo = new Color(210, 145, 255);
                    setBackground(purpleTwo);
                    s.requestFocus();
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

    public boolean isValidInput(Square q) {
        Square[][] panelArrayAgain = Board.getPanelArray();
        Square[] checkArr;
        Square[][] panelArrayTwo = new Square[9][9];
        Square[] checkArrTwo;
        Square[] checkArrThree;
        for (Square[] firstSquare: panelArrayAgain) {
            for (Square s: firstSquare) {
                if (s == q) {
                    checkArr = firstSquare;
                }
            }
        }
        //CHECK NOTES
        for (int row = 0; row < 9; row++) {
            int i = 0;
            for (int col = 0; col < 9; col++) {
                panelArrayTwo[row][col] = panelArrayAgain[0][4];
            }
        }
        return false;
    }





}
