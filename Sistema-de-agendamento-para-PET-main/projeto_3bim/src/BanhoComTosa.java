public class BanhoComTosa extends Agendamento {
    public BanhoComTosa(String nomePet, String especie, String nomeDono, String telefoneDono, String horario, String servicoAdicional) {
        super(nomePet, especie, nomeDono, telefoneDono, horario, servicoAdicional);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Banho com Tosa ===");
        super.exibirDetalhes();
    }
}