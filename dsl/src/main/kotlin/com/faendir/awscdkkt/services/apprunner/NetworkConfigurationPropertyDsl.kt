package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnService

@Generated
public
    fun networkConfigurationProperty(initializer: CfnService.NetworkConfigurationProperty.Builder.() -> Unit
    = {}): CfnService.NetworkConfigurationProperty =
    CfnService.NetworkConfigurationProperty.builder().apply(initializer).build()
