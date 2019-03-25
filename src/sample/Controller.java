package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField unos;
    public Label rez;

    public void izvrsiDugme(ActionEvent actionEvent) {

        String x = new String();

        x = unos.getText();

        String[] niz = x.split(" ");

        int max = niz[0].length(), brstr = 0;

        for (int i = 0; i < niz.length; i++){

            if (niz[i].length() > max) {
                max = niz[i].length();
                brstr = i;
            }
        }

        niz[brstr] = niz[brstr].toUpperCase();

        for (int i = 0; i < niz.length; i++) {

            System.out.println(niz[i]);
        }

    }
}
