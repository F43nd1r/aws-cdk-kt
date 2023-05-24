package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2ServiceProps
import software.constructs.Construct

@Generated
public fun Construct.applicationLoadBalancedEc2Service(id: String):
    ApplicationLoadBalancedEc2Service = ApplicationLoadBalancedEc2Service(this, id)

@Generated
public fun Construct.applicationLoadBalancedEc2Service(id: String, initializer: @AwsCdkDsl
    ApplicationLoadBalancedEc2Service.() -> Unit): ApplicationLoadBalancedEc2Service =
    ApplicationLoadBalancedEc2Service(this, id).apply(initializer)

@Generated
public fun Construct.applicationLoadBalancedEc2Service(id: String,
    props: ApplicationLoadBalancedEc2ServiceProps): ApplicationLoadBalancedEc2Service =
    ApplicationLoadBalancedEc2Service(this, id, props)

@Generated
public fun Construct.applicationLoadBalancedEc2Service(
  id: String,
  props: ApplicationLoadBalancedEc2ServiceProps,
  initializer: @AwsCdkDsl ApplicationLoadBalancedEc2Service.() -> Unit,
): ApplicationLoadBalancedEc2Service = ApplicationLoadBalancedEc2Service(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildApplicationLoadBalancedEc2Service(id: String, initializer: @AwsCdkDsl
    ApplicationLoadBalancedEc2Service.Builder.() -> Unit): ApplicationLoadBalancedEc2Service =
    ApplicationLoadBalancedEc2Service.Builder.create(this, id).apply(initializer).build()
