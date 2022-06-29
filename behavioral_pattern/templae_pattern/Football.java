package behavioral_pattern.templae_pattern;

public class Football extends Game{
    @Override
    public void initiate() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    public void start() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    public void end() {
        System.out.println("Football Game Finished!");
    }
}
