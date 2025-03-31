public class ROT13Sifra implements ISifrovani{

    private char rot13Znak(char znak){
        if (Character.isUpperCase(znak)){
            return (char) ((znak - 'A'+13)%26 + 'A');
        } else if (Character.isLowerCase(znak)) {
            return (char) ((znak - 'a' + 13)%26 + 'a');
        }
        return znak;
    }

    @Override
    public String sifruj(String text) {
        return zpracovaniTextu(text);
    }

    @Override
    public String desifruj(String text) {
        return zpracovaniTextu(text);
    }

    private String zpracovaniTextu(String text){
        String vysledek = "";
        for (int i = 0; i < text.length(); i++){
            vysledek += rot13Znak(text.charAt(i));
        }
        return vysledek;
    }
}
