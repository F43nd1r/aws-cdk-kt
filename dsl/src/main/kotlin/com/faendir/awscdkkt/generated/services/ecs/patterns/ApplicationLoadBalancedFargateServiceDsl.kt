package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateService
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedFargateServiceProps
import software.constructs.Construct

@Generated
public fun Construct.applicationLoadBalancedFargateService(id: String, initializer: @AwsCdkDsl
    ApplicationLoadBalancedFargateService.() -> Unit = {}): ApplicationLoadBalancedFargateService =
    ApplicationLoadBalancedFargateService(this, id).apply(initializer)

@Generated
public fun Construct.applicationLoadBalancedFargateService(
  id: String,
  props: ApplicationLoadBalancedFargateServiceProps,
  initializer: @AwsCdkDsl ApplicationLoadBalancedFargateService.() -> Unit = {},
): ApplicationLoadBalancedFargateService = ApplicationLoadBalancedFargateService(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildApplicationLoadBalancedFargateService(id: String, initializer: @AwsCdkDsl
    ApplicationLoadBalancedFargateService.Builder.() -> Unit = {}):
    ApplicationLoadBalancedFargateService =
    ApplicationLoadBalancedFargateService.Builder.create(this, id).apply(initializer).build()
