package nutricorp.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nutricorp.Entidades.Paciente;
/**
 *
 * @author Matias
 */
public class PacienteData extends Paciente{
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    String sql = "";
   
    DefaultTableModel tableFiltroPacientes;
    
    
    //funcionando
   public void insertarPaciente(Paciente paciente) {
        try {
            // Establecer la conexión antes de la preparación de la sentencia SQL
            connection = CConection.getConexion();


            sql = "INSERT INTO `paciente`( `Nombre`,`Apellido`, `DNI`, `Domicilio`, `Telefono`,pesoActual,`estado`) VALUES (?,?,?,?,?,?,?);";
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);

            // Completar los campos con símbolos por las variables
            // Primera posición corresponde al primer símbolo y así sucesivamente, la contabilización arranca desde 1
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getDni());
            ps.setString(4, paciente.getDomicilio());
            ps.setString(5, paciente.getTelefono()); 
            ps.setString(6, paciente.getPesoActual());
            ps.setBoolean(7, paciente.isEstado());
            ps.executeUpdate();
            
            System.out.println(sql);
            // Cerrar la consulta y otros recursos si es necesario
            System.out.println("Paciente cargado correctamente ");
            JOptionPane.showMessageDialog(null, "Paciente Ingresado Correctamente");

        } catch (SQLException | NumberFormatException e) { // Coloca esto aquí
            // Coloca esto aquí
            System.out.println("Error al cargar los datos del Paciente: " + e.getMessage());

        }
    }
   
   //listo y funcionando
    public Paciente buscarPacientePorDni(int dni) {
        sql = "SELECT Nombre, DNI , Domicilio,Apellido,pesoActual,estado, Telefono FROM paciente WHERE dni =? ";
        Paciente paciente = null;
        try {
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            //System.out.println("rs es "+rs.getArray(sql));
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setEstado(rs.getBoolean("estado"));
                paciente.setPesoActual(rs.getString("pesoActual"));   
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese Paciente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder "+ex.getMessage());
        }
        return paciente;
    }
   
    
    // listo y funcionando
    public void modificadorPaciente(Paciente paciente) {
  sql = "UPDATE paciente SET Nombre=?, Apellido=?, DNI=?, Domicilio=?, Telefono=?, PesoActual=?, Estado=? WHERE DNI=?";
    try {
        connection = CConection.getConexion();
        ps = connection.prepareStatement(sql);
        ps.setString(1, paciente.getNombre());
        ps.setString(2, paciente.getApellido());
        ps.setInt(3, paciente.getDni());
        ps.setString(4, paciente.getDomicilio());
        ps.setString(5, paciente.getTelefono());
        ps.setString(6, paciente.getPesoActual());
        ps.setBoolean(7, paciente.isEstado()); // Actualiza el estado del paciente
        ps.setInt(8, paciente.getDni());
        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Se modificó el Paciente");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Paciente: " + ex.getLocalizedMessage());
    }
    }


    
    public void eliminarPaciente(int dni) {        
        sql = "UPDATE paciente SET estado=0  WHERE DNI=?";       
        try {
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setInt(1,dni);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paciente Eliminado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de paciente");
            
        }
    }
    
    
    
    
    public List<Paciente> listarPaciente() {
        List<Paciente> pacientes = new ArrayList<>();
        try {
             sql = "SELECT * FROM paciente WHERE estado = 1 ";
             rs = ps.executeQuery();
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Paciente " + ex.getMessage());
        }
        return pacientes;
    }
    
        public void llenarComboBoxPacientes(JComboBox parametrodelCombo) {
        sql = "SELECT nombre FROM paciente ";
        try {
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                parametrodelCombo.addItem(rs.getString("nombre"));
                
            }
            rs.close();

        } catch (SQLException ex) {
            System.out.println("error de sql " + ex);
        }
    }
}
