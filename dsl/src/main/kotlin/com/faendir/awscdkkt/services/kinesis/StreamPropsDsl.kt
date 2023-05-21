package com.faendir.awscdkkt.services.kinesis

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.StreamProps

@Generated
public fun streamProps(initializer: StreamProps.Builder.() -> Unit = {}): StreamProps =
    StreamProps.builder().apply(initializer).build()
