@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget

public
    fun scheduledActionProperty(initializer: CfnScalableTarget.ScheduledActionProperty.Builder.() -> Unit):
    CfnScalableTarget.ScheduledActionProperty =
    CfnScalableTarget.ScheduledActionProperty.builder().apply(initializer).build()
