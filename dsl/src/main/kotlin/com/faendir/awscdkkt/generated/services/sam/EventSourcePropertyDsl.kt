package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

@Generated
public fun buildEventSourceProperty(initializer: @AwsCdkDsl
    CfnStateMachine.EventSourceProperty.Builder.() -> Unit): CfnStateMachine.EventSourceProperty =
    CfnStateMachine.EventSourceProperty.Builder().apply(initializer).build()
