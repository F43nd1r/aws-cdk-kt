package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2ServiceProps
import software.constructs.Construct

@Generated
public fun Construct.queueProcessingEc2Service(
  id: String,
  props: QueueProcessingEc2ServiceProps,
  initializer: QueueProcessingEc2Service.() -> Unit = {},
): QueueProcessingEc2Service = QueueProcessingEc2Service(this, id, props).apply(initializer)
