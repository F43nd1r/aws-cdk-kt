package com.faendir.awscdkkt.generated.services.deadline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.deadline.CfnBudget
import software.amazon.awscdk.services.deadline.CfnBudgetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBudget(
  id: String,
  props: CfnBudgetProps,
  initializer: @AwsCdkDsl CfnBudget.() -> Unit = {},
): CfnBudget = CfnBudget(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBudget(id: String, initializer: @AwsCdkDsl CfnBudget.Builder.() -> Unit = {}): CfnBudget = CfnBudget.Builder.create(this, id).apply(initializer).build()
