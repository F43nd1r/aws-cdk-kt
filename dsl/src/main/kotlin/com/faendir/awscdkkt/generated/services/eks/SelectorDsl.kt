package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.Selector

@Generated
public fun buildSelector(initializer: @AwsCdkDsl Selector.Builder.() -> Unit = {}): Selector =
    Selector.Builder().apply(initializer).build()
