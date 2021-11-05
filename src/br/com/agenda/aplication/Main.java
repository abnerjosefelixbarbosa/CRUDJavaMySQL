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
    
    public static void ListarContatos() {
        var cd = new AgendaDAO();
        
        for (Contatos c: cd.getContatos()) {
            var res = String.format("Nome do contato: %s", c.getNomecontatos());
                    
            System.out.println(res);
        }
    }
    
    public static void AlterarContatos() {
        var c = new Contatos();
        c.setIdcontatos(1);
        c.setNomecontatos("Tarta Xouto");
        c.setIdadecontatos(36);
        c.setDatacadastro(new Date());
        var cd = new AgendaDAO();
        cd.Update(c);
    }
    
    public static void main(String[] args) throws Exception {
        //TesteConexao();
        //CadastrarContatos();
        //ListarContatos();
        AlterarContatos();
    }
}
