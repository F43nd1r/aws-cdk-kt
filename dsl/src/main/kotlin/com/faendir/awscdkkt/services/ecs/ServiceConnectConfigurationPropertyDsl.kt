@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService

public
    fun serviceConnectConfigurationProperty(initializer: CfnService.ServiceConnectConfigurationProperty.Builder.() -> Unit):
    CfnService.ServiceConnectConfigurationProperty =
    CfnService.ServiceConnectConfigurationProperty.builder().apply(initializer).build()
