package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.SfnStateMachine
import software.amazon.awscdk.services.stepfunctions.IStateMachine

@Generated
public fun buildSfnStateMachine(machine: IStateMachine, initializer: @AwsCdkDsl
    SfnStateMachine.Builder.() -> Unit): SfnStateMachine =
    SfnStateMachine.Builder.create(machine).apply(initializer).build()
