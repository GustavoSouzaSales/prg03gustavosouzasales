package br.com.ifba.atividade08;

public class PerfilUsuario {
     // Atributos
    private int id;
    private String nomePerfil; // Ex: "Admin", "Comum", etc.

    // Construtor
    public PerfilUsuario(int id, String nomePerfil) {
        this.id = id;
        this.nomePerfil = nomePerfil;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    // Método para exibir informações do perfil
    public void exibirPerfil() {
        System.out.println("ID: " + id + ", Perfil: " + nomePerfil);
    }
}
