package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

@Generated
public fun buildScheduleEventProperty(initializer: @AwsCdkDsl
    CfnStateMachine.ScheduleEventProperty.Builder.() -> Unit = {}):
    CfnStateMachine.ScheduleEventProperty =
    CfnStateMachine.ScheduleEventProperty.Builder().apply(initializer).build()
