@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.assertions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.assertions.MatchCapture

public fun matchCapture(initializer: MatchCapture.Builder.() -> Unit): MatchCapture =
    MatchCapture.builder().apply(initializer).build()
