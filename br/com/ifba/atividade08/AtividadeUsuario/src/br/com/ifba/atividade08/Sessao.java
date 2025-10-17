package br.com.ifba.atividade08;

public class Sessao {
    // Atributo para armazenar o usuário logado.
    private Usuario usuarioLogado;

    // Construtor que recebe um usuário
    public Sessao(Usuario usuario) {
        this.usuarioLogado = usuario;
        System.out.println("Sessao iniciada para: " + usuario.getNome());
    }

    // Construtor padrão (sem parâmetros)
    public Sessao() {
        // Pode ficar vazio ou inicializar algo, se necessário
    }

    // Método para login.
    public boolean login(Usuario usuario, String senha) {
        if (usuario.getSenha().equals(senha)) {
            this.usuarioLogado = usuario;
            System.out.println("Login realizado com sucesso: " + usuario.getNome());
            return true;
        } else {
            System.out.println("Senha incorreta para o usuario: " + usuario.getNome());
            return false;
        }
    }

    // Método para logout.
    public void logout() {
        if (usuarioLogado != null) {
            System.out.println("Logout realizado: " + usuarioLogado.getNome());
            usuarioLogado = null;
        } else {
            System.out.println("Nenhum usuario está logado.");
        }
    }

    // Método para obter o usuário logado.
    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    // Sobrescrevendo o método toString para exibição legível
    @Override
    public String toString() {
        if (usuarioLogado != null) {
            return "Sessao ativa para: " + usuarioLogado.getNome() 
                   + " (Perfil: " + usuarioLogado.getPerfil().getNomePerfil() + ")";
        } else {
            return "Sessao sem usuario logado";
        }
    }
}
