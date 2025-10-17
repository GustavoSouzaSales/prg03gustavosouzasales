package br.com.ifba.atividade08;

import java.util.ArrayList;
import java.util.List;

public class AtividadeUsuario {
    public static void main(String[] args) {
       // Criando perfis de usuário.
        PerfilUsuario admin = new PerfilUsuario(1, "Admin");
        PerfilUsuario comum = new PerfilUsuario(2, "Comum");

        // Criando usuários
        Usuario usuario1 = new Usuario(1, "Gustavo", "gustavo@email.com", "123456", admin);
        Usuario usuario2 = new Usuario(2, "Maria", "maria@email.com", "abcdef", comum);

        // Criando sessões
        Sessao sessao1 = new Sessao(usuario1);
        Sessao sessao2 = new Sessao(usuario2);

        // Lista para armazenar logs de auditoria.
        List<LogAuditoria> logs = new ArrayList<>();

        // Registrando algumas ações
        logs.add(new LogAuditoria(usuario1, "Login realizado"));
        logs.add(new LogAuditoria(usuario2, "Tentativa de acesso negada"));
        logs.add(new LogAuditoria(usuario1, "Alterou senha"));

        // Exibindo informações.
        System.out.println("=== Usuarios e Perfis ===");
        System.out.println(usuario1);
        System.out.println(usuario2);

        System.out.println("\n=== Sessoes Ativas ===");
        System.out.println(sessao1);
        System.out.println(sessao2);

        System.out.println("\n=== Logs de Auditoria ===");
        for (LogAuditoria log : logs) {
            System.out.println(log);
        } 
    }
    
}
