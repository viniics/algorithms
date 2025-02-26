// Durante uma aula, observei um colega utilizando o DeepSeek e prestei atencao ao fato que as IA's, num geral, 
// escrevem suas respostas em texto caractere por caractere.

// Embora ja tenha utilizado diversas vezes as tecnologias, foi a primeira vez que realmente parei, refleti e me dei conta disso.

// Assim, resolvi fazer um teste de um programa simples que simulasse esse efeito de digitação.

// O código abaixo foi desenvolvido utilizando apenas minha intuição e conhecimentos que já possuo.
// Não pesquisei se já haviam bibliotecas prontas para esse problema nem tampouco fiz consulta à alguma LLM

import java.util.Random;

class TypingSimulator {
    static final Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        String frase = "Essa frase vai ser escrita letra por letra!\nBom dia Brasil\nEu não Usei o ChatGPT( ͡° ͜ʖ ͡°)\n"
                + loremIpsum() + "\n";
        readPhrase(frase);
    }

    static void readPhrase(String frase) throws InterruptedException {
        for (int i = 0; i < frase.length(); i++) {
            char currChar = frase.charAt(i);
            Thread.sleep(controlSpeed(i, frase.length()));
            System.out.print(currChar);
        }
    }

    static String loremIpsum() {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\nDuis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\nExcepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    }

    // Metodo para simular uma digitação mais parecida com o das LLMs
    static int controlSpeed(int currentPos, int fraseLen) {
        // Nos primeiros 25% do texto, o terminal "lê" numa velocidade média
        if (currentPos < (fraseLen / 4)) {
            return random.nextInt(25);
        }
        // Nos últimos 10% do texto, o terminal imprime numa velocidade mais reduzida
        else if (currentPos > (8 * fraseLen / 10))
            return random.nextInt(35);
        // Durante 25-80% do texto, o terminal imprime de forma bem mais acelerada, o
        // que causa a sensação de progresso e de fluidez do programa
        return random.nextInt(15);
    }
}
