public class BanhoSimples extends Agendamento {
    public BanhoSimples(String nomePet, String especie, String nomeDono, String telefoneDono, String horario) {
        super(nomePet, especie, nomeDono, telefoneDono, horario, null);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Banho Simples ===");
        super.exibirDetalhes();
    }
}
