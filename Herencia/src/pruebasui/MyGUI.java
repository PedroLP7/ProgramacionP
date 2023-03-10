package pruebasui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyGUI extends JFrame {
    private Admin admin;
    private JTextArea textArea;
private Admin a1;
private ArrayList<Client>clientlist;
    public MyGUI() {
        super("Mi GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Crear componentes
        JButton buttonregis = new JButton("Registrarse");
        JButton buttonlogin = new JButton("Iniciar sesión");
        JButton buttonshowad = new JButton("Mostrar admin");
        JButton buttonclient = new JButton("Mostrar clientes");

        // Agregar ActionListener al botón "Registrarse"
        buttonregis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String username = JOptionPane.showInputDialog("Introduce tu nombre de usuario:");
                String password = JOptionPane.showInputDialog("Introduce la contraseña");

                clientlist = new ArrayList<Client>();
                Client c1 = new Client(username, password); // Crear un objeto Client con los datos introducidos por el usuario
                clientlist.add(c1);
            }
        });




        // Agregar ActionListener al botón "Mostrar usuarios"
        buttonshowad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Agregar código que deseas que se ejecute cuando se hace clic en el botón "Mostrar admin"

            }
        });


        buttonclient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String message = "Lista de clientes:\n";
                for (int i = 0; i < clientlist.size(); i++) {
                    message += clientlist.get(i).getUser() +"\n"+clientlist.get(i).getPassword()+ "\n";
                }
                JOptionPane.showMessageDialog(null, message);

            }
        });








        // Agregar componentes al contenedor
        JPanel panel = new JPanel();
        panel.add(buttonregis);
        panel.add(buttonlogin);
        panel.add(buttonshowad);
        panel.add(buttonclient);
        add(panel);

        // Mostrar la ventana
        setVisible(true);
    }
}