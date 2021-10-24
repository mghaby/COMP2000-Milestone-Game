// Mark Ghaby - 47172584

public class NewRogue extends Rogue {
    
    NewRogue(Cell inLoc, float inRedness) {
        super(inLoc, inRedness);
    }

    @Override
    void setLocation(Cell inLoc){
        super.loc = inLoc;
        setPoly();
    }
}