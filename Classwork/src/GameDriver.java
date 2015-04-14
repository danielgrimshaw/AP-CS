public class GameDriver {
   private GameState state;
   public GameDriver(GameState initial) {
      state = initial;
   }

   public void play() {
      while (!(state.isGameOver())) {
         System.out.println(state);
         state.makeMove(state.getCurrentPlayer().getNextMove(state));
      }
      if (state.getWinner() != null)
         System.out.print(state.getWinner()+" wins");
      else
         System.out.print("Game ends in a draw");
   }
}


