import java.util.Scanner;

public class f1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiroLugar = 12;
        int segundoLugar = 9;
        int terceirolugar = 8;
        int quartoLugar = 7;
        int quintoLugar = 6;
        int sextoLugar = 5;
        int setimoLugar = 4;
        int oitavoLugar = 3;
        int nonoLugar = 2;
        int decimoLugar = 1;
        int decimoPrimeiroLugar = 0;
        int decimoSegundoLugar = 0;
        int decimoTerceirolugar = 0;
        int decimoQuartoLugar = 0;
        int decimoQuintoLugar = 0;
        int decimoSextoLugar = 0;
        int decimoSétimoLugar = 0;
        int decimoOitavoLugar = 0;
        int decimoNonoLugar = 0;
        int vigesimoLugar = 0;
        int abandonouACorrida = 0;
        int naoParticipouDaCorrida = 0;

        Integer pontuacaoCharlesLeclerc = null;
        System.out.print("Quantos pontos Charles Leclerc somou na corrida da Australia?");
        Double charlesLeclerc = scanner.nextDouble();
        if (charlesLeclerc == 1) {
            pontuacaoCharlesLeclerc = primeiroLugar;
        } else if (charlesLeclerc == 2) {
            pontuacaoCharlesLeclerc = segundoLugar;
        } else if (charlesLeclerc == 3) {
            pontuacaoCharlesLeclerc = terceirolugar;
        } else if (charlesLeclerc == 4) {
            pontuacaoCharlesLeclerc = quartoLugar;
        } else if (charlesLeclerc == 5) {
            pontuacaoCharlesLeclerc = quintoLugar;
        } else if (charlesLeclerc == 6) {
            pontuacaoCharlesLeclerc = sextoLugar;
        } else if (charlesLeclerc == 7) {
            pontuacaoCharlesLeclerc = setimoLugar;
        } else if (charlesLeclerc == 8) {
            pontuacaoCharlesLeclerc = oitavoLugar;
        } else if (charlesLeclerc == 9) {
            pontuacaoCharlesLeclerc = nonoLugar;
        } else if (charlesLeclerc == 10) {
            pontuacaoCharlesLeclerc = decimoLugar;
        } else {
            pontuacaoCharlesLeclerc = 0;
        }

        System.out.print("Quantos pontos George Russell somou na corrida da Australia?");
        Double georgeRussel = scanner.nextDouble();

        System.out.print("Quantos pontos Carlos Sainz somou na corrida da Australia?");
        Double carlosSainz = scanner.nextDouble();

        System.out.print("Quantos pontos Sergio Pérez somou na corrida da Australia?");
        Double sergioPerez = scanner.nextDouble();

        System.out.print("Quantos pontos Lewis Hamilton somou na corrida da Australia?");
        Double lewisHamilton = scanner.nextDouble();

        System.out.print("Quantos pontos Max Verstappen somou na corrida da Australia?");
        Double maxVerstappen = scanner.nextDouble();

        System.out.print("Quantos pontos Esteban Ocon somou na corrida da Australia?");
        Double estebanOcon = scanner.nextDouble();

        System.out.print("Quantos pontos Lando Norris somou na corrida da Australia?");
        Double landoNorris = scanner.nextDouble();

        System.out.print("Quantos pontos Kevin Magnussen somou na corrida da Australia?");
        Double kevinMagnussen = scanner.nextDouble();

        System.out.print("Quantos pontos Valtteri Bottas somou na corrida da Australia?");
        Double valtteriBottas = scanner.nextDouble();

        System.out.print("Quantos pontos Daniel Ricciardo somou na corrida da Australia?");
        Double danielRicciardo = scanner.nextDouble();

        System.out.print("Quantos pontos Pierre Gasly somou na corrida da Australia?");
        Double pierreGasly = scanner.nextDouble();

        System.out.print("Quantos pontos Yuki Tsunoda somou na corrida da Australia?");
        Double yukiTsunoda = scanner.nextDouble();

        System.out.print("Quantos pontos Fernando Alonso somou na corrida da Australia?");
        Double fernandoAlonso = scanner.nextDouble();

        System.out.print("Quantos pontos Guanyu Zhou somou na corrida da Australia?");
        Double guanyuZhou = scanner.nextDouble();

        System.out.print("Quantos pontos Alexander Albon somou na corrida da Australia?");
        Double alexanderAlbon = scanner.nextDouble();

        System.out.print("Quantos pontos Mick Schumacher somou na corrida da Australia?");
        Double mickShumacher = scanner.nextDouble();

        System.out.print("Quantos pontos Lance Stroll somou na corrida da Australia?");
        Double lanceStroll = scanner.nextDouble();

        System.out.print("Quantos pontos Nicholas Latifi somou na corrida da Australia?");
        Double nicholasLatifi = scanner.nextDouble();

        System.out.print("Quantos pontos Sebastian Vettel somou na corrida da Australia?");
        Double sebastianVettel = scanner.nextDouble();

        int resultadoPontuacaoCharlesLeclarc = (int) (primeiroLugar + segundoLugar + pontuacaoCharlesLeclerc);
        System.out.println("Charles Leclerc tem " + resultadoPontuacaoCharlesLeclarc + "Pontos!");

        int resultadoPontuacaoGeorgeRussel = (int) (quartoLugar + quintoLugar + georgeRussel);
        System.out.println("George Russel tem " + resultadoPontuacaoGeorgeRussel + "Pontos!");

        int resultadoPontuacaoCarlosSainz = (int) (segundoLugar + terceirolugar + carlosSainz);
        System.out.println("carlos sainz tem " + resultadoPontuacaoCarlosSainz + "Pontos!");

        int resultadoPontuacaoSergioPerez = (int) (decimoOitavoLugar + quartoLugar + sergioPerez);
        System.out.println("Sergio perez tem " + resultadoPontuacaoSergioPerez + "Pontos!");

        int resultadoPontuacaoLewisHamilton = (int) (terceirolugar + decimoLugar + lewisHamilton);
        System.out.println("Lewis Hamilton tem" + resultadoPontuacaoLewisHamilton + "Pontos!");

        int resultadoPontuacaoMaxVerstappen = (int) (decimoNonoLugar + primeiroLugar + maxVerstappen);
        System.out.println("Max Veerstappen tem" + resultadoPontuacaoMaxVerstappen + "Pontos!");

        int resultadoPontuacaoEstebanOcon = (int) (setimoLugar + sextoLugar + estebanOcon);
        System.out.println("Estebam ocon tem" + resultadoPontuacaoEstebanOcon + "Pontos!");

        int resultadoPontuacaoLandoNorris = (int) (decimoQuintoLugar + setimoLugar + landoNorris);
        System.out.println("Lando Norris tem" + resultadoPontuacaoLandoNorris + "Pontos!");

        int resultadoPontuacaoKevinMagnussen = (int) (quintoLugar + nonoLugar + kevinMagnussen);
        System.out.println("Kevin Magnussen tem" + resultadoPontuacaoKevinMagnussen + "Pontos!");

        int resultadoPontuacaoValtteriBottas = (int) (sextoLugar + vigesimoLugar + valtteriBottas);
        System.out.println("valtteri Bottas tem" + resultadoPontuacaoValtteriBottas + "Pontos!");

        int resultadoPontuacaoDanielRicciardo = (int) (decimoQuartoLugar + decimoNonoLugar + danielRicciardo);
        System.out.println("Daniel Ricciardo tem" + resultadoPontuacaoDanielRicciardo + "Pontos!");

        int resultadoPontuacaoPierreGasly = (int) (decimoOitavoLugar + oitavoLugar + pierreGasly);
        System.out.println("Pierre Gasly tem" + resultadoPontuacaoPierreGasly + "Pontos!");

        int resultadoPontuacaoYukiTsunoda = (int) (oitavoLugar + decimoSétimoLugar + yukiTsunoda);
        System.out.println("Yuki Tsunoda tem" + resultadoPontuacaoYukiTsunoda + "Pontos!");

        int resultadoPontuacaoFernandoAlonso = (int) (nonoLugar + decimoSextoLugar + fernandoAlonso);
        System.out.println("Fernando Alonso tem" + resultadoPontuacaoFernandoAlonso + "Pontos!");

        int resultadoPontuacaoGuanyuZhou = (int) (decimoLugar + decimoPrimeiroLugar +guanyuZhou);
        System.out.println("Guanyu Zhou tem" + resultadoPontuacaoGuanyuZhou + "Pontos!");

        int resultadoPontuacaoAlexanderAlbon = (int) (decimoTerceirolugar + decimoQuartoLugar + alexanderAlbon);
        System.out.println("Alexander Albon tem" + resultadoPontuacaoAlexanderAlbon + "Pontos!");

        int resultadoPontuacaoMickShumacher = (int) (decimoPrimeiroLugar + abandonouACorrida + mickShumacher);
        System.out.println("Mick Shumacher tem" + resultadoPontuacaoMickShumacher + "Pontos!");

        int resultadoPontuacaoLanceStroll = (int) (decimoSegundoLugar + decimoTerceirolugar + lanceStroll);
        System.out.println("Lance Stroll tem" + resultadoPontuacaoLanceStroll + "Pontos!");

        int resultadoPontuacaoNicholasLatifi = (int) (decimoSextoLugar + abandonouACorrida + nicholasLatifi);
        System.out.println("Nicholas latifi tem" + resultadoPontuacaoNicholasLatifi + "Pontos!");

        int resultadoPontuacaoSebastianVettel = (int) (naoParticipouDaCorrida + naoParticipouDaCorrida + sebastianVettel);
        System.out.println("Sebastian vettel tem" + resultadoPontuacaoSebastianVettel + "Pontos!");
    }
}