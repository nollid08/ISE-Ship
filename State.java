public class State {
   private int[][] currentState = new int [10][10];
   
   int[][] getState(){
      return currentState;
   }
   
   // Takes X and Y of input co-ordinates
   // Returns the state of the co-ordinate before the move affected it, as a representative int
   int MakeMove(int x, int y){
      int coordinateState = currentState[x][y];
      switch(coordinateState) {
         case 0: // Empty (Unexplored)
            currentState[x][y] = 2; // Update to Empty (Explored)
            return coordinateState;
            break;
         case 1: // Ship (Unexplored)
            currentState[x][y] = 3; // Hit (Explored)
            return coordinateState;
            break;
         case 2: // Empty (Explored)
            // No State Update
            return coordinateState;
            break;
         case 3: // Hit (Explored)
            // No State Update
            return coordinateState;
            break;
         default:
          // code block
      }
   }
}
