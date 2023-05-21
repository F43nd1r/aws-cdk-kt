package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.SfnStateMachineProps

@Generated
public fun sfnStateMachineProps(initializer: SfnStateMachineProps.Builder.() -> Unit = {}):
    SfnStateMachineProps = SfnStateMachineProps.builder().apply(initializer).build()
