package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnService

@Generated
public
    fun instanceConfigurationProperty(initializer: CfnService.InstanceConfigurationProperty.Builder.() -> Unit
    = {}): CfnService.InstanceConfigurationProperty =
    CfnService.InstanceConfigurationProperty.builder().apply(initializer).build()
