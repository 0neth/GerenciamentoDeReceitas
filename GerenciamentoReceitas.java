import java.util.Scanner;
import java.util.ArrayList;

public class GerenciamentoReceitas {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Receitas> receitaList = new ArrayList<>();
    int opcao;

    do {
        System.out.println("SISTEMA DE GERENCIAMENTO DE RECEITAS");
        System.out.println("1) Cadastrar receita");
        System.out.println("2) Editar receita");
        System.out.println("3) Excluir receita");
        System.out.println("4) Listar receita");
        System.out.println("5) Sair");

        opcao = scanner.nextInt();

        switch (opcao) {

        //CADASTRO
        case 1:

        System.out.println("Cadastrar receita");
                    System.out.println("Digite o titulo da receita: ");
                    scanner.nextLine();
                    String titulo = scanner.nextLine();
                    System.out.println("Digite os ingredientes da receita: ");
                    String[] ingredientes = scanner.nextLine().split(",");
                    System.out.println("Digite os passos da receita: ");
                    String[] passos = scanner.nextLine().split(",");
                    System.out.println("Digite a duração em minutos: ");
                    int duracaoEmMinutos = scanner.nextInt();
                    System.out.println("Digite a dificuldade: ");
                    int dificuldade = scanner.nextInt();
                    System.out.println("Digite o autor: ");
                    String autor = scanner.nextLine();


        Receitas receita = new Receitas(titulo, ingredientes, passos, duracaoEmMinutos, dificuldade, autor);
        receitaList.add(receita);
        System.out.println("Receita cadastrada com sucesso!");
        break;

        //EDITAR
        case 2:
        System.out.println("Editar receita");
        System.out.println("Digite o id da receita a ser editada: ");
        int id = scanner.nextInt();
        Receitas receitaEditar = receitaList.get(id);
        scanner.nextLine();
      
        boolean continuarEditando = true;
        while (continuarEditando) {
          System.out.println("Escolha o campo a ser editado:");
          System.out.println("1 - Título");
          System.out.println("2 - Ingrediente");
          System.out.println("3 - Passos");
          System.out.println("4 - Duração em minutos");
          System.out.println("5 - Dificuldade");
          System.out.println("6 - Autor");
          System.out.println("0 - Sair");
      
          int escolha = scanner.nextInt();
          scanner.nextLine();
      
          switch (escolha) {
            case 0:
              continuarEditando = false;
              break;
            case 1:
              System.out.println("Digite o novo título: ");
              receitaEditar.setTitulo(scanner.nextLine());
              break;
            case 2:
              System.out.println("Digite os novos ingredientes: ");
              receitaEditar.setIngredientes(scanner.nextLine().split(", "));
              break;
            case 3:
              System.out.println("Digite os novos passos: ");
              receitaEditar.setPassos(scanner.nextLine().split(", "));
              break;
            case 4:
              System.out.println("Digite a nova duração em minutos: ");
              receitaEditar.setDuracaoEmMinutos(scanner.nextInt());
              break;
            case 5:
              System.out.println("Digite a nova dificuldade: ");
              receitaEditar.setDificuldade(scanner.nextInt());
              break;
            case 6:
              System.out.println("Digite o novo autor: ");
              receitaEditar.setAutor(scanner.nextLine());
              break;
            default:
              System.out.println("Opção inválida.");
              break;
          }
        }
      
        System.out.println("Bebida editada com sucesso!");
        break;
    
        //EXCLUIR
        case 3:
        System.out.println("Excluir receita");
        System.out.println("Digite o id da receita a ser excluida:");
        int idExcluir = scanner.nextInt();
        receitaList.remove(idExcluir);
        System.out.println("Receita excluída com sucesso!");
        break;

        //LISTAR
        case 4:
        System.out.println("----------------------------------");
        System.out.println("Listar receita");
        for (int i = 0; i < receitaList.size(); i++) {
            Receitas receitaListado = receitaList.get(i);
            System.out.println("ID: "+ i);
            System.out.println("Titulo: " + receitaListado.getTitulo());
            System.out.println("Ingredientes: ");
            ingredientes = receitaListado.getIngredientes();
            for (int j = 0; j < ingredientes.length; j++) {
            System.out.println("- " + ingredientes[j]);
        }
            System.out.println("Passos:");
            passos = receitaListado.getPassos();
            for (int j = 0; j < passos.length; j++) {
            System.out.println((j+1) + ". " + passos[j]);
        }
            System.out.println("Duração em minutos: " + receitaListado.getDuracaoEmMinutos());
            System.out.println("Dificuldade: " + receitaListado.getDificuldade());
            System.out.println("Autor: " + receitaListado.getAutor());
            System.out.println("------------------------------------");
        }
        break;

        //DESLIGAR
        case 5:
        System.out.println("Desligando o sistema...");
        break;
        

        default:
        System.out.println("Opção inválida, tente novamente.");
        break;


        }
    } while (opcao != 5);
    scanner.close();
}
}
