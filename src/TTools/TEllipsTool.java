package TTools;

import TFigures.TEllips;
import TFigures.TFigure;

public class TEllipsTool extends TEzFigureTool{
    @Override public TFigure GetFigure() {
        return new TEllips();
    }
}
