package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps
import software.constructs.Construct

@Generated
public fun Construct.queueProcessingFargateService(id: String,
    props: QueueProcessingFargateServiceProps): QueueProcessingFargateService =
    QueueProcessingFargateService(this, id, props)

@Generated
public fun Construct.queueProcessingFargateService(
  id: String,
  props: QueueProcessingFargateServiceProps,
  initializer: @AwsCdkDsl QueueProcessingFargateService.() -> Unit,
): QueueProcessingFargateService = QueueProcessingFargateService(this, id, props).apply(initializer)

@Generated
public fun Construct.buildQueueProcessingFargateService(id: String, initializer: @AwsCdkDsl
    QueueProcessingFargateService.Builder.() -> Unit): QueueProcessingFargateService =
    QueueProcessingFargateService.Builder.create(this, id).apply(initializer).build()
