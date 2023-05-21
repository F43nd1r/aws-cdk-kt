package com.faendir.awscdkkt.services.applicationinsights

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationinsights.CfnApplication

@Generated
public
    fun componentMonitoringSettingProperty(initializer: CfnApplication.ComponentMonitoringSettingProperty.Builder.() -> Unit
    = {}): CfnApplication.ComponentMonitoringSettingProperty =
    CfnApplication.ComponentMonitoringSettingProperty.builder().apply(initializer).build()
