package org.example.design;

import java.util.List;

public interface IBranch extends ICorp {
    void addSubordinate(ICorp corp);
    List<ICorp> getSubordinate();
}
