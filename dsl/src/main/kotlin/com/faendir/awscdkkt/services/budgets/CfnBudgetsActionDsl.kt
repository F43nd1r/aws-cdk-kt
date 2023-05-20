@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudgetsAction
import software.amazon.awscdk.services.budgets.CfnBudgetsActionProps
import software.constructs.Construct

public fun Construct.cfnBudgetsAction(
  id: String,
  props: CfnBudgetsActionProps,
  initializer: CfnBudgetsAction.() -> Unit = {},
): CfnBudgetsAction = CfnBudgetsAction(this, id, props).apply(initializer)
