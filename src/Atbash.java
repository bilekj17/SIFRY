public class Atbash implements ISifrovani{

    @Override
    public String sifruj(String text) {
        String veta = "";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a'){
                veta += 'z';
            }
            if (c == 'b'){
                veta += 'y';
            }
            if (c == 'c'){
                veta += 'x';
            }
            if (c == 'd'){
                veta += 'w';
            }
            if (c == 'e'){
                veta += 'v';
            }
            if (c == 'f'){
                veta += 'u';
            }
            if (c == 'g'){
                veta += 't';
            }if (c == 'h'){
                veta += 's';
            }
            if (c == 'i'){
                veta += 'r';
            }
            if (c == 'j'){
                veta += 'q';
            }
            if (c == 'k'){
                veta += 'p';
            }
            if (c == 'l'){
                veta += 'o';
            }
            if (c == 'm'){
                veta += 'n';
            }
            if (c == 'n'){
                veta += 'm';
            }
            if (c == 'o'){
                veta += 'l';
            }
            if (c == 'p'){
                veta += 'k';
            }
            if (c == 'q'){
                veta += 'j';
            }
            if (c == 'r'){
                veta += 'i';
            }
            if (c == 's'){
                veta += 'h';
            }
            if (c == 't'){
                veta += 'g';
            }
            if (c == 'u'){
                veta += 'f';
            }
            if (c == 'v'){
                veta += 'e';
            }
            if (c == 'w'){
                veta += 'd';
            }
            if (c == 'x'){
                veta += 'c';
            }
            if (c == 'y'){
                veta += 'b';
            }
            if (c == 'z'){
                veta += 'a';
            }
            if (c == ' '){
                veta += ' ';
            }


        }
        return veta;
    }

    @Override
    public String desifruj(String text) {
        String veta = "";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a'){
                veta += 'z';
            }
            if (c == 'b'){
                veta += 'y';
            }
            if (c == 'c'){
                veta += 'x';
            }
            if (c == 'd'){
                veta += 'w';
            }
            if (c == 'e'){
                veta += 'v';
            }
            if (c == 'f'){
                veta += 'u';
            }
            if (c == 'g'){
                veta += 't';
            }if (c == 'h'){
                veta += 's';
            }
            if (c == 'i'){
                veta += 'r';
            }
            if (c == 'j'){
                veta += 'q';
            }
            if (c == 'k'){
                veta += 'p';
            }
            if (c == 'l'){
                veta += 'o';
            }
            if (c == 'm'){
                veta += 'n';
            }
            if (c == 'n'){
                veta += 'm';
            }
            if (c == 'o'){
                veta += 'l';
            }
            if (c == 'p'){
                veta += 'k';
            }
            if (c == 'q'){
                veta += 'j';
            }
            if (c == 'r'){
                veta += 'i';
            }
            if (c == 's'){
                veta += 'h';
            }
            if (c == 't'){
                veta += 'g';
            }
            if (c == 'u'){
                veta += 'f';
            }
            if (c == 'v'){
                veta += 'e';
            }
            if (c == 'w'){
                veta += 'd';
            }
            if (c == 'x'){
                veta += 'c';
            }
            if (c == 'y'){
                veta += 'b';
            }
            if (c == 'z'){
                veta += 'a';
            }
            if (c == ' '){
                veta += ' ';
            }


        }
        return veta;
    }
}
