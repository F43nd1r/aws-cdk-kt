@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2Service
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2ServiceProps
import software.constructs.Construct

public fun Construct.applicationLoadBalancedEc2Service(id: String,
    initializer: ApplicationLoadBalancedEc2Service.() -> Unit = {}):
    ApplicationLoadBalancedEc2Service = ApplicationLoadBalancedEc2Service(this,
    id).apply(initializer)

public fun Construct.applicationLoadBalancedEc2Service(
  id: String,
  props: ApplicationLoadBalancedEc2ServiceProps,
  initializer: ApplicationLoadBalancedEc2Service.() -> Unit = {},
): ApplicationLoadBalancedEc2Service = ApplicationLoadBalancedEc2Service(this, id,
    props).apply(initializer)
