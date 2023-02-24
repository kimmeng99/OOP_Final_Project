package com;

import com.ProductManagement.Product;
import com.example.oop_project_final.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws Exception {
    Product p = new Product();
    p.displayDB();
  }

}