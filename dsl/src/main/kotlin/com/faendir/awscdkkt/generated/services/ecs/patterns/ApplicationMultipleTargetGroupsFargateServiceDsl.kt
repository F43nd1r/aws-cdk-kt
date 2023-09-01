package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps
import software.constructs.Construct

@Generated
public fun Construct.applicationMultipleTargetGroupsFargateService(id: String,
    initializer: @AwsCdkDsl ApplicationMultipleTargetGroupsFargateService.() -> Unit = {}):
    ApplicationMultipleTargetGroupsFargateService =
    ApplicationMultipleTargetGroupsFargateService(this, id).apply(initializer)

@Generated
public fun Construct.applicationMultipleTargetGroupsFargateService(
  id: String,
  props: ApplicationMultipleTargetGroupsFargateServiceProps,
  initializer: @AwsCdkDsl ApplicationMultipleTargetGroupsFargateService.() -> Unit = {},
): ApplicationMultipleTargetGroupsFargateService =
    ApplicationMultipleTargetGroupsFargateService(this, id, props).apply(initializer)

@Generated
public fun Construct.buildApplicationMultipleTargetGroupsFargateService(id: String,
    initializer: @AwsCdkDsl ApplicationMultipleTargetGroupsFargateService.Builder.() -> Unit = {}):
    ApplicationMultipleTargetGroupsFargateService =
    ApplicationMultipleTargetGroupsFargateService.Builder.create(this,
    id).apply(initializer).build()
