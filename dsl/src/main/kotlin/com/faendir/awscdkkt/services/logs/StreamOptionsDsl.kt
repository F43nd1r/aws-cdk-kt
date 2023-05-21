package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.StreamOptions

@Generated
public fun streamOptions(initializer: StreamOptions.Builder.() -> Unit = {}): StreamOptions =
    StreamOptions.builder().apply(initializer).build()
