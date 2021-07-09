package org.apache.spark.sql.catalyst.plans.logical;
public  interface AlterTableCommand extends org.apache.spark.sql.catalyst.plans.logical.UnaryCommand {
  public  scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableChange> changes ()  ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  ;
  public  java.lang.String operation ()  ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan table ()  ;
}
