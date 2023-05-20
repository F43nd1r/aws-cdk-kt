@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnWarmPool
import software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps
import software.constructs.Construct

public fun Construct.cfnWarmPool(
  id: String,
  props: CfnWarmPoolProps,
  initializer: CfnWarmPool.() -> Unit = {},
): CfnWarmPool = CfnWarmPool(this, id, props).apply(initializer)
