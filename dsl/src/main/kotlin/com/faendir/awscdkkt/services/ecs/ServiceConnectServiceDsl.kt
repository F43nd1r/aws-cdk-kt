package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ServiceConnectService

@Generated
public fun serviceConnectService(initializer: ServiceConnectService.Builder.() -> Unit = {}):
    ServiceConnectService = ServiceConnectService.builder().apply(initializer).build()
