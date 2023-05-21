package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FargateServiceProps

@Generated
public fun fargateServiceProps(initializer: FargateServiceProps.Builder.() -> Unit = {}):
    FargateServiceProps = FargateServiceProps.builder().apply(initializer).build()
