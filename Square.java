import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class Square {
    private int size;
    private int num;
    private int posX;
    private int posY;
    private Rectangle square;
    
    //private Piece occupiedBy;
    
    //constructor
    public Square(int size, Color color, int num, int posX, int posY) {
        this.size = size;
        this.num=num;
        this.posX=posX;
        this.posY=posY;
        this.square = new Rectangle(this.posX,this.posY,this.size,this.size);
        this.square.setFill(color);
    }
    
    public Rectangle getRec() {
        return this.square;
    }
    
}
