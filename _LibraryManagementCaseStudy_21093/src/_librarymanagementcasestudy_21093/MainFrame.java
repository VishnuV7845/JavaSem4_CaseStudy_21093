package _librarymanagementcasestudy_21093;
import javax.swing.JFrame;
/**
 *
 * @author vishnu
 */
public class MainFrame extends JFrame {
    public void init() {
        setTitle("The Golden Library");
        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

public static void main(String[] args) {
    MainFrame myFrame = new MainFrame();
    myFrame.init();
    }
}
