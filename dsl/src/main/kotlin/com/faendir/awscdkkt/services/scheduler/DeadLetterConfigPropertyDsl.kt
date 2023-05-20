@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

public
    fun deadLetterConfigProperty(initializer: CfnSchedule.DeadLetterConfigProperty.Builder.() -> Unit):
    CfnSchedule.DeadLetterConfigProperty =
    CfnSchedule.DeadLetterConfigProperty.builder().apply(initializer).build()
