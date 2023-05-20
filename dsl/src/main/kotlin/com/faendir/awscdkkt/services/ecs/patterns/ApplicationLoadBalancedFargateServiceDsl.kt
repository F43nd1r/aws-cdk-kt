@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateServiceProps
import software.constructs.Construct

public fun Construct.applicationLoadBalancedFargateService(id: String,
    initializer: ApplicationLoadBalancedFargateService.() -> Unit = {}):
    ApplicationLoadBalancedFargateService = ApplicationLoadBalancedFargateService(this,
    id).apply(initializer)

public fun Construct.applicationLoadBalancedFargateService(
  id: String,
  props: ApplicationLoadBalancedFargateServiceProps,
  initializer: ApplicationLoadBalancedFargateService.() -> Unit = {},
): ApplicationLoadBalancedFargateService = ApplicationLoadBalancedFargateService(this, id,
    props).apply(initializer)
