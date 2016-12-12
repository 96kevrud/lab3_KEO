import java.beans.PropertyChangeListener;

/**
 * Created by kajen on 2016-12-12.
 */
public interface IObservable {
    public void addObserver(PropertyChangeListener observer);

    public void removeObserver(PropertyChangeListener observer);
}
