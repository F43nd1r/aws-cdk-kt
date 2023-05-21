package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

@Generated
public fun eventSourceProperty(initializer: CfnStateMachine.EventSourceProperty.Builder.() -> Unit =
    {}): CfnStateMachine.EventSourceProperty =
    CfnStateMachine.EventSourceProperty.builder().apply(initializer).build()
