package m13jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExemploConexaoBasicaJdbc {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Verifica se a classe Driver do Postgresql está disponível no classpath
        Class.forName("org.postgresql.Driver");

        //Obtem a conexão
        String urlConexao = "jdbc:tipoDeBanco://urlBanco:porta/database";
        Connection connection = DriverManager.getConnection(urlConexao, "usuario", "senha");

        //Executa uma consulta
        ResultSet query = connection.createStatement().executeQuery("select nome from pessoa");

        //Verifica se há primeira tupla
        while(query.next()){
            //Obtem um campo da primeira tupla
            String nomePessoa = query.getString("nome");
            System.out.println(nomePessoa);
        }

        connection.close();

        // postgresql -
        //h2 - < 1MB
        // docker
        // wamp/xamp - mysql
        // poll - Hikari, c3p0, Tomcat Poll, Oracle Poll


    }
}
