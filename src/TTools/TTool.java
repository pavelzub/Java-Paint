package TTools;
import TFigures.*;
import java.awt.Color;
import java.awt.event.MouseEvent;
import paint.MainWindow;

public abstract class TTool {
    boolean draw = false;
    public void MouseMove(java.awt.event.MouseEvent ME){};
    public void MouseDown(java.awt.event.MouseEvent ME, Color c){
        MainWindow.Figures.add(GetFigure());
        MainWindow.Figures.lastElement().FPenColor = c;
    }
    public void MouseUp(java.awt.event.MouseEvent ME){};
    public void MouseDragger(java.awt.event.MouseEvent ME){};
    public abstract TFigure GetFigure(); 
}
