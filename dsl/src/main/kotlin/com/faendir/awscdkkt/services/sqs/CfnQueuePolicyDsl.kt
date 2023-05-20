@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sqs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sqs.CfnQueuePolicy
import software.amazon.awscdk.services.sqs.CfnQueuePolicyProps
import software.constructs.Construct

public fun Construct.cfnQueuePolicy(
  id: String,
  props: CfnQueuePolicyProps,
  initializer: CfnQueuePolicy.() -> Unit = {},
): CfnQueuePolicy = CfnQueuePolicy(this, id, props).apply(initializer)
