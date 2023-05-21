package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnWaitCondition
import software.amazon.awscdk.CfnWaitConditionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWaitCondition(id: String, initializer: CfnWaitCondition.() -> Unit = {}):
    CfnWaitCondition = CfnWaitCondition(this, id).apply(initializer)

@Generated
public fun Construct.cfnWaitCondition(
  id: String,
  props: CfnWaitConditionProps,
  initializer: CfnWaitCondition.() -> Unit = {},
): CfnWaitCondition = CfnWaitCondition(this, id, props).apply(initializer)
