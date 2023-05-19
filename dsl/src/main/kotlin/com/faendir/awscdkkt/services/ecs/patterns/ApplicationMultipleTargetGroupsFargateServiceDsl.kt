@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateService
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps
import software.constructs.Construct

public fun Construct.applicationMultipleTargetGroupsFargateService(id: String,
    initializer: ApplicationMultipleTargetGroupsFargateService.() -> Unit = {}):
    ApplicationMultipleTargetGroupsFargateService =
    ApplicationMultipleTargetGroupsFargateService(this, id).apply(initializer)

public fun Construct.applicationMultipleTargetGroupsFargateService(
  id: String,
  props: ApplicationMultipleTargetGroupsFargateServiceProps,
  initializer: ApplicationMultipleTargetGroupsFargateService.() -> Unit = {},
): ApplicationMultipleTargetGroupsFargateService =
    ApplicationMultipleTargetGroupsFargateService(this, id, props).apply(initializer)
