package srp;

public class AssignateurDeSiegeSimple {
  private final VolRepository volRepository;

  public AssignateurDeSiegeSimple(VolRepository volRepository) {
    this.volRepository = volRepository;
  }

  public Siege assigner(int volId, PassagerType passagerType){
    Vol vol = volRepository.findById(volId);
    return vol.assignerSiege(passagerType);
  }
}