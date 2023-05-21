package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

@Generated
public
    fun logDestinationProperty(initializer: CfnStateMachine.LogDestinationProperty.Builder.() -> Unit
    = {}): CfnStateMachine.LogDestinationProperty =
    CfnStateMachine.LogDestinationProperty.builder().apply(initializer).build()
