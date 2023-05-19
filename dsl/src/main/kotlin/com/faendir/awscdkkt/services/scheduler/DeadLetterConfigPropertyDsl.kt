@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

public
    fun deadLetterConfigProperty(initializer: CfnSchedule.DeadLetterConfigProperty.Builder.() -> Unit):
    CfnSchedule.DeadLetterConfigProperty =
    CfnSchedule.DeadLetterConfigProperty.builder().apply(initializer).build()
