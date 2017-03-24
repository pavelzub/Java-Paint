package TFigures;

import java.awt.*;
import java.util.Vector;
import Trasform.*;

public abstract class TFigure {
    public Vector<TPoint> Points;
    public Color FPenColor;
    
    public TFigure(){
        Points = new Vector<TPoint>();
    }
    public void AddPoint(TPoint Point){
        Points.add(Point);
    }
    public void SetPoint(TPoint Point, int i){
        Points.set(i, Point);
    }
    public void Draw(Graphics g){
        g.setColor(FPenColor);
    } 
}

