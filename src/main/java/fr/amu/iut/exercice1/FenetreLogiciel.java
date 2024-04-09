package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.HorizontalDirection;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.nio.file.attribute.AclEntry;
import java.security.KeyStore;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane bd = new BorderPane();

        Separator Sep = new Separator(Orientation.HORIZONTAL);
        Separator Sep2 = new Separator(Orientation.VERTICAL);

                    Menu File = new Menu("File");

                        MenuItem New = new MenuItem("New");
                        MenuItem Open = new MenuItem("Open");
                        MenuItem Save = new MenuItem("Save");
                        MenuItem Close = new MenuItem("Close");

                    File.getItems().addAll(New, Open, Save, Close);

                    Menu Edit = new Menu("Edit");

                        MenuItem Cut = new MenuItem("Cut");
                        MenuItem Copy = new MenuItem("Copy");
                        MenuItem Paste = new MenuItem("Paste");

                    Edit.getItems().addAll(Cut, Copy, Paste);

                    Menu Help = new Menu("Help");

                    MenuBar Mn = new MenuBar(File, Edit, Help);


            VBox VboxLeftCenter= new VBox();
            VboxLeftCenter.setAlignment(Pos.CENTER);

                Button Boutton1 = new Button("Boutton1");
                Button Boutton2 = new Button("Boutton2");
                Button Boutton3 = new Button("Boutton3");

            VboxLeftCenter.getChildren().addAll(Boutton1, Boutton2, Boutton3);

            VBox VboxCenter = new VBox();
            VBox.setVgrow(VboxCenter, Priority.ALWAYS);
            VboxCenter.setAlignment(Pos.CENTER);

                    GridPane gridpane = new GridPane();
                    GridPane

                    Label Name = new Label ("Name");
                    Label Email = new Label("Email");
                    Label Password = new Label("Password");

                    TextField txt = new TextField();
                    TextField txt1 = new TextField();
                    TextField txt2 = new TextField();

                    gridpane.add(Name,1,0);
                    gridpane.add(Email,1,1);
                    gridpane.add(Password, 1,2);
                    gridpane.add(txt, 2,0);
                    gridpane.add(txt1, 2,1);
                    gridpane.add(txt2, 2,2);

            VboxCenter.getChildren().add(gridpane);

            HBox HboxBottom = new HBox();
            HboxBottom.setAlignment(Pos.BOTTOM_CENTER);
            Label texte = new Label("Ceci est un label en bas de page");
            HboxBottom.getChildren().addAll(texte);

        Scene scene = new Scene(bd);

        bd.setTop(Mn);
        bd.setLeft(VboxLeftCenter);
        bd.setCenter(VboxCenter);
        bd.setBottom(HboxBottom);

        primaryStage.setScene(scene);
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.setTitle("Les conteneurs");

        primaryStage.show();
        // code de l'exercice 1
    }

    public static void main(String[] args) {
        launch(args);

    }
}