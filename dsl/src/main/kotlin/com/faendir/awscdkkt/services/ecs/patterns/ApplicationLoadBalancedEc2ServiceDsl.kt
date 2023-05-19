@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
