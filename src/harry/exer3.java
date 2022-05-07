package harry;

import java.util.Scanner;

public class exer3 {

    public static void main(String[] args) {


        exer3 Exer3 = new exer3();

        Exer3.primeiraPergunta();
        Exer3.segundaPergunta();
        Exer3.terceiraPergunta();
        Exer3.quartaPergunta();

    }

    public void primeiraPergunta() {
        System.out.println("Bem vindo a etapa 3!" +
                "\n" +
                "Parabens voce chegou até aqui, ao passar do lago, voce agora tem um novo desafio! para ser o campeão" +
                " tribuxo voce precisa passar pelo labirinto e pegar o calice." +
                "\n" +
                "Todos os participantes incluindo voce entram no labirinto e começam a tentar encontrar o caminho certo." +
                "\n");
        String alternativa;
        do {
            System.out.println("Você está no meio do labirinto, derrepente houve um barulho de gritos, você corre para " +
                    "ver o que aconteceu, você vê uma competidora desmaiada. " +
                    "\n" +
                    "Por causa de victor crum outro adversário, ela está sendo sugada pelo labirinto você pode :" +
                    "\n" + "\n" +
                    "A) Tenta soltar com as maos impedir que ela seja sugada." +
                    "\n" +
                    "B) Joga um feitiço na parede \n" +
                    "C) Jogar um feitiço de localização para os professores dela virem.\n" +
                    "D) Não faz nada. Deixa ela lá.\n" +
                    "E) Gritar pedindo ajuda pára outro competidor.");

            Scanner scanner = new Scanner(System.in);
            alternativa = scanner.next();


            int vida = 0;
            if (alternativa.equalsIgnoreCase("a")) {

                System.out.println(" Com essa tentativa voce foi sugado também,  ");

                vida--;
            } else if (alternativa.equalsIgnoreCase("B")) {
                System.out.println("o feitiço foi inutil, ela morreu");


                vida--;
            } else if (alternativa.equals("C")) {

                System.out.println("muito bom por sua atitude ela foi salva e voce pode proseguir com seu teste");

            } else if (alternativa.equalsIgnoreCase("D")) {

                System.out.println("por essa atitude ela morreu e você foi desclassificado");
                vida--;
            } else if (alternativa.equalsIgnoreCase("E")) {

                System.out.println("ninguém veio te ajudar e a mulher morreu");
                vida--;
            } else {

                System.out.println("Digite um numero valido");
            }

        } while (!alternativa.equalsIgnoreCase("C"));

    }

    public void segundaPergunta() {

        String alternativa;
        do {

            System.out.println("Ao jogar o feitiço de localização  o labirinto começa a fechar  você começa a correr." +
                    "\n" +
                    " Você percebe que tem dois competidores brigando com suas varinhas, um dele está enfeitiçado," +
                    "cedrico ganha dele , \n entretando depois de ter derrotado ele, cedrigo quer matar ele pelo o que fez com a outra" +
                    " competidora, agora você\n" +
                    "\n" +
                    "A) Deixa cedrico matar ele afinal quase matou a outra competidora." +
                    "\n" +
                    "B) Mata cedrico impedindo ele." +
                    "\n" +
                    "C) Segura ele explicando que ele apenas está enfeitiçado." +
                    "\n" +
                    "D) Joga um feitiço contra cedrico deixando ele desmaiado. ");


            Scanner scanner = new Scanner(System.in);
            alternativa = scanner.next();


            int vida = 0;
            if (alternativa.equalsIgnoreCase("a")) {

                System.out.println("vocês dois foram desclassificados por matar");

                vida--;
            } else if (alternativa.equalsIgnoreCase("B")) {

                System.out.println("você foi  desclassificados por matar");

                vida--;
            } else if (alternativa.equalsIgnoreCase("C")) {

                System.out.println("muito bem agora voces podem prosseguir.");

            } else if (alternativa.equalsIgnoreCase("D")) {

                System.out.println("você precisava do cedrico para continuar");

                vida--;
            } else {
                System.out.println("digite um valor valido");
            }


        } while (!alternativa.equalsIgnoreCase("C"));


    }

    public void terceiraPergunta() {

        String alternativa;
        do {

            System.out.println("Depois de convencer cedrico eles deixam o outro competidor ali," +
                    " em seguida começam a correr até o fim do labirinto, \n" +
                    "Vocês vêem o cálice de longe e começam a disputar entre si correndo," +
                    " até que cedrico é pego pelos galhos do labirinto está prestes a morrer, \n" +
                    "mas o cálice está logo alí. Você : \n" +
                    "\n" +
                    "A) Deixa cedrico e vai até o cálice para ganhar o jogo." +
                    "\n" +
                    "B) Da um sinal de localização e vai até o cálice." +
                    "\n" +
                    "C) Joga um feitiço em cedrico para que ele para de gritar." +
                    "\n" +
                    "D) Salva cedrico com um feitiço nas plantas, tirando ele de lá" +
                    "\n" +
                    "E) Se oferece como distração para que ele escape.");

            Scanner scanner = new Scanner(System.in);
            alternativa = scanner.next();


            int vida = 0;
            if (alternativa.equalsIgnoreCase("a")) {

                System.out.println("por sua causa cetrico morreu voce precisava dele");

                vida--;
            } else if (alternativa.equalsIgnoreCase("B")) {

                System.out.println("nesse caso o labirinto estava muito mais agressivo e cetrico morreu, " +
                        "voce precisava dele"
                );

                vida--;
            } else if (alternativa.equalsIgnoreCase("C")) {

                System.out.println("por sua causa cetrico morreu voce precisava dele");

            } else if (alternativa.equalsIgnoreCase("D")) {

                System.out.println("muito bem, sempre se salva um amigo");

                vida--;
            } else if (alternativa.equalsIgnoreCase("E")) {

                System.out.println("Cetrico conseguiu escapar mas voce morreu.");

                vida--;
            } else {
                System.out.println("digite um valor valido");
            }

        } while (!alternativa.equalsIgnoreCase("D"));

    }

    public void quartaPergunta() {

        String alternativa;
        do {

            System.out.println("Ao você salvar cedrico o labirinto todo começa a" +
                    " fechar vocês começam a correr de novo, ao chegar perto " +
                    "do cálice voce decide " +
                    "\n" +"\n"+
                    "A) Deixar que você pegue afinal salvou cedrico ." +
                    "\n" +
                    "B) Dar o cálice a ele " +
                    "\n" +
                    "C) Decidem que vão ir juntos pegar o cálice. " +
                    "\n" +
                    "D) Não pegar nenhum dos dois. +" +
                    "\n" +
                    "E) Lutar contra cedrico para ver quem merece o cálice");

            Scanner scanner = new Scanner(System.in);
            alternativa = scanner.next();


            int vida = 0;
            if (alternativa.equalsIgnoreCase("a")) {

                System.out.println("Voce precisava do cedrico para prosseguir");

                vida--;
            } else if (alternativa.equalsIgnoreCase("B")) {

                System.out.println("o cedrico não poderia ter ganhado sozinho..."
                );

                vida--;
            } else if (alternativa.equalsIgnoreCase("C")) {

                System.out.println("muito bem voces ganharam juntos! ");

            } else if (alternativa.equalsIgnoreCase("D")) {

                System.out.println("o labirinto se fechou e vocês dois morreram");

                vida--;
            } else if (alternativa.equalsIgnoreCase("E")) {

                System.out.println("Vocês dois acabam morrendo pelo labirinto que fechou");

                vida--;
            } else {
                System.out.println("digite um valor valido");
            }


        } while (!alternativa.equalsIgnoreCase("c"));


    }


}

