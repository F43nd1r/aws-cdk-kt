@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.StreamOptions

public fun streamOptions(initializer: StreamOptions.Builder.() -> Unit): StreamOptions =
    StreamOptions.builder().apply(initializer).build()
