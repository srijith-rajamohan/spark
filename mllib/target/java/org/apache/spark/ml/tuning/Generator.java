package org.apache.spark.ml.tuning;
public abstract class Generator<T extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   Generator (scala.math.Numeric<T> evidence$3)  { throw new RuntimeException(); }
  public abstract  org.apache.spark.ml.tuning.RandomT<T> apply (org.apache.spark.ml.tuning.Limits<T> lim)  ;
}
