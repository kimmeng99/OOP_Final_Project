module com.example.oop_project_final {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.sql;


  opens com.example.oop_project_final to javafx.fxml;
  exports com.example.oop_project_final;
}