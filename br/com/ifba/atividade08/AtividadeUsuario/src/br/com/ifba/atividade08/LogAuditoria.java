package br.com.ifba.atividade08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogAuditoria {
    // Atributos.
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;

    // Método construtor.
    public LogAuditoria(Usuario usuario, String acao) {
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = LocalDateTime.now(); // Registra o momento da ação.
    }

    // Getters e Setters.
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    // Método para mostrar o log.
    public void exibirLog() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(usuario.getNome() + " - " + acao + " - " + dataHora.format(formatter));
    }

    // Sobrescrevendo o método toString para exibição legível
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "LogAuditoria [Usuario = " + usuario.getNome() 
               + ", Acao = " + acao 
               + ", DataHora = " + dataHora.format(formatter) + "]";
    }
}
