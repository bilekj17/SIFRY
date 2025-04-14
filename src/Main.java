import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vstup = "";
        while (vstup.equals("")){
            System.out.println("Zadej 1 pro sifru Cezara.");
            System.out.println("Zadej 2 pro sifru ROT13.");
            System.out.println("Zadej 3 pro sifru Atbash.");
            vstup = sc.nextLine();

            switch (vstup){
                case "1":
                    System.out.println("Zadej vetu k zašifrování");
                    String sifruj1 = sc.nextLine();
                    CezarSifra cezarSifra = new CezarSifra();
                    String ankdnha = cezarSifra.sifruj(sifruj1);
                    System.out.println("Zadej větu k dešifrování");
                    String desifruj1 = sc.nextLine();
                    String desifruj = cezarSifra.desifruj(desifruj1);
                    System.out.println(ankdnha+", "+desifruj);
                    break;
                case "2":
                    System.out.println("Zadej vetu k zašifrování");
                    String sifruj2 = sc.nextLine();
                    ROT13Sifra rot13Sifra = new ROT13Sifra();
                    String rot13Sifruj = rot13Sifra.sifruj(sifruj2);
                    System.out.println("Zadej větu k dešifrování");
                    String desifruj2 = sc.nextLine();
                    String rot13Desifruj = rot13Sifra.desifruj(desifruj2);
                    System.out.println(rot13Sifruj+", "+rot13Desifruj);
                    break;
                case "3":
                    System.out.println("Zadej vetu k zašifrování");
                    String sifruj3 = sc.nextLine();
                    Atbash atbash = new Atbash();
                    String atbashSifruj = atbash.sifruj(sifruj3);
                    System.out.println("Zadej větu k dešifrování");
                    String desifruj3 = sc.nextLine();
                    String atbashDesifruj = atbash.desifruj(desifruj3);
                    System.out.println(atbashSifruj+", "+atbashDesifruj);
                    break;
                default:
                    System.out.println("zadej neco");
            }
        }


    }
}