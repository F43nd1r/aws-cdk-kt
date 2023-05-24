package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.Transition

@Generated
public fun buildTransition(initializer: @AwsCdkDsl Transition.Builder.() -> Unit): Transition =
    Transition.Builder().apply(initializer).build()
