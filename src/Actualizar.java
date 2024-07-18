import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Actualizar {
    private JTextField cedula;
    public JPanel panelActualizar;
    private JButton actualizar;
    private JTextField nota1;
    private JTextField nota2;
    private JLabel confirmacion;
    public Actualizar() {
        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Estudiantes estudiante = new Estudiantes();
                estudiante.setCedula(cedula.getText());
                estudiante.setNota1(Float.parseFloat(nota1.getText()));
                estudiante.setNota2(Float.parseFloat(nota2.getText()));
                /*Linea de conexion*/
                String url = "jdbc:mysql://localhost:3306/clase02";
                String usuario = "root";
                String password = "123456";
                /*Conerctado*/
                try(Connection connection = DriverManager.getConnection(url, usuario, password)){
                    String actualizar = "update estudiantePoo set b1='"+estudiante.getNota1()+"', b2='"+estudiante.getNota2()+"' where cedula ='"+estudiante.getCedula()+"'";
                    PreparedStatement consultar = connection.prepareStatement(actualizar);
                    int consulta = consultar.executeUpdate();
                    if (consulta>0){
                        confirmacion.setText("El estudiante con cedula "+estudiante.getCedula()+" ha sido sactualizado correctamente");
                    } else {
                        confirmacion.setText("No se pudo actualizar el estudiante");
                    }
                }
                catch (SQLException exception){
                    System.out.println(exception.getMessage());
                }
            }
        });
    }
}
