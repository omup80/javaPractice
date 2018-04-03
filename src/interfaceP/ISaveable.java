package interfaceP;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    void saveObject(ISaveable iSaveable);
    List getObjects();
}
