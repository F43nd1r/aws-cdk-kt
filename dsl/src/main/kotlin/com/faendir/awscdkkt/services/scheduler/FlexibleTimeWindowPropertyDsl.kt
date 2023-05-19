@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

public
    fun flexibleTimeWindowProperty(initializer: CfnSchedule.FlexibleTimeWindowProperty.Builder.() -> Unit):
    CfnSchedule.FlexibleTimeWindowProperty =
    CfnSchedule.FlexibleTimeWindowProperty.builder().apply(initializer).build()
