package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedEc2ServiceProps

@Generated
public fun buildApplicationLoadBalancedEc2ServiceProps(initializer: @AwsCdkDsl
    ApplicationLoadBalancedEc2ServiceProps.Builder.() -> Unit = {}):
    ApplicationLoadBalancedEc2ServiceProps =
    ApplicationLoadBalancedEc2ServiceProps.Builder().apply(initializer).build()
