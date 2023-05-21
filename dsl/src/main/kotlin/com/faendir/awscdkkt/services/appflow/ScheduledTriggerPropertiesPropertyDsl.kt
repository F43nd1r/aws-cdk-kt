package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow

@Generated
public
    fun scheduledTriggerPropertiesProperty(initializer: CfnFlow.ScheduledTriggerPropertiesProperty.Builder.() -> Unit
    = {}): CfnFlow.ScheduledTriggerPropertiesProperty =
    CfnFlow.ScheduledTriggerPropertiesProperty.builder().apply(initializer).build()
