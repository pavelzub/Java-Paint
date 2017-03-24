package TTools;

import TFigures.TBrokenLine;
import TFigures.TFigure;
import TFigures.TLine;

public class TBrokenLineTool extends TPolylineTool{
    @Override public TFigure GetFigure() {
        return new TBrokenLine();
    }
}
