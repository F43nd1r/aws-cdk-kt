package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateServiceProps
import software.constructs.Construct

@Generated
public fun Construct.applicationLoadBalancedFargateService(id: String,
    initializer: ApplicationLoadBalancedFargateService.() -> Unit = {}):
    ApplicationLoadBalancedFargateService = ApplicationLoadBalancedFargateService(this,
    id).apply(initializer)

@Generated
public fun Construct.applicationLoadBalancedFargateService(
  id: String,
  props: ApplicationLoadBalancedFargateServiceProps,
  initializer: ApplicationLoadBalancedFargateService.() -> Unit = {},
): ApplicationLoadBalancedFargateService = ApplicationLoadBalancedFargateService(this, id,
    props).apply(initializer)
