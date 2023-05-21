package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps
import software.constructs.Construct

@Generated
public fun Construct.queueProcessingFargateService(
  id: String,
  props: QueueProcessingFargateServiceProps,
  initializer: QueueProcessingFargateService.() -> Unit = {},
): QueueProcessingFargateService = QueueProcessingFargateService(this, id, props).apply(initializer)
