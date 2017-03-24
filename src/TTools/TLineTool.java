package TTools;

import TFigures.TFigure;
import TFigures.TLine;
import Trasform.TPoint;
import java.awt.Color;
import java.awt.event.MouseEvent;
import paint.*;

public class TLineTool extends TEzFigureTool{
    @Override public TFigure GetFigure() {
        return new TLine();
    }
}
