package org.apache.spark.sql.catalyst.expressions;
/**
 * A utility class that converts public connector expressions into Catalyst expressions.
 */
public  class V2ExpressionUtils {
  static public <T extends org.apache.spark.sql.catalyst.expressions.NamedExpression> T resolveRef (org.apache.spark.sql.connector.expressions.NamedReference ref, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static public <T extends org.apache.spark.sql.catalyst.expressions.NamedExpression> scala.collection.Seq<T> resolveRefs (scala.collection.Seq<org.apache.spark.sql.connector.expressions.NamedReference> refs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Expression toCatalyst (org.apache.spark.sql.connector.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
}
