package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudgetsAction
import software.amazon.awscdk.services.budgets.CfnBudgetsActionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBudgetsAction(
  id: String,
  props: CfnBudgetsActionProps,
  initializer: CfnBudgetsAction.() -> Unit = {},
): CfnBudgetsAction = CfnBudgetsAction(this, id, props).apply(initializer)
