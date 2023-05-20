@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget
import software.amazon.awscdk.services.budgets.CfnBudgetProps
import software.constructs.Construct

public fun Construct.cfnBudget(
  id: String,
  props: CfnBudgetProps,
  initializer: CfnBudget.() -> Unit = {},
): CfnBudget = CfnBudget(this, id, props).apply(initializer)
