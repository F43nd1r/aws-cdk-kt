@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.location

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnTrackerConsumer
import software.amazon.awscdk.services.location.CfnTrackerConsumerProps
import software.constructs.Construct

public fun Construct.cfnTrackerConsumer(
  id: String,
  props: CfnTrackerConsumerProps,
  initializer: CfnTrackerConsumer.() -> Unit = {},
): CfnTrackerConsumer = CfnTrackerConsumer(this, id, props).apply(initializer)
