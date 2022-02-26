module com.example.coinsorter {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.adib to javafx.fxml;
    exports com.example.adib;
    exports com.example.adib.CoinSorter;
    opens com.example.adib.CoinSorter to javafx.fxml;
}