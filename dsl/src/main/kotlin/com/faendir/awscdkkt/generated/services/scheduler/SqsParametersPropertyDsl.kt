package com.faendir.awscdkkt.generated.services.scheduler

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public fun buildSqsParametersProperty(initializer: @AwsCdkDsl
    CfnSchedule.SqsParametersProperty.Builder.() -> Unit = {}): CfnSchedule.SqsParametersProperty =
    CfnSchedule.SqsParametersProperty.Builder().apply(initializer).build()
