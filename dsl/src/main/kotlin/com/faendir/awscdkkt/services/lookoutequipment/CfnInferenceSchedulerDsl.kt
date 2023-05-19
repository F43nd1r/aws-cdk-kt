@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lookoutequipment

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceSchedulerProps
import software.constructs.Construct

public fun Construct.cfnInferenceScheduler(
  id: String,
  props: CfnInferenceSchedulerProps,
  initializer: CfnInferenceScheduler.() -> Unit = {},
): CfnInferenceScheduler = CfnInferenceScheduler(this, id, props).apply(initializer)
