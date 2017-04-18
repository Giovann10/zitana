package main.java.music;

public abstract class StringedInstrument extends Instrument {
  private int numberOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";
  private String sound;
  
  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }
  
  public StringedInstrument(int numberOfStrings, String sound, String name) {
    this.numberOfStrings = numberOfStrings;
    this.sound = sound;
    this.name = name;
  }
}
