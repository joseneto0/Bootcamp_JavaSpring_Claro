import BootcampClasses.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp claro_java = new Bootcamp("Claro - Java com Spring Boot", "Construa uma API com Java e Spring de ponta a ponta!", 75, enumNivel.INTERMEDIARIO);
        Cursos introducao = new Cursos("Introdução à Plataforma Java", "Conhecendo o ecossistema Java", 1, enumNivel.BASICO);
        Cursos poo = new Cursos("Fundamentos da POO", "Trabalhando com POO no Java", 3, enumNivel.BASICO);
        Mentorias desenvolvendo_api = new Mentorias("Desenvolvendo APIs e Microsserviços na Claro", "Aprendedo o processo de APIs na Claro", 2, LocalDate.of(2024, 8, 13));
        Devs zezinho = new Devs("Zezin", "Java");
        claro_java.adicionarDev(zezinho);
        claro_java.adicionarCurso(introducao);
        claro_java.adicionarCurso(poo);
        claro_java.adicionarMentoria(desenvolvendo_api);
        claro_java.exibirBootcamp();
        zezinho.visualizarBootcamps();
        claro_java.visualizarCursos();
        claro_java.visualizarDevs();
        claro_java.visualizarMentorias();
    }
}
