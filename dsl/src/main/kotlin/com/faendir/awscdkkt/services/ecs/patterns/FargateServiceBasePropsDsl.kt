package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.FargateServiceBaseProps

@Generated
public fun fargateServiceBaseProps(initializer: FargateServiceBaseProps.Builder.() -> Unit = {}):
    FargateServiceBaseProps = FargateServiceBaseProps.builder().apply(initializer).build()
