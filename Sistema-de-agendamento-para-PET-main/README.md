# Sistema-de-agendamento-para-PET
projeto do 3° bimestre de Programação Orientada a Objeto

<img width="1112" height="589" alt="image" src="https://github.com/user-attachments/assets/5d246003-4da0-442f-b4cc-c9b60deca134" />


## Orientações para o projeto

Atividade:
Projeto: Sistema de Gerenciamento de Agenda de Banho para Pet Shop
Descrição Geral:
Desenvolver um sistema em Java para gerenciar a agenda de banhos de um Pet Shop,
utilizando vetores, herança e atributos/métodos estáticos. O sistema será executado no
console e permitirá que as recepcionistas realizem operações de agendamento, edição,
exclusão e consulta de horários para os pets.

Requisitos Funcionais:
1. Cadastro de Banho:
o Permitir que a recepcionista cadastre um novo agendamento de banho.
o Cada agendamento deve conter:
▪ Nome do Pet
▪ Espécie (cachorro, gato, etc.)
▪ Nome do Dono
▪ Telefone do Dono
▪ Horário do Banho
▪ Serviço Adicional (opcional: hidratação, tosa, etc.)

2. Consultar Agenda:
o Mostrar todos os horários agendados (ocupados) e os disponíveis em um
vetor fixo (por exemplo, 10 horários por dia).

3. Editar Agendamento:
o Permitir alterar os dados do pet ou do dono para um horário já agendado.
4. Excluir Agendamento:
o Cancelar um horário previamente agendado, deixando-o disponível
novamente.

Requisitos Técnicos:
• Uso de Vetores:
o O sistema deve utilizar um vetor para armazenar os agendamentos (por
exemplo, Agendamento[] agenda = new Agendamento[10];).

• Herança:
o Criar uma classe base Agendamento com atributos e métodos comuns.
o Criar subclasses para diferentes Serviços de Banho (ex.: BanhoSimples,
BanhoComTosa), que herdam da classe Agendamento.

• Static:
o Implementar uma classe AgendaManager com métodos estáticos para
gerenciar a agenda:
▪ agendar(), editar(), excluir(), listar().

• Classes sugeridas:
o Agendamento (classe base)
o BanhoSimples e BanhoComTosa (herdam de Agendamento)
o AgendaManager (métodos estáticos para controle)
o Principal (contendo o método main para interação)

Regras do Sistema:
• Não é permitido agendar dois pets no mesmo horário.
• A agenda tem capacidade fixa (por exemplo, 10 horários por dia).
• Caso a agenda esteja cheia, exibir mensagem de erro.
• Caso tente editar ou excluir um horário vazio, exibir mensagem de erro.

Exemplo de Fluxo:
1. Usuário escolhe opção no menu:
1 - Agendar banho
2 - Consultar agenda
3 - Editar agendamento
4 - Excluir agendamento
5 - Sair

2. Se a opção for "Agendar banho", solicitar dados do pet e do dono e inserir no
vetor.
3. Se a opção for "Consultar", exibir lista com horários disponíveis e ocupados.
