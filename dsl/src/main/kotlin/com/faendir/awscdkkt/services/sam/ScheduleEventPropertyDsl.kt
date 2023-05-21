package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

@Generated
public
    fun scheduleEventProperty(initializer: CfnStateMachine.ScheduleEventProperty.Builder.() -> Unit
    = {}): CfnStateMachine.ScheduleEventProperty =
    CfnStateMachine.ScheduleEventProperty.builder().apply(initializer).build()
