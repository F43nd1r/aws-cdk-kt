package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions

@Generated
public fun buildApplicationLoadBalancedTaskImageOptions(initializer: @AwsCdkDsl
    ApplicationLoadBalancedTaskImageOptions.Builder.() -> Unit):
    ApplicationLoadBalancedTaskImageOptions =
    ApplicationLoadBalancedTaskImageOptions.Builder().apply(initializer).build()
