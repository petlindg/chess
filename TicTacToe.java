import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class TicTacToe extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
    
        //configurables
        int squareSize = 100;
        int squareNum = 8;
        
        Pane root = new Pane();
            
        plotGrid(root, squareSize, squareNum);
        
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Schack");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void plotGrid(Pane root, int squareSize, int squareNum) {
        
        int n = 0;
        Color c1 = Color.rgb(243,240,235); //white
        Color c2 = Color.rgb(116,179,119); //green
        Color c;
        
        Square[] squares = new Square[squareNum*squareNum];
        
        for(int i = 0; i<squareNum; i++) {
            for(int j = 0; j<squareNum; j++) {
            
                if((i+j)%2==0) {
                    c = c1;
                }
                else {
                    c = c2;
                }
                
                squares[n] = new Square(squareSize, c, n, j*squareSize, i*squareSize);
                n++;
            }
        }
        
        Rectangle[] rectangles = new Rectangle[squares.length];
        for(int i = 0; i<squares.length; i++) {
            rectangles[i]=squares[i].getRec();
        }
        
        root.getChildren().addAll(rectangles);
    }
}
