public class AgendaManager {
    public static Agendamento[] agenda = new Agendamento[10];

    // Verifica se um horário é válido (0 a 9)
    public static boolean horarioValido(int horario) {
        return horario >= 0 && horario < agenda.length;
    }

    // Verifica se o horário está ocupado
    public static boolean horarioOcupado(int horario) {
        if (!horarioValido(horario)) {
            return false; // Um horário inválido não pode estar ocupado.
        }
        return agenda[horario] != null; // Agora é seguro checar o array.
    }

    public static boolean agendaCheia() {
        for (Agendamento ag : agenda) {
            if (ag == null) return false;
        }
        return true;
    }

    public static void agendar(Agendamento agendamento, int posicao) {
        if (!horarioValido(posicao)) {
            System.out.println("Horário inválido! Escolha entre 0 e " + (agenda.length-1));
        } else if (horarioOcupado(posicao)) {
            System.out.println("Esse horário já está ocupado!");
        } else {
            agenda[posicao] = agendamento;
            System.out.println("Agendamento realizado com sucesso!");
        }
    }

    public static void listar() {
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("Horário " + i + ":");
            if (agenda[i] == null) {
                System.out.println("   [DISPONÍVEL]");
            } else {
                agenda[i].exibirDetalhes();
            }
            System.out.println("-------------------");
        }
    }

    public static void editar(int posicao, String novoNomePet, String novaEspecie, String novoNomeDono, String novoTelefone, String novoServico) {
        if (!horarioValido(posicao) || agenda[posicao] == null) {
            System.out.println("Não há agendamento nesse horário para editar.");
        } else {
            agenda[posicao].setNomePet(novoNomePet);
            agenda[posicao].setEspecie(novaEspecie);
            agenda[posicao].setNomeDono(novoNomeDono);
            agenda[posicao].setTelefoneDono(novoTelefone);
            agenda[posicao].setServicoAdicional(novoServico);
            System.out.println("Agendamento atualizado com sucesso!");
        }
    }

    public static void excluir(int posicao) {
        if (!horarioValido(posicao) || agenda[posicao] == null) {
            System.out.println("Não há agendamento nesse horário para excluir.");
        } else {
            agenda[posicao] = null;
            System.out.println("Agendamento cancelado!");
        }
    }
}
