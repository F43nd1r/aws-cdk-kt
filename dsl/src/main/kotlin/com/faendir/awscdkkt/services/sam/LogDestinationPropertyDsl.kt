@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

public
    fun logDestinationProperty(initializer: CfnStateMachine.LogDestinationProperty.Builder.() -> Unit):
    CfnStateMachine.LogDestinationProperty =
    CfnStateMachine.LogDestinationProperty.builder().apply(initializer).build()
