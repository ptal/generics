package ds;

/** Implementation of a video game according to its rating based on different characteristics. */
public class VideoGame {
  private String title;
  /*
   * The following members are characteristics on which is rated the video game.
   * Values should be integers between 0 and 100 included.
   */
  private int atmosphere;
  private int music;
  private int artisticDirection;
  private int graphism;
  private int scenario;
  private int gameplay;

  public VideoGame(
      String title,
      int atmosphere,
      int music,
      int artisticDirection,
      int graphism,
      int scenario,
      int gameplay) {
    checkIsPercentage(atmosphere);
    checkIsPercentage(music);
    checkIsPercentage(artisticDirection);
    checkIsPercentage(graphism);
    checkIsPercentage(scenario);
    checkIsPercentage(gameplay);
    this.title = title;
    this.atmosphere = atmosphere;
    this.music = music;
    this.artisticDirection = artisticDirection;
    this.graphism = graphism;
    this.scenario = scenario;
    this.gameplay = gameplay;
  }

  /*
   * Check if the given value is well between 0 and 100
   */
  private void checkIsPercentage(int x) {
    if (x < 0 || x > 100) {
      throw new NumberFormatException("The value should be between 0 and 100 included");
    }
  }

  public String toString() {
    return title;
  }
}
