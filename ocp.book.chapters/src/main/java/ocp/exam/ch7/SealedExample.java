package ocp.exam.ch7;

public class SealedExample {

}

sealed class Water {
    final class Lake extends Water {}
}

non-sealed class Ocean extends Water {}
final class Sea extends Water {}

