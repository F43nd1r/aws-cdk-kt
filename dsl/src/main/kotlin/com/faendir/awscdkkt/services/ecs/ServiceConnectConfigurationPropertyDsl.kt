package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService

@Generated
public
    fun serviceConnectConfigurationProperty(initializer: CfnService.ServiceConnectConfigurationProperty.Builder.() -> Unit
    = {}): CfnService.ServiceConnectConfigurationProperty =
    CfnService.ServiceConnectConfigurationProperty.builder().apply(initializer).build()
