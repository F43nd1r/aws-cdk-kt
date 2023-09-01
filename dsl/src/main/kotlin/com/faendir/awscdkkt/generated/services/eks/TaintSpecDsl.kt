package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.TaintSpec

@Generated
public fun buildTaintSpec(initializer: @AwsCdkDsl TaintSpec.Builder.() -> Unit = {}): TaintSpec =
    TaintSpec.Builder().apply(initializer).build()
