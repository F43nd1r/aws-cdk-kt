@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
