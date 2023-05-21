package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun requestParameterProperty(initializer: CfnFunction.RequestParameterProperty.Builder.() -> Unit
    = {}): CfnFunction.RequestParameterProperty =
    CfnFunction.RequestParameterProperty.builder().apply(initializer).build()
