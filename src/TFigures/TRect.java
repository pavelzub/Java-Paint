package TFigures;

import java.awt.Graphics;

public class TRect extends TFigure{
    @Override public void Draw(Graphics g){
        if (Points.size() < 2) return;
        super.Draw(g);
        g.drawRect(Math.min(Points.get(0).x, Points.get(1).x),
                Math.min(Points.get(0).y, Points.get(1).y),
                Math.abs(Points.get(1).x - Points.get(0).x), 
                Math.abs(Points.get(1).y - Points.get(0).y));
    };
}
