package br.com.agenda.aplication;

import br.com.agenda.dao.AgendaDAO;
import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contatos;
import java.util.Date;
import java.sql.*;

public class Main {
    public static void TesteConexao() throws Exception {
        Connection conn = new ConnectionFactory().ConnectionToMySQL();
        
        if (conn != null) {
            System.out.println("Conectado!");
            conn.close();
        }
    }
    
    public static void CadastrarContatos() {
        var c = new Contatos();
        c.setNomecontatos("Lavuisia Boens");
        c.setIdadecontatos(40);
        c.setDatacadastro(new Date());
        var cd = new AgendaDAO();
        cd.Save(c);
    }  
    
    public static void main(String[] args) throws Exception {
        //TesteConexao();
        CadastrarContatos();
    }
}
