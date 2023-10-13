package com.example.hw11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class LoginController {
    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;
    Account account;
    @FXML
    void openRegistration(ActionEvent event) throws IOException {
        Scene currentScene = loginButton.getScene();
        // Закрываем текущее окно
        Stage currentStage = (Stage) currentScene.getWindow();
        currentStage.close();

        // Открываем окно регистрации
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("registration.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Registration");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void verify(ActionEvent event) throws IOException {
        account = new Account(loginField.getText(), passwordField.getText());
        if(isExistsAccount(account)){
            if(verifyPassword(account, account.getPassword())){
                Scene currentScene = loginButton.getScene();
                // Закрываем текущее окно
                Stage currentStage = (Stage) currentScene.getWindow();
                currentStage.close();

                // Открываем окно основного приложения
                FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("main.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setTitle("Registration");
                stage.setScene(scene);
                stage.show();
            }else {
                Alert wrongPassword = new Alert(Alert.AlertType.INFORMATION);
                wrongPassword.setHeaderText("Вы ввели неверный пароль!");
                wrongPassword.showAndWait();
            }
        }else {
            Alert notExistsLogin = new Alert(Alert.AlertType.INFORMATION);
            notExistsLogin.setHeaderText("Аккаунта с таким логином не существует!");
            notExistsLogin.showAndWait();
        }

    }
    boolean verifyPassword(Account account, String password){
        try(FileReader fileReader = new FileReader(account.getLogin() + ".txt")){
            return password.equals(fileReader.read());
        } catch (IOException e) {
            return false;
        }
    }
    boolean isExistsAccount(Account account){
        try(FileReader fileReader = new FileReader(account.getLogin() + ".txt")){
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}