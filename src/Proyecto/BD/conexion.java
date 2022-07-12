/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto.BD;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vicen
 */
public class conexion {

    //String strConexionDB="jdbc:sqlite:C:/Users/vicen/Desktop/db/proyecto.s3db";
    File fichero = new File("proyecto.s3db");
    String path = fichero.getAbsolutePath();
    Connection conn= null;
    
    public conexion(){
        try {
            String PATH = path.replace("\\","/");
            String strConexionDB= String.format("jdbc:sqlite:%s", PATH);
            Class.forName("org.sqlite.JDBC");
            this.conn= DriverManager.getConnection(strConexionDB);
            System.out.println("Conexion Establecida");

        } catch (Exception e) {
            System.out.println("Error de Conexion"+e);
        }
    }

    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try {
            PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta= pstm.executeQuery();
            return respuesta; 
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
