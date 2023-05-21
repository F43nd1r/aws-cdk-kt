package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.TaintSpec

@Generated
public fun taintSpec(initializer: TaintSpec.Builder.() -> Unit = {}): TaintSpec =
    TaintSpec.builder().apply(initializer).build()
