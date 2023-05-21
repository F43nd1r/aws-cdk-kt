package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun sQSEventProperty(initializer: CfnFunction.SQSEventProperty.Builder.() -> Unit = {}):
    CfnFunction.SQSEventProperty = CfnFunction.SQSEventProperty.builder().apply(initializer).build()
