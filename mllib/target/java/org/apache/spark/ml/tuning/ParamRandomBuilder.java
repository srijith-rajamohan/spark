package org.apache.spark.ml.tuning;
/**
 * "For any distribution over a sample space with a finite maximum, the maximum of 60 random
 * observations lies within the top 5% of the true maximum, with 95% probability"
 * - Evaluating Machine Learning Models by Alice Zheng
 * https://www.oreilly.com/library/view/evaluating-machine-learning/9781492048756/ch04.html
 * <p>
 * Note: if you want more sophisticated hyperparameter tuning, consider Python libraries
 * such as Hyperopt.
 */
public  class ParamRandomBuilder extends org.apache.spark.ml.tuning.ParamGridBuilder {
  public   ParamRandomBuilder ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.ml.tuning.ParamRandomBuilder addLog10Random (org.apache.spark.ml.param.Param<T> param, org.apache.spark.ml.tuning.Limits<T> lim, int n, org.apache.spark.ml.tuning.Generator<T> evidence$6)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.ParamRandomBuilder addLog10Random (org.apache.spark.ml.param.DoubleParam param, double x, double y, int n)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.ParamRandomBuilder addLog10Random (org.apache.spark.ml.param.FloatParam param, float x, float y, int n)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.ParamRandomBuilder addLog10Random (org.apache.spark.ml.param.IntParam param, int x, int y, int n)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.ml.tuning.ParamRandomBuilder addRandom (org.apache.spark.ml.param.Param<T> param, org.apache.spark.ml.tuning.Limits<T> lim, int n, org.apache.spark.ml.tuning.Generator<T> evidence$5)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.ParamRandomBuilder addRandom (org.apache.spark.ml.param.DoubleParam param, double x, double y, int n)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.ParamRandomBuilder addRandom (org.apache.spark.ml.param.FloatParam param, float x, float y, int n)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.ParamRandomBuilder addRandom (org.apache.spark.ml.param.IntParam param, int x, int y, int n)  { throw new RuntimeException(); }
}
