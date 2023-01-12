module com.example.zmienna_double_liczy_pitagorasa_twierdzenie {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zmienna_double_liczy_pitagorasa_twierdzenie to javafx.fxml;
    exports com.example.zmienna_double_liczy_pitagorasa_twierdzenie;
}