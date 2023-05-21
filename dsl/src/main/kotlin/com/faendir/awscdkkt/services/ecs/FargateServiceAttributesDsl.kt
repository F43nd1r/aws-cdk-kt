package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FargateServiceAttributes

@Generated
public fun fargateServiceAttributes(initializer: FargateServiceAttributes.Builder.() -> Unit = {}):
    FargateServiceAttributes = FargateServiceAttributes.builder().apply(initializer).build()
