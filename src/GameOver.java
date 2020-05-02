import javax.swing.*;
import java.awt.*;

public class GameOver extends JFrame {
    public GameOver()  {
        if (Logic.checkWinLines(Logic.DOT_O)){
            JOptionPane.showMessageDialog(null, "Ты проиграл, не страшно, можешь сыграть еще раз! ");
            return;
        }

        if (Logic.checkWinLines(Logic.DOT_X)){
            JOptionPane.showMessageDialog(null, "Ты победил, поздравляем тебя!!!!!!!");
            return;
        }

        if (Logic.isFull()){
            JOptionPane.showMessageDialog(null, "Ничья");
        }
    }
}
