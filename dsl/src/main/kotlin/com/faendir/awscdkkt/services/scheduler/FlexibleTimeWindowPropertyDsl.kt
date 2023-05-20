@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

public
    fun flexibleTimeWindowProperty(initializer: CfnSchedule.FlexibleTimeWindowProperty.Builder.() -> Unit):
    CfnSchedule.FlexibleTimeWindowProperty =
    CfnSchedule.FlexibleTimeWindowProperty.builder().apply(initializer).build()
