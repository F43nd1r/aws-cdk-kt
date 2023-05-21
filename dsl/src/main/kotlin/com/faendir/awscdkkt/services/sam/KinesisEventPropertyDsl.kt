package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun kinesisEventProperty(initializer: CfnFunction.KinesisEventProperty.Builder.() -> Unit =
    {}): CfnFunction.KinesisEventProperty =
    CfnFunction.KinesisEventProperty.builder().apply(initializer).build()
