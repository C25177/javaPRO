package VisitorPattern;

public interface Element {
  public void accept(Visitor visitor);
}