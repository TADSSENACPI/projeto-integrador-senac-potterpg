package harry;

public class Exer3 {


    public static void Fase3PrimeiraPergunta() {
        System.out.println("Bem vindo a etapa 3!" + "\n"
                + "Parabens voce chegou ate aqui, ao passar do lago, voce agora tem um novo desafio! para ser o campeão"
                + " tribuxo voce precisa passar pelo labirinto e pegar o calice." + "\n"
                + "Todos os participantes incluindo voce entram no labirinto e começam a tentar encontrar o caminho certo."
                + "\n");
        String alternativa;
        do {
            System.out.println(
                    "Você está no meio do labirinto, derrepente houve um barulho de gritos, você corre para "
                            + "ver o que aconteceu, você vê uma competidora desmaiada. " + "\n"
                            + "Por causa de victor crum outro adversário, ela está sendo sugada pelo labirinto você pode :"
                            + "\n" + "\n" + "A) Tenta soltar com as maos impedir que ela seja sugada." + "\n"
                            + "B) Joga um feitiço na parede \n"
                            + "C) Jogar um feitiço de localização para os professores dela virem.\n"
                            + "D) Não faz nada. Deixa ela lá.\n" + "E) Gritar pedindo ajuda pára outro competidor.");

            alternativa = input.next();

            int vida = 0;
            if (alternativa.equalsIgnoreCase("a")) {

                System.out.println(" Com essa tentativa voce foi sugado também,  ");

                vida(vida, -1);
            } else if (alternativa.equalsIgnoreCase("B")) {
                System.out.println("o feitiço foi inutil, ela morreu");

                vida(vida, -1);
            } else if (alternativa.equals("C")) {

                System.out.println("muito bom por sua atitude ela foi salva e voce pode proseguir com seu teste");
                /**
                 * GANHA XP
                 */
            } else if (alternativa.equalsIgnoreCase("D")) {

                System.out.println("por essa atitude ela morreu e você foi desclassificado");
                vida(vida, -1);
            } else if (alternativa.equalsIgnoreCase("E")) {

                System.out.println("ninguém veio te ajudar e a mulher morreu");
                vida(vida, -1);
            } else {

                System.out.println("Digite um numero valido");
            }

        } while (!alternativa.equalsIgnoreCase("C"));

    }

}
