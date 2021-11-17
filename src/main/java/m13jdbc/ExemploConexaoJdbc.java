package m13jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExemploConexaoJdbc {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Verifica se a classe Driver do Postgresql está disponível no classpath
        //Class.forName("org.postgresql.Driver");

        //Obtem a conexão
        String urlConexao = "jdbc:postgresql://postgresql.lptn.com.br:5432/comunicador";
        Connection connection = DriverManager.getConnection(urlConexao, "comunicador", "Comunicador123!");

        //Executa uma consulta
        ResultSet query = connection.createStatement().executeQuery("SELECT id,nome,telefone FROM usuario");

        //Verifica se há primeira tupla
        while(query.next()){
            //Obtem um campo da primeira tupla
            String id = query.getString("id");
            String nome = query.getString("nome");
            String telefone = query.getString("telefone");
            System.out.printf("%s - %s - %s\n", id, nome, telefone);
        }

        // Como deletar?
        //connection
        //       .createStatement()
        //       .execute("DELETE FROM atendente Where nome like '%2' OR id=6 ");

        //Chamar uma procedure?
        //connection.prepareCall("formata_nome")
        //               .setString("IN_NOME", "Fulano");

        //Chamar uma function?
        ResultSet queryFnc = connection.createStatement()
                .executeQuery("SELECT formata_nome('') FROM dual");
        queryFnc.next();
        queryFnc.getString(1);

        connection.close();
    }
}
