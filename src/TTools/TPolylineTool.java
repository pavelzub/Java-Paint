package TTools;

import TFigures.TFigure;
import TFigures.TLine;
import Trasform.TPoint;
import java.awt.Color;
import java.awt.event.MouseEvent;
import paint.MainWindow;

public abstract class TPolylineTool extends TTool{

    @Override public void MouseMove(java.awt.event.MouseEvent ME) {
        if (!draw) return;
        if (MainWindow.Figures.lastElement().Points.size() > 1)
            MainWindow.Figures.lastElement().SetPoint(new TPoint(ME.getX(), ME.getY()), 1);
    }

    @Override public void MouseDragger(MouseEvent ME) {
        if (!draw) return;
        if (MainWindow.Figures.lastElement().Points.size() > 1)
            MainWindow.Figures.lastElement().SetPoint(new TPoint(ME.getX(), ME.getY()), 1);
    }
    
    @Override public void MouseDown(java.awt.event.MouseEvent ME, Color c) {
        if (ME.getButton() == ME.BUTTON3){
            draw = false;
            return;
        }
        draw = true;
        super.MouseDown(ME, c);
        MainWindow.Figures.lastElement().AddPoint(new TPoint(ME.getX(), ME.getY()));
        MainWindow.Figures.lastElement().AddPoint(new TPoint(ME.getX(), ME.getY()));
    }
}
