package com.faendir.awscdkkt.assertions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.assertions.MatchCapture

@Generated
public fun matchCapture(initializer: MatchCapture.Builder.() -> Unit = {}): MatchCapture =
    MatchCapture.builder().apply(initializer).build()
