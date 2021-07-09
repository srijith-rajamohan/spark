package org.apache.spark.ml.tuning;
public  class RandomRanges {
  static public  class DoubleGenerator$ extends org.apache.spark.ml.tuning.Generator<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DoubleGenerator$ MODULE$ = null;
    public   DoubleGenerator$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.tuning.RandomT<java.lang.Object> apply (org.apache.spark.ml.tuning.Limits<java.lang.Object> limits)  { throw new RuntimeException(); }
  }
  static public  class FloatGenerator$ extends org.apache.spark.ml.tuning.Generator<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FloatGenerator$ MODULE$ = null;
    public   FloatGenerator$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.tuning.RandomT<java.lang.Object> apply (org.apache.spark.ml.tuning.Limits<java.lang.Object> limits)  { throw new RuntimeException(); }
  }
  static public  class IntGenerator$ extends org.apache.spark.ml.tuning.Generator<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IntGenerator$ MODULE$ = null;
    public   IntGenerator$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.tuning.RandomT<java.lang.Object> apply (org.apache.spark.ml.tuning.Limits<java.lang.Object> limits)  { throw new RuntimeException(); }
  }
  static   scala.math.BigInt randomBigInt0To (scala.math.BigInt x)  { throw new RuntimeException(); }
  static   scala.math.BigInt bigIntBetween (scala.math.BigInt lower, scala.math.BigInt upper)  { throw new RuntimeException(); }
  static   double logN (double x, int base)  { throw new RuntimeException(); }
  static   double randomLog (double lower, double upper, int n)  { throw new RuntimeException(); }
  static  <T extends java.lang.Object> org.apache.spark.ml.tuning.RandomT<T> apply (org.apache.spark.ml.tuning.Limits<T> lim, org.apache.spark.ml.tuning.Generator<T> evidence$4, org.apache.spark.ml.tuning.Generator<T> t)  { throw new RuntimeException(); }
}
