/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package greve;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fbigal
 */
public class Greve {

    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<String> motivos;
    private List<String> categorias;
    private Sindicato sindicato;
    private int numeroTrabalhadores;
    private String local;

    // Construtores, getters e setters
    public void setDataInicio(LocalDate data) {
        this.dataInicio = data;
    }
    public LocalDate getDataInicio(){
        return this.dataInicio;
    }

    public void setDataFim(LocalDate data) {
        this.dataFim = data;
    }
    public LocalDate getDataFim(){
        return this.dataFim;
    }

    // Métodos
    public void setMotivo(String novoMotivos) {
        motivos.add(novoMotivos);
    }
    public List<String> getMotivo(){
        return new ArrayList<>(this.motivos);
    }
    

    public void setCategoria(String novasCategorias) {
        categorias.add(novasCategorias);
    }
    public List<String> getCategorias() {
        return new ArrayList<>(this.categorias);
        // Retorna uma cópia para evitar modificações externas
    }

    // ... outros métodos úteis
    public class Sindicato {

        private String nome;
        private String presidente;

        // Construtores, getters e setters
        public void setNome(String novoNome) {
            this.nome = novoNome;
        }
        public String getNome(){
            return this.nome;
        }
        
        public void setPresidente(String novoPresidente) {
            this.presidente = novoPresidente;
        }
        public String getPresidente(){
            return this.presidente;
        }
        
    }



}
