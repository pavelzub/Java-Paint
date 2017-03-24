package TFigures;

import java.awt.Graphics;

public class TBrokenLine extends TFigure{        
    @Override public void Draw(Graphics g){
        super.Draw(g);
        if (Points.size() < 2) return;
        for (int i = 0; i < Points.size() - 1; i++)
            g.drawLine(Points.get(i).x, Points.get(i).y,
                Points.get(i + 1).x, Points.get(i + 1).y);
    };
}
