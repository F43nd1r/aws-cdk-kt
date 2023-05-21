package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

@Generated
public
    fun logDestinationProperty(initializer: CfnStateMachine.LogDestinationProperty.Builder.() -> Unit
    = {}): CfnStateMachine.LogDestinationProperty =
    CfnStateMachine.LogDestinationProperty.builder().apply(initializer).build()
