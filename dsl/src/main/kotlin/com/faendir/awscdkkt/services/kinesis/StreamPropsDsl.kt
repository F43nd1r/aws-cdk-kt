@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesis

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.StreamProps

public fun streamProps(initializer: StreamProps.Builder.() -> Unit): StreamProps =
    StreamProps.builder().apply(initializer).build()
