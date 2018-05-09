package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.image.ImageView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane gridPane = new GridPane();
        VBox vBox = new VBox();
        //image of an item
        ImageView iv = new ImageView(new Image("https://ia.media-imdb.com/images/M/MV5BNGNiNWQ5M2MtNGI0OC00MDA2LWI5NzEtMmZiYjVjMDEyOWYzXkEyXkFqcGdeQXVyMjM4NTM5NDY@._V1_UX182_CR0,0,182,268_AL_.jpg"));
        iv.setPreserveRatio(false);//ratio not preserved when resized
        iv.setFitWidth(170);
        iv.setFitHeight(193);
        //title of an item
        Label title = new Label("The shape of water");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        //rate of an item
        Label rate = new Label("7.7");
        rate.setFont(Font.font("Arial", FontWeight.BOLD, 11));
        //add items to vbox and pane
        vBox.getChildren().addAll(iv, title, rate);
        gridPane.add(vBox, 0,0, 1, 1);
        //style pane
        gridPane.setStyle("-fx-background-image : url(http://tokuasia.com/wp-content/uploads/2015/06/cross-over-cover.jpg); " +
                "-fx-background-size: cover;");

        Scene scene = new Scene(gridPane, 900,700);

        primaryStage.setTitle("Favorite Films");
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
