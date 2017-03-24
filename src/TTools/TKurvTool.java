package TTools;

import TFigures.TFigure;
import TFigures.TKurv;

public class TKurvTool extends TPolylineTool{
    @Override public TFigure GetFigure() {
        return new TKurv();
    }
}
