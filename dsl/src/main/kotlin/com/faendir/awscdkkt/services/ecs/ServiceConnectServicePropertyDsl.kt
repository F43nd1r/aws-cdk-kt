package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService

@Generated
public
    fun serviceConnectServiceProperty(initializer: CfnService.ServiceConnectServiceProperty.Builder.() -> Unit
    = {}): CfnService.ServiceConnectServiceProperty =
    CfnService.ServiceConnectServiceProperty.builder().apply(initializer).build()
