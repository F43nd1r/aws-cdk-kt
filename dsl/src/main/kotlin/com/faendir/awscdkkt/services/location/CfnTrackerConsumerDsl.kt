package com.faendir.awscdkkt.services.location

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnTrackerConsumer
import software.amazon.awscdk.services.location.CfnTrackerConsumerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrackerConsumer(
  id: String,
  props: CfnTrackerConsumerProps,
  initializer: CfnTrackerConsumer.() -> Unit = {},
): CfnTrackerConsumer = CfnTrackerConsumer(this, id, props).apply(initializer)
