package behavioral_pattern.templae_pattern;

public class Cricket extends Game{
    @Override
    public void initiate() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    public void start() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    public void end() {
        System.out.println("Cricket Game Finished!");
    }
}
