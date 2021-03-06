import greenfoot.Greenfoot;

public class GameStartState extends GameState {

    public GameStartState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateRunning() {
       Greenfoot.setWorld(new MyWorld());
       game_manager.setState(GameStates.RUNNING);
    }

    @Override
    public void setStateStopped() {
       System.exit(1);
       game_manager.setState(GameStates.STOPPED);
    }
}