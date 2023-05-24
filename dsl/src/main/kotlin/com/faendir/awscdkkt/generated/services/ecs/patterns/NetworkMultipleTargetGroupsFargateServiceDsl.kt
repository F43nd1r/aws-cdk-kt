package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateService
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsFargateServiceProps
import software.constructs.Construct

@Generated
public fun Construct.networkMultipleTargetGroupsFargateService(id: String,
    props: NetworkMultipleTargetGroupsFargateServiceProps):
    NetworkMultipleTargetGroupsFargateService = NetworkMultipleTargetGroupsFargateService(this, id,
    props)

@Generated
public fun Construct.networkMultipleTargetGroupsFargateService(
  id: String,
  props: NetworkMultipleTargetGroupsFargateServiceProps,
  initializer: @AwsCdkDsl NetworkMultipleTargetGroupsFargateService.() -> Unit,
): NetworkMultipleTargetGroupsFargateService = NetworkMultipleTargetGroupsFargateService(this, id,
    props).apply(initializer)

@Generated
public fun Construct.networkMultipleTargetGroupsFargateService(id: String):
    NetworkMultipleTargetGroupsFargateService = NetworkMultipleTargetGroupsFargateService(this, id)

@Generated
public fun Construct.networkMultipleTargetGroupsFargateService(id: String, initializer: @AwsCdkDsl
    NetworkMultipleTargetGroupsFargateService.() -> Unit): NetworkMultipleTargetGroupsFargateService
    = NetworkMultipleTargetGroupsFargateService(this, id).apply(initializer)

@Generated
public fun Construct.buildNetworkMultipleTargetGroupsFargateService(id: String,
    initializer: @AwsCdkDsl NetworkMultipleTargetGroupsFargateService.Builder.() -> Unit):
    NetworkMultipleTargetGroupsFargateService =
    NetworkMultipleTargetGroupsFargateService.Builder.create(this, id).apply(initializer).build()
