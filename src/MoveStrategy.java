// Mark Ghaby - 47172584

import java.util.List;

interface MoveStrategy {
  public Cell chooseNextLoc(Cell currentLoc, List<Cell> possibleLocs);
}
