package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService

@Generated
public
    fun serviceConnectClientAliasProperty(initializer: CfnService.ServiceConnectClientAliasProperty.Builder.() -> Unit
    = {}): CfnService.ServiceConnectClientAliasProperty =
    CfnService.ServiceConnectClientAliasProperty.builder().apply(initializer).build()
