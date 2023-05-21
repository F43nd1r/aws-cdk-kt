package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget

@Generated
public
    fun scheduledActionProperty(initializer: CfnScalableTarget.ScheduledActionProperty.Builder.() -> Unit
    = {}): CfnScalableTarget.ScheduledActionProperty =
    CfnScalableTarget.ScheduledActionProperty.builder().apply(initializer).build()
