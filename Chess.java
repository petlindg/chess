import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Chess extends Application {

    final private int squareSize = 100;
    final private int squareNum = 8;    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Pane root = new Pane();
        Scene scene = new Scene(root);
        
        plotGrid(root, squareSize, squareNum);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Chess");
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void plotGrid(Pane root, int squareSize, int squareNum) {
        
        Color c1 = Color.rgb(243,240,235); //white
        Color c2 = Color.rgb(116,179,119); //green
        Color c;
        Rectangle[] squares = new Rectangle[squareNum*squareNum];
        int n = 0;
        
        for(int i = 0; i<squareNum; i++) {
        
            for(int j = 0; j<squareNum; j++) {
            
                if((i+j)%2==0) {
                    c = c1;
                }
                else {
                    c = c2;
                }
                squares[n] = new Rectangle(j*squareSize, i*squareSize, squareSize, squareSize);
                squares[n].setFill(c);
                n++;
                
            }
            
        }
        
        root.getChildren().addAll(squares);
        
    }
       
}
