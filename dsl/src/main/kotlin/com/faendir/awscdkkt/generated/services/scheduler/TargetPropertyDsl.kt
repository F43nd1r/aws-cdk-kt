package com.faendir.awscdkkt.generated.services.scheduler

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public fun buildTargetProperty(initializer: @AwsCdkDsl CfnSchedule.TargetProperty.Builder.() -> Unit
    = {}): CfnSchedule.TargetProperty =
    CfnSchedule.TargetProperty.Builder().apply(initializer).build()
