@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnWaitCondition
import software.amazon.awscdk.services.cloudformation.CfnWaitConditionProps
import software.constructs.Construct

public fun Construct.cfnWaitCondition(
  id: String,
  props: CfnWaitConditionProps,
  initializer: CfnWaitCondition.() -> Unit = {},
): CfnWaitCondition = CfnWaitCondition(this, id, props).apply(initializer)

public fun Construct.cfnWaitCondition(id: String, initializer: CfnWaitCondition.() -> Unit = {}):
    CfnWaitCondition = CfnWaitCondition(this, id).apply(initializer)
