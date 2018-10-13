package campostextos;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
public class MiFrame extends JFrame{
    private JTextField field_usuario;
    private JPasswordField field_contraseña;
    private JButton button_login;
    private String usuarios [][] = {
        {"alba"   , "111"},
        {"araceli", "222"},
        {"daniel" , "333"},
        {"david"  , "444"},
        {"arturo" , "555"}};
    //Constructor
    public MiFrame (){
        super("Acceso");
        setLayout(null);//setLayout(new FlowLayout());
        JLabel etiqueta1 = new JLabel("Usuario");//////////////////
        etiqueta1.setBounds(165, 50, 80, 20);
        etiqueta1.setFont(new Font("arial",Font.PLAIN,14));
        add(etiqueta1);
        JLabel etiqueta2 = new JLabel("Contraseña");///////////////
        etiqueta2.setBounds(140, 100, 80, 20);
        etiqueta2.setFont(new Font("arial",Font.PLAIN,14));
        add(etiqueta2);
        JLabel etiqueta3 = new JLabel("Contraseña");///////////////
        Icon icono = new ImageIcon(getClass().getResource("/icono.png"));
        etiqueta3 = new JLabel("Etiqueta con textos e icono", icono,SwingConstants.LEFT);
        etiqueta3.setBounds(10, 20, 128, 128);
        add(etiqueta3);
        field_usuario = new JTextField(20);///////////////////////
        field_usuario.setBounds(220, 40, 200, 30);
        field_usuario.setFont(new Font("arial",Font.PLAIN,14));
        add(field_usuario);
        field_contraseña = new JPasswordField(20);////////////////
        field_usuario.setFont(new Font("arial",Font.PLAIN,14));
        field_contraseña.setBounds(220, 90, 200, 30);
        add(field_contraseña);
        button_login = new JButton("Aceptar");////////////////////
        button_login.addActionListener((ActionEvent e) -> {
        System.out.println("usuario: " + field_usuario.getText());
        System.out.println("Contraseña: " + field_contraseña.getText());
        validacion(field_usuario.getText(), field_contraseña.getText());          
        });
        button_login.setFont(new Font("arial",Font.PLAIN,14));
        button_login.setBounds(175, 180, 120, 50);
        add(button_login);           
    }
    private void validacion(String email, String password){
        boolean acceso = false;
        if (email.equals("")){
            JOptionPane.showMessageDialog(null,
                    "El campo Usuario esta vacio",
                    "Acceso",
                    1);
            return;
        }
        if (password.equals("")){
            JOptionPane.showMessageDialog(null,
                    "El campo Password esta vacio",
                    "Acceso",
                    1);
            return;
        }
        for (String[] usuario : usuarios) {
            if((email.equals(usuario[0]))&&(password.equals(usuario[1]))){
                acceso = true;
            }
        }
        if(acceso == true){
            JOptionPane.showMessageDialog(null,
                    "Usuario y contraseña correctos.",
                    "Acceso",
                    1);
        }else{
            JOptionPane.showMessageDialog(null,
                    "Usuario o contraseña incorrectos. Intentelo de nuevo",
                    "Acceso",
                    0);
        } 
    }  
}