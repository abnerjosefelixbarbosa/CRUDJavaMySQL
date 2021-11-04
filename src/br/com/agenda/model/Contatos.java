package br.com.agenda.model;

import java.util.Date;

public class Contatos {
    private int idcontatos;
    private String nomecontatos;
    private int idadecontatos;
    private Date datacadastro;

    public int getIdcontatos() {
        return idcontatos;
    }

    public void setIdcontatos(int idcontatos) {
        this.idcontatos = idcontatos;
    }

    public String getNomecontatos() {
        return nomecontatos;
    }

    public void setNomecontatos(String nomecontatos) {
        this.nomecontatos = nomecontatos;
    }

    public int getIdadecontatos() {
        return idadecontatos;
    }

    public void setIdadecontatos(int idadecontatos) {
        this.idadecontatos = idadecontatos;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }
}
