import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Created by kajen on 2016-12-13.
 */
public class ReversiScoreView implements PropertyChangeListener{


    public void propertyChange(PropertyChangeEvent evt){
        if(evt.getPropertyName().equals("scoreChange")){    //unly picksup the relevant fires
            if(evt.getSource().getClass() == ReversiModel.class) {  //makes sure its the reversiclass before typecasting to reversi
                ReversiModel r = (ReversiModel) evt.getSource();    //typecast
                System.out.println("WhitePoints: " + r.getWhiteScore());
                System.out.println("BlackPoints: " + r.getBlackScore());
                System.out.println("Its is " + r.getTurnColor() + "'s turn");
            }

        }



    }
}
