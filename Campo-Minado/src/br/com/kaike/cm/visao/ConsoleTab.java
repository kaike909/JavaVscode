package br.com.kaike.cm.visao;

import java.util.*;
import br.com.kaike.cm.excecao.*;
import br.com.kaike.cm.modelo.Tabuleiro;

public class ConsoleTab {

    private Tabuleiro tabuleiro;
    private Scanner in = new Scanner(System.in);

    public ConsoleTab(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        startGame();
    }

    private void startGame() {
        try {
            boolean continua = true;

            while (continua) {

                gameLoop();
                System.out.println("Outra partida? (S/N)");
                String quote = in.nextLine();
                if ("n".equalsIgnoreCase(quote)) {
                    continua = false;
                } else {
                    tabuleiro.restart();
                }
            }
        } catch (ExitException e) {
            System.out.println("Vlw!");
        } finally {
            in.close();
        }
    }

    private void gameLoop() {
        try {

            while (!tabuleiro.objectiveAcomplished()) {
                System.out.println(tabuleiro);
                String digit = captureNumDigit("Digite (x, y): ");
                Iterator<Integer> xy = Arrays.stream(digit.split(","))
                        .map(e -> Integer.parseInt(e.trim()))
                        .iterator();

                digit = captureNumDigit("1 - OPEN or 2 - (Un)Mark: ");
                if ("1".equals(digit)) {
                    tabuleiro.open(xy.next(), xy.next());
                } else if ("2".equals(digit)) {
                    tabuleiro.mark(xy.next(), xy.next());
                }
            }

            System.out.println(tabuleiro);
            System.out.println("Voce ganhou!");
        } catch (ExplosaoException e) {
            System.out.println(tabuleiro);
            System.out.println("Voce Perdeu!");
        }
    }

    private String captureNumDigit(String text) {
        System.out.print(text);
        String digit = in.nextLine();
        if ("exit".equalsIgnoreCase(digit)) {
            throw new ExitException();
        }
        return digit;
    }

}
