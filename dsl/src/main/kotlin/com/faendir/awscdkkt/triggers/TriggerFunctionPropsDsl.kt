package com.faendir.awscdkkt.triggers

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.triggers.TriggerFunctionProps

@Generated
public fun triggerFunctionProps(initializer: TriggerFunctionProps.Builder.() -> Unit = {}):
    TriggerFunctionProps = TriggerFunctionProps.builder().apply(initializer).build()
