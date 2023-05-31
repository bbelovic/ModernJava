package ocp.exam.ch7;

public sealed class Element permits Fire, Wind, Air, Element.Rock {
    final class Rock extends Element {}
}

non-sealed class Air extends Element {}

final class Wind extends Element {}

