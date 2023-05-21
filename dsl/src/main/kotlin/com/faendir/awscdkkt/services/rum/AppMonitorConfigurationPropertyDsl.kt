package com.faendir.awscdkkt.services.rum

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rum.CfnAppMonitor

@Generated
public
    fun appMonitorConfigurationProperty(initializer: CfnAppMonitor.AppMonitorConfigurationProperty.Builder.() -> Unit
    = {}): CfnAppMonitor.AppMonitorConfigurationProperty =
    CfnAppMonitor.AppMonitorConfigurationProperty.builder().apply(initializer).build()
