package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public fun sqsParametersProperty(initializer: CfnSchedule.SqsParametersProperty.Builder.() -> Unit =
    {}): CfnSchedule.SqsParametersProperty =
    CfnSchedule.SqsParametersProperty.builder().apply(initializer).build()
