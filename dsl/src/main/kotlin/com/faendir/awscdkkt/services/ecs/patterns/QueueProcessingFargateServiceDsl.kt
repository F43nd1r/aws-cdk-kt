@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps
import software.constructs.Construct

public fun Construct.queueProcessingFargateService(
  id: String,
  props: QueueProcessingFargateServiceProps,
  initializer: QueueProcessingFargateService.() -> Unit = {},
): QueueProcessingFargateService = QueueProcessingFargateService(this, id, props).apply(initializer)
