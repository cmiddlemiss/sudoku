import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {
    private boolean isPreSet;

    private JLabel num = new JLabel();

    public Square() {
        isPreSet = false;
        num.setText("");
        this.add(num);
    }


    public void setNumOG(String str) {
        num.setText(str);
        this.add(num);
        if (!str.equals("")) {
            isPreSet = true;
        }

    }

}
