package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

@Generated
public fun apiEventProperty(initializer: CfnStateMachine.ApiEventProperty.Builder.() -> Unit = {}):
    CfnStateMachine.ApiEventProperty =
    CfnStateMachine.ApiEventProperty.builder().apply(initializer).build()
