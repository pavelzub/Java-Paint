package TFigures;

import Trasform.TPoint;
import java.awt.Graphics;
import java.util.Vector;

public class TLine extends TFigure{
    @Override public void Draw(Graphics g){
        super.Draw(g);
        if (Points.size() < 2) return;
        g.drawLine(Points.get(0).x, Points.get(0).y,
                Points.get(1).x, Points.get(1).y);
    };
}
