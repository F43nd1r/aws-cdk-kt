package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.PortMapping

@Generated
public fun buildPortMapping(initializer: @AwsCdkDsl PortMapping.Builder.() -> Unit = {}):
    PortMapping = PortMapping.Builder().apply(initializer).build()
