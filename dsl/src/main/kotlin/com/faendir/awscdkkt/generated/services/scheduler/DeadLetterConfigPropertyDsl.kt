package com.faendir.awscdkkt.generated.services.scheduler

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public fun buildDeadLetterConfigProperty(initializer: @AwsCdkDsl
    CfnSchedule.DeadLetterConfigProperty.Builder.() -> Unit = {}):
    CfnSchedule.DeadLetterConfigProperty =
    CfnSchedule.DeadLetterConfigProperty.Builder().apply(initializer).build()
