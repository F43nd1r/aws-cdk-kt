package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ServiceConnectProps

@Generated
public fun serviceConnectProps(initializer: ServiceConnectProps.Builder.() -> Unit = {}):
    ServiceConnectProps = ServiceConnectProps.builder().apply(initializer).build()
