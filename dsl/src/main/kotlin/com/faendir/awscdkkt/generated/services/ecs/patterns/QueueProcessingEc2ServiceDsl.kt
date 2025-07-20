package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2ServiceProps
import software.constructs.Construct

@Generated
public fun Construct.queueProcessingEc2Service(id: String, initializer: @AwsCdkDsl QueueProcessingEc2Service.() -> Unit = {}): QueueProcessingEc2Service = QueueProcessingEc2Service(this, id).apply(initializer)

@Generated
public fun Construct.queueProcessingEc2Service(
  id: String,
  props: QueueProcessingEc2ServiceProps,
  initializer: @AwsCdkDsl QueueProcessingEc2Service.() -> Unit = {},
): QueueProcessingEc2Service = QueueProcessingEc2Service(this, id, props).apply(initializer)

@Generated
public fun Construct.buildQueueProcessingEc2Service(id: String, initializer: @AwsCdkDsl QueueProcessingEc2Service.Builder.() -> Unit = {}): QueueProcessingEc2Service = QueueProcessingEc2Service.Builder.create(this, id).apply(initializer).build()
