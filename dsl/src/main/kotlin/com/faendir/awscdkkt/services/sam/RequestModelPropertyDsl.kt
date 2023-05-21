package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun requestModelProperty(initializer: CfnFunction.RequestModelProperty.Builder.() -> Unit =
    {}): CfnFunction.RequestModelProperty =
    CfnFunction.RequestModelProperty.builder().apply(initializer).build()
