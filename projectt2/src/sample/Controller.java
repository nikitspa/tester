package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    private boolean b1Clicked = false;


    @FXML
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    //Button[] jet = new Button[]{b2, b1, b7};
    //if (jet)
    boolean game = true;

    @FXML
    public void f1(){
        String buttonText = b1.getText();
        if ("".equals(buttonText)){
            b1.setDisable(true);
        }

        if(game) {
            b1.setText("O");
        }
        else {
            b1.setText("X");
        }
        game = !game;
    }

    @FXML

    public void f2(){
        String buttonText = b2.getText();
        if ("".equals(buttonText)){
            b2.setDisable(true);
        }
        if(game) {
            b2.setText("O");
        }
        else {
            b2.setText("X");
        }
        game = !game;
    }
    @FXML
    public void f3(){
        String buttonText = b3.getText();
        if ("".equals(buttonText)){
            b3.setDisable(true);
        }
        if(game) {
            b3.setText("O");
        }
        else {
            b3.setText("X");
        }
        game = !game;
    }
    @FXML
    public void f4(){
        String buttonText = b4.getText();
        if ("".equals(buttonText)){
            b4.setDisable(true);
        }
        if(game) {
            b4.setText("O");
        }
        else {
            b4.setText("X");
        }
        game = !game;
    }
    @FXML
    public void f5(){
        String buttonText = b5.getText();
        if ("".equals(buttonText)){
            b5.setDisable(true);
        }
        if(game) {
            b5.setText("O");
        }
        else {
            b5.setText("X");
        }
        game = !game;
    }
    @FXML
    public void f6(){
        String buttonText = b6.getText();
        if ("".equals(buttonText)){
            b6.setDisable(true);
        }
        if(game) {
            b6.setText("O");
        }
        else {
            b6.setText("X");
        }
        game = !game;

    }
    @FXML
    public void f7(){
        String buttonText = b7.getText();
        if ("".equals(buttonText)){
            b7.setDisable(true);
        }
        if(game) {
            b7.setText("O");
        }
        else {
            b7.setText("X");
        }
        game = !game;
    }
    @FXML
    public void f8(){
        String buttonText = b8.getText();
        if ("".equals(buttonText)){
            b8.setDisable(true);
        }
        if(game) {
            b8.setText("O");
        }
        else {
            b8.setText("X");
        }
        game = !game;
    }
    @FXML
    public void f9(){
        String buttonText = b9.getText();
        if ("".equals(buttonText)){
            b9.setDisable(true);
        }
        if(game) {
            b9.setText("O");
        }
        else {
            b9.setText("X");
        }
        game = !game;

    }
    @FXML
    private Label myLabel;
    public void initialize() {
        myLabel.setText("Привет");
    }

}
