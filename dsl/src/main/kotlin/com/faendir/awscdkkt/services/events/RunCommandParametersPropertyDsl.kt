package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public
    fun runCommandParametersProperty(initializer: CfnRule.RunCommandParametersProperty.Builder.() -> Unit
    = {}): CfnRule.RunCommandParametersProperty =
    CfnRule.RunCommandParametersProperty.builder().apply(initializer).build()
