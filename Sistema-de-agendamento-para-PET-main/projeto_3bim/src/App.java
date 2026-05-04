import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Agendar banho");
            System.out.println("2 - Consultar agenda");
            System.out.println("3 - Editar agendamento");
            System.out.println("4 - Excluir agendamento");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            while (!sc.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                sc.next();
            }
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (AgendaManager.agendaCheia()) {
                        System.out.println("A agenda está cheia! Não é possível agendar.");
                        break;
                    }

                    System.out.print("Nome do pet: ");
                    String nomePet = sc.nextLine();
                    System.out.print("Espécie: ");
                    String especie = sc.nextLine();
                    System.out.print("Nome do dono: ");
                    String nomeDono = sc.nextLine();
                    System.out.print("Telefone do dono: ");
                    String telefone = sc.nextLine();

                    int horario;
                    do {
                        System.out.print("Horário (0-9): ");
                        while (!sc.hasNextInt()) {
                            System.out.print("Digite um número válido para o horário: ");
                            sc.next();
                        }
                        horario = sc.nextInt();
                        sc.nextLine();
                        if (!AgendaManager.horarioValido(horario) || AgendaManager.horarioOcupado(horario)) {
                            System.out.println("Horário inválido ou já ocupado. Tente outro.");
                        }
                    } while (!AgendaManager.horarioValido(horario) || AgendaManager.horarioOcupado(horario));

                    System.out.print("Tipo de banho (1 - Simples, 2 - Com tosa): ");
                    int tipo;
                    while (true) {
                        while (!sc.hasNextInt()) {
                            System.out.print("Digite 1 ou 2: ");
                            sc.next();
                        }
                        tipo = sc.nextInt();
                        sc.nextLine();
                        if (tipo == 1 || tipo == 2) break;
                        System.out.print("Digite 1 ou 2: ");
                    }

                    Agendamento ag = null;
                    if (tipo == 1) {
                        ag = new BanhoSimples(nomePet, especie, nomeDono, telefone, String.valueOf(horario));
                    } else {
                        System.out.print("Serviço adicional: ");
                        String servico = sc.nextLine();
                        ag = new BanhoComTosa(nomePet, especie, nomeDono, telefone, String.valueOf(horario), servico);
                    }
                    AgendaManager.agendar(ag, horario);
                    break;

                case 2:
                    AgendaManager.listar();
                    break;

                case 3:
                    System.out.print("Informe o horário (0-9) para editar: ");
                    int posEd = sc.nextInt();
                    sc.nextLine();
                    if (!AgendaManager.horarioValido(posEd) || !AgendaManager.horarioOcupado(posEd)) {
                        System.out.println("Não há agendamento nesse horário para editar.");
                        break;
                    }

                    System.out.print("Novo nome do pet: ");
                    String novoNomePet = sc.nextLine();
                    System.out.print("Nova espécie: ");
                    String novaEspecie = sc.nextLine();
                    System.out.print("Novo nome do dono: ");
                    String novoNomeDono = sc.nextLine();
                    System.out.print("Novo telefone: ");
                    String novoTelefone = sc.nextLine();
                    System.out.print("Novo serviço adicional: ");
                    String novoServico = sc.nextLine();

                    AgendaManager.editar(posEd, novoNomePet, novaEspecie, novoNomeDono, novoTelefone, novoServico);
                    break;

                case 4:
                    System.out.print("Informe o horário (0-9) para excluir: ");
                    int posEx = sc.nextInt();
                    sc.nextLine();
                    AgendaManager.excluir(posEx);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        sc.close();
    }
}
