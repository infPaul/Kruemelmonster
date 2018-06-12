
import javafx.animation.AnimationTimer;

public class Timer extends AnimationTimer
{
    Spiel spiel;
    private long lastUpdate = 0 ;
   public Timer(Spiel spiel_){
        spiel = spiel_;
    }

    @Override
    public void handle(long now) {

        spiel.update();
    }

    @Override
    public void start(){
        super.start();
    }

    @Override
    public void stop(){
        super.stop();
    }
}
