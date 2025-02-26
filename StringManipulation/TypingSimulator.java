//Durante uma aula, observei um colega utilizando o DeepSeek e prestei atencao ao fato que as IA's num geral escrevem um texto caractere por caractere.

//Embora ja tenha utilizado diversas vezes as tecnologias, foi a primeira vez que realmente parei, refleti e me dei conta disso.

//Assim, resolvi fazer um teste de um programa simples que simulasse esse efeito de digitação.

//O código abaixo foi desenvolvido utilizando apenas minha intuição, não pesquisei se já haviam bibliotecas prontas para tal efeito ou tampouco fiz consulta à alguma LLM

class TypingSimulator {
    public static void main(String[] args) throws InterruptedException {
        String frase = "Essa frase vai ser escrita letra por letra!\nBom dia Brasil\nEu não Usei o ChatGPT( ͡° ͜ʖ ͡°)\n"
                + loremIpsum();
        Thread.sleep(100);
        for (int i = 0; i < frase.length(); i++) {
            char currChar = frase.charAt(i);
            Thread.sleep(50);
            System.out.print(currChar);
        }
    }

    static String loremIpsum() {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\nDuis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\nExcepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    }
}
