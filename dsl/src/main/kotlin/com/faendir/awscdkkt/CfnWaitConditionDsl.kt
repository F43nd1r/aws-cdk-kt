@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnWaitCondition
import software.amazon.awscdk.CfnWaitConditionProps
import software.constructs.Construct

public fun Construct.cfnWaitCondition(
  id: String,
  props: CfnWaitConditionProps,
  initializer: CfnWaitCondition.() -> Unit = {},
): CfnWaitCondition = CfnWaitCondition(this, id, props).apply(initializer)

public fun Construct.cfnWaitCondition(id: String, initializer: CfnWaitCondition.() -> Unit = {}):
    CfnWaitCondition = CfnWaitCondition(this, id).apply(initializer)
