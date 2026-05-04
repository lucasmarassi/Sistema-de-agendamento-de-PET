public class Agendamento {
    protected String nomePet;
    protected String especie;
    protected String nomeDono;
    protected String telefoneDono;
    protected String horario;
    protected String servicoAdicional;

    public Agendamento(String nomePet, String especie, String nomeDono, String telefoneDono, String horario,
            String servicoAdicional) {
        this.nomePet = nomePet;
        this.especie = especie;
        this.nomeDono = nomeDono;
        this.telefoneDono = telefoneDono;
        this.horario = horario;
        this.servicoAdicional = servicoAdicional;
    }

    public String getHorario() {
        return horario;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public void setTelefoneDono(String telefoneDono) {
        this.telefoneDono = telefoneDono;
    }

    public void setServicoAdicional(String servicoAdicional) {
        this.servicoAdicional = servicoAdicional;
    }

    public void exibirDetalhes() {
        System.out.println("Pet: " + nomePet + " (" + especie + ")");
        System.out.println("Dono: " + nomeDono + " - Tel: " + telefoneDono);
        System.out.println("Horário: " + horario);
        System.out.println("Serviço adicional: " + (servicoAdicional == null ? "Nenhum" : servicoAdicional));
    }
}
