public class CezarSifra implements ISifrovani {


    @Override
    public String sifruj(String text) {
        String vysledek = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
            char neco = (char) (c+1);
            if (neco == '{') {
                neco = 'a';
            }else if (neco == '[') {
                neco = 'A';
            }
            vysledek += neco;

            }
            else{
                vysledek += c;
            }
        }
        return vysledek;
    }

    @Override
    public String desifruj(String text) {
        String vysledek = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char neco = (char) (c-1);
                if (neco == '@'){
                    neco = 'Z';
                } else if (neco == 96) {
                    neco = 'z';
                }
                vysledek += neco;
            }else{
                vysledek += c;
            }
        }
        return vysledek;
    }

}
