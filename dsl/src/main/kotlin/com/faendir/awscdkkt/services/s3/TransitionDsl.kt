package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.Transition

@Generated
public fun transition(initializer: Transition.Builder.() -> Unit = {}): Transition =
    Transition.builder().apply(initializer).build()
