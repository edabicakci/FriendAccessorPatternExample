package api;

import nonapi.Accessor;

import javax.swing.event.ChangeListener;

final class AccessorImpl extends Accessor {
    @Override
    protected Item newItem() {
        return new Item();
    }

    @Override
    protected void addChangeListener(Item item, ChangeListener l) {
        item.addChangeListener(l);
    }
}
