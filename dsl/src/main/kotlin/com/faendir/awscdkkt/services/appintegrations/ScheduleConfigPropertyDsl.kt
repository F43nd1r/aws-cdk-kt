package com.faendir.awscdkkt.services.appintegrations

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration

@Generated
public
    fun scheduleConfigProperty(initializer: CfnDataIntegration.ScheduleConfigProperty.Builder.() -> Unit
    = {}): CfnDataIntegration.ScheduleConfigProperty =
    CfnDataIntegration.ScheduleConfigProperty.builder().apply(initializer).build()
