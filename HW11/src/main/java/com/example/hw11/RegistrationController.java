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

public class RegistrationController {
    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button regestrationButton;
    Account account;

    @FXML
    void verify(ActionEvent event) throws IOException {
        account = new Account(loginField.getText(), passwordField.getText());
        if(isNotExistsAccount(account)){
            try(FileWriter fileWriter = new FileWriter(account.getLogin() + ".txt")) {
                fileWriter.write(account.getPassword());
                Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                successAlert.setTitle("Успешно");
                successAlert.setHeaderText("Вы успешно зарегистрированы");
                successAlert.showAndWait();
            } catch (IOException e) {
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setTitle("Ошибка");
                errorAlert.setHeaderText("Ошибка записи в файл");
                errorAlert.setContentText("При записи в файл произошла ошибка:\n" + Arrays.toString(e.getStackTrace()));
                errorAlert.showAndWait();
                verify(event);
            }
            Scene currentScene = regestrationButton.getScene();
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
        }
    }

    boolean isNotExistsAccount(Account account){
        try(FileReader fileReader = new FileReader(account.getLogin() + ".txt")){
            return false;
        } catch (IOException e) {
            return true;
        }
    }
}
