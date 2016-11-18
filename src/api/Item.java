package api;

import nonapi.Accessor;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public final class Item {
    private int value;
    private ChangeListener listener;

    static {
        Accessor.setDefault(new AccessorImpl());
    }

    Item() {

    }

    public void setValue(int newValue) {
        value = newValue;
        ChangeListener l = listener;
        if (l != null) {
            l.stateChanged(new ChangeEvent(this));
        }
    }

    public int getValue() {
        return value;
    }

    void addChangeListener(ChangeListener l) {
        assert listener == null;
        listener = l;
    }
}
