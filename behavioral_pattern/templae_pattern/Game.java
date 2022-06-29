package behavioral_pattern.templae_pattern;

public abstract class Game {
    abstract void initiate();
    abstract void start();
    abstract void end();

    public final void play()
    {
        initiate();
        start();
        end();
    }
}
