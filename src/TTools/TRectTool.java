package TTools;

import TFigures.TFigure;
import TFigures.TRect;

public class TRectTool extends TEzFigureTool{
    @Override public TFigure GetFigure() {
        return new TRect();
    } 
}
