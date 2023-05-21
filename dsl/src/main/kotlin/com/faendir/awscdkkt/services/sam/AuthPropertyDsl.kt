package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun authProperty(initializer: CfnFunction.AuthProperty.Builder.() -> Unit = {}):
    CfnFunction.AuthProperty = CfnFunction.AuthProperty.builder().apply(initializer).build()
