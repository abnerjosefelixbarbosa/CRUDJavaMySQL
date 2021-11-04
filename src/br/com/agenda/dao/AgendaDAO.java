package br.com.agenda.dao;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contatos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AgendaDAO {
    
    public void Save(Contatos dados) {
        String sql = "insert into contatos(nomecontatos,idadecontatos,datacadastro) values (?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = new ConnectionFactory().ConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, dados.getNomecontatos());
            pstm.setInt(2, dados.getIdadecontatos());            
            pstm.setDate(3, new Date(dados.getDatacadastro().getTime()));
            pstm.execute();
            System.out.println("Agenda salva!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public List<Contatos> getContatos() {
        List<Contatos> lista = new ArrayList<Contatos>();
        
        
        return lista;
    } 
}
