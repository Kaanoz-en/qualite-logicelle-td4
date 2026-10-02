package srp;

public class Siege {
    private boolean disponible;
    private PassagerType type;

    public PassagerType getType() {
        return type;
    }


    public boolean hasBeenAsigned(PassagerType passagerType){
        if(!disponible){
            return false;
        }
        if(type != passagerType) {
            return false;
        }
        disponible = false;
        return true;
    }
}
