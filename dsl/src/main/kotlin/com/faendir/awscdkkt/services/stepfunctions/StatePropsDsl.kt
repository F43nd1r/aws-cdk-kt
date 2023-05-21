package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.StateProps

@Generated
public fun stateProps(initializer: StateProps.Builder.() -> Unit = {}): StateProps =
    StateProps.builder().apply(initializer).build()
