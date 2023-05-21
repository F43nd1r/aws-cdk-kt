package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.StateMachineProps

@Generated
public fun stateMachineProps(initializer: StateMachineProps.Builder.() -> Unit = {}):
    StateMachineProps = StateMachineProps.builder().apply(initializer).build()
