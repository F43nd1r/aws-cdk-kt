package com.faendir.awscdkkt.generated.services.budgets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudgetsAction
import software.amazon.awscdk.services.budgets.CfnBudgetsActionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBudgetsAction(id: String, props: CfnBudgetsActionProps): CfnBudgetsAction =
    CfnBudgetsAction(this, id, props)

@Generated
public fun Construct.cfnBudgetsAction(
  id: String,
  props: CfnBudgetsActionProps,
  initializer: @AwsCdkDsl CfnBudgetsAction.() -> Unit,
): CfnBudgetsAction = CfnBudgetsAction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBudgetsAction(id: String, initializer: @AwsCdkDsl
    CfnBudgetsAction.Builder.() -> Unit): CfnBudgetsAction = CfnBudgetsAction.Builder.create(this,
    id).apply(initializer).build()
