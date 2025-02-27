    import java.util.Scanner;

    public class QuestaoD {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(menor(num));
            sc.close();
        }


        static int menor(int num){
            int resposta = num;
            while (!isSuperSorte(resposta)) {
                resposta++;
            }
            return resposta;
        }

        static boolean isSuperSorte(int num) {
            String str = String.valueOf(num);
            int quantidade4 = 0;
            int quantidade7 = 0;
            char[] checaSeTemOutro = str.toCharArray();
            if(((checaSeTemOutro.length)%2)!=0){
                return false;
            }
            for (char c : checaSeTemOutro) {
                if (c == '4') {
                    quantidade4++;
                } else if (c=='7') {
                    quantidade7++;
                }
                else{
                    return false;
                }
            }
            return quantidade4 == quantidade7 && quantidade4 != 0;
        }
    }