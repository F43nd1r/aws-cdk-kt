package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnCondition
import software.amazon.awscdk.CfnConditionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCondition(id: String, initializer: CfnCondition.() -> Unit = {}):
    CfnCondition = CfnCondition(this, id).apply(initializer)

@Generated
public fun Construct.cfnCondition(
  id: String,
  props: CfnConditionProps,
  initializer: CfnCondition.() -> Unit = {},
): CfnCondition = CfnCondition(this, id, props).apply(initializer)
