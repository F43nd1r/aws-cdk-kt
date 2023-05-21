package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateServiceProps
import software.constructs.Construct

@Generated
public fun Construct.networkMultipleTargetGroupsFargateService(id: String,
    initializer: NetworkMultipleTargetGroupsFargateService.() -> Unit = {}):
    NetworkMultipleTargetGroupsFargateService = NetworkMultipleTargetGroupsFargateService(this,
    id).apply(initializer)

@Generated
public fun Construct.networkMultipleTargetGroupsFargateService(
  id: String,
  props: NetworkMultipleTargetGroupsFargateServiceProps,
  initializer: NetworkMultipleTargetGroupsFargateService.() -> Unit = {},
): NetworkMultipleTargetGroupsFargateService = NetworkMultipleTargetGroupsFargateService(this, id,
    props).apply(initializer)
