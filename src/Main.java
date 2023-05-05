import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int grenais = 0;
        //int vitoriasInter = 0;
        //int vitoriasGremio = 0;
        //int empates = 0;
//
        //do {
        //    System.out.println("Novo grenal (1-sim 2-nao)");
        //    int opcao = sc.nextInt();
//
        //    if (opcao == 1) {
        //        grenais++;
        //        System.out.println("Digite o número de gols do Inter:");
        //        int golsInter = sc.nextInt();
        //        System.out.println("Digite o número de gols do Grêmio:");
        //        int golsGremio = sc.nextInt();
//
        //        if (golsInter > golsGremio) {
        //            vitoriasInter++;
        //        } else if (golsGremio > golsInter) {
        //            vitoriasGremio++;
        //        } else {
        //            empates++;
        //        }
        //    } else if (opcao == 2) {
        //        break;
        //    } else {
        //        System.out.println("Opção inválida. Digite novamente.");
        //    }
        //} while (true);

        //System.out.println(grenais + " grenais");
        //System.out.println("Inter:" + vitoriasInter);
        //System.out.println("Gremio:" + vitoriasGremio);
        //System.out.println("Empates:" + empates);
//
        //if (vitoriasInter > vitoriasGremio) {
        //    System.out.println("Inter venceu mais grenais");
        //} else if (vitoriasGremio > vitoriasInter) {
        //    System.out.println("Grêmio venceu mais grenais");
        //} else {
        //    System.out.println("Não houve vencedor");
        //}
    
        //vini
       /* Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(" ");
            int month = Integer.parseInt(input[0]);
            int day = Integer.parseInt(input[1]);

            LocalDate christmas = LocalDate.of(2016, Month.DECEMBER, 25);
            LocalDate date = LocalDate.of(2016, month, day);
            long daysLeft = ChronoUnit.DAYS.between(date, christmas);

            if (date.isEqual(christmas)) {
                System.out.println("E natal!");
            } else if (date.isEqual(christmas.minusDays(1))) {
                System.out.println("E vespera de natal!");
            } else if (daysLeft < 0) {
                System.out.println("Ja passou!");
            } else {
                System.out.println("Faltam " + daysLeft + " dias para o natal!");
            }
        }

        scanner.close();
 */

            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();

            for(int i= 0 ; i < n; i++){
                if( i==n-1){
                    System.out.println("Ho!");
                    
                }else{
                    System.out.println("Ho");
                }
            }
            System.out.println();
    
    
    }
}
