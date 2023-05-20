@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

public
    fun scheduleEventProperty(initializer: CfnStateMachine.ScheduleEventProperty.Builder.() -> Unit):
    CfnStateMachine.ScheduleEventProperty =
    CfnStateMachine.ScheduleEventProperty.builder().apply(initializer).build()
