import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class Chess extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
    
    Rectangle r1 = new Rectangle();
    r1.setX(0);
    r1.setY(0);
    r1.setWidth(100);
    r1.setHeight(100);
    r1.setFill(Color.rgb(100,100,100));
    
    Rectangle r2 = new Rectangle();
    r2.setX(100);
    r2.setY(100);
    r2.setWidth(100);
    r2.setHeight(100);
    r2.setFill(Color.rgb(255,255,255));
    
    
    StackPane root = new StackPane();
    root.getChildren().addAll(r1,r2);
    Scene scene = new Scene(root);
    
    primaryStage.setScene(scene);
    primaryStage.setTitle("Schack");
    primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    //public void drawBoard()
    
}
