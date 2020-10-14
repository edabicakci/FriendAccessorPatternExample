package nonapi;

import api.Item;

import javax.swing.event.ChangeListener;
// Hello World!

public abstract class Accessor {
    private static volatile Accessor DEFAULT;

    public static Accessor getDefault() {
        Accessor a = DEFAULT;
        if (a != null) {
            return a;
        }
        try {
            Class.forName(
                    Item.class.getName(), true, Item.class.getClassLoader()
            );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return DEFAULT;
    }

    public static void setDefault(Accessor accessor) {
        if (DEFAULT != null) {
            throw new IllegalStateException();
        }
        DEFAULT = accessor;
    }

    public Accessor() {

    }

    protected abstract Item newItem();

    protected abstract void addChangeListener(Item item, ChangeListener l);
}
