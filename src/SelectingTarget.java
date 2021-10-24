// Mark Ghaby - 47172584

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Optional;

public class SelectingTarget implements GameState {
  @Override
  public void mouseClick(int x, int y, Stage s) {
    for (Cell c : s.cellOverlay) {
      if (c.contains(x, y)) {
        Optional<Actor> oa = s.actorAt(c);
        if (oa.isPresent()) {
          oa.get().makeRedder(0.1f);
        }
      }
    }
    s.cellOverlay = new ArrayList<Cell>();
    s.currentState = new ChoosingActor();
  }

  @Override
  public void paint(Graphics g, Stage s) {}

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
}
