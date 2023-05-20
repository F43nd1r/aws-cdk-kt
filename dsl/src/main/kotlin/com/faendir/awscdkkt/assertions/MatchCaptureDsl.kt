@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.assertions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.assertions.MatchCapture

public fun matchCapture(initializer: MatchCapture.Builder.() -> Unit): MatchCapture =
    MatchCapture.builder().apply(initializer).build()
