package org.apache.spark.sql.catalyst.optimizer;
/**
 * This rule runs in the normal optimizer and optimizes more cases
 * compared to {@link PropagateEmptyRelationBase}:
 * 1. Higher-node Logical Plans
 *    - Union with all empty children.
 * 2. Unary-node Logical Plans
 *    - Project/Filter/Sample with all empty children.
 * <p>
 * The reason why we don't apply this rule at AQE optimizer side is: the benefit is not big enough
 * and it may introduce extra exchanges.
 */
public  class PropagateEmptyRelation$ extends org.apache.spark.sql.catalyst.optimizer.PropagateEmptyRelationBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PropagateEmptyRelation$ MODULE$ = null;
  public   PropagateEmptyRelation$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
