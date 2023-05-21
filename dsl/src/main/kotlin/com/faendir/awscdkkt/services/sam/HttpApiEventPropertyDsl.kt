package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun httpApiEventProperty(initializer: CfnFunction.HttpApiEventProperty.Builder.() -> Unit =
    {}): CfnFunction.HttpApiEventProperty =
    CfnFunction.HttpApiEventProperty.builder().apply(initializer).build()
