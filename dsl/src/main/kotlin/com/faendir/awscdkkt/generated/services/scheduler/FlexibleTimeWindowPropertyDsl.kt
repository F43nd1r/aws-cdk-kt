package com.faendir.awscdkkt.generated.services.scheduler

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public fun buildFlexibleTimeWindowProperty(initializer: @AwsCdkDsl
    CfnSchedule.FlexibleTimeWindowProperty.Builder.() -> Unit):
    CfnSchedule.FlexibleTimeWindowProperty =
    CfnSchedule.FlexibleTimeWindowProperty.Builder().apply(initializer).build()
