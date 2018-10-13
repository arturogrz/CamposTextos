import campostextos.MiFrame;
import java.awt.FlowLayout;
import javax.swing.JFrame;
public class CamposTextos {
    public static void main(String[] args) {
        MiFrame frame = new MiFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,300);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);  
    }
}
