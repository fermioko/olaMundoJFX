module sp.senac.br.olamundo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;


    opens sp.senac.br.olamundo to javafx.fxml;
    exports sp.senac.br.olamundo;
}