package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

@Generated
public
    fun cloudWatchLogsLogGroupProperty(initializer: CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder.() -> Unit
    = {}): CfnStateMachine.CloudWatchLogsLogGroupProperty =
    CfnStateMachine.CloudWatchLogsLogGroupProperty.builder().apply(initializer).build()
