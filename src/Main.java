//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "dobryz den";
        CezarSifra cezarSifra = new CezarSifra();
        String ankdnha = cezarSifra.sifruj(text);
        String desifruj = cezarSifra.desifruj(ankdnha);
        System.out.println(ankdnha+", "+desifruj);


        String text2 = "Filipek andilek";
        ROT13Sifra rot13Sifra = new ROT13Sifra();
        String rot13Sifruj = rot13Sifra.sifruj(text2);
        String rot13Desifruj = rot13Sifra.desifruj(rot13Sifruj);
        System.out.println(rot13Sifruj+", "+rot13Desifruj);
    }
}