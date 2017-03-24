package TTools;

import TFigures.TFigure;
import Trasform.TPoint;
import java.awt.Color;
import java.awt.event.MouseEvent;
import paint.MainWindow;

public abstract class TEzFigureTool extends TTool{
    @Override public void MouseDragger(MouseEvent ME) {
        if (!draw) return;
        MainWindow.Figures.lastElement().SetPoint(new TPoint(ME.getX(), ME.getY()), 1);
    }
    
    @Override public void MouseDown(java.awt.event.MouseEvent ME, Color c) {
        if (ME.getButton() != ME.BUTTON1) return;
        draw = true;
        super.MouseDown(ME, c);
        MainWindow.Figures.lastElement().AddPoint(new TPoint(ME.getX(), ME.getY()));
        MainWindow.Figures.lastElement().AddPoint(new TPoint(ME.getX(), ME.getY()));
    }
    
    @Override public void MouseUp(java.awt.event.MouseEvent ME){
        draw = false;
    }
}
