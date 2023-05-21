package com.faendir.awscdkkt.services.kinesis

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.StreamAttributes

@Generated
public fun streamAttributes(initializer: StreamAttributes.Builder.() -> Unit = {}): StreamAttributes
    = StreamAttributes.builder().apply(initializer).build()
