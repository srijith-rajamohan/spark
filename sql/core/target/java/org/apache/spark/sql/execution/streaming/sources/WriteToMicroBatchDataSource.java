package org.apache.spark.sql.execution.streaming.sources;
/**
 * The logical plan for writing data to a micro-batch stream.
 * <p>
 * Note that this logical plan does not have a corresponding physical plan, as it will be converted
 * to {@link WriteToDataSourceV2} with {@link MicroBatchWrite} before execution.
 */
public  class WriteToMicroBatchDataSource extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.UnaryNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.ExpressionSet validConstraints ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation> relation ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.streaming.StreamingWrite write ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteToMicroBatchDataSource (scala.Option<org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation> relation, org.apache.spark.sql.connector.write.streaming.StreamingWrite write, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.v2.WriteToDataSourceV2 createPlan (long batchId)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.sources.WriteToMicroBatchDataSource withNewChildInternal (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan newChild)  { throw new RuntimeException(); }
}
