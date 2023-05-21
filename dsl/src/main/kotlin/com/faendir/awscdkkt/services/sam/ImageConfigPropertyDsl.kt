package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun imageConfigProperty(initializer: CfnFunction.ImageConfigProperty.Builder.() -> Unit =
    {}): CfnFunction.ImageConfigProperty =
    CfnFunction.ImageConfigProperty.builder().apply(initializer).build()
