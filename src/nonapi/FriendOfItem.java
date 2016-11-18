package nonapi;

import api.Item;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class FriendOfItem implements ChangeListener {
    public FriendOfItem() {
        Item item = Accessor.getDefault().newItem();
//        Item item1 = new Item();
        Accessor.getDefault().addChangeListener(item, this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
