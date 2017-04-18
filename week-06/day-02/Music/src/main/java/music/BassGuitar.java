package main.java.music;

public class BassGuitar extends StringedInstrument {
  
  public BassGuitar() {
    this(4);
  }
  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings, "Duum-duum-duum", "Bass Guitar");
  }
}
