package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.Behavior

@Generated
public fun buildBehavior(initializer: @AwsCdkDsl Behavior.Builder.() -> Unit): Behavior =
    Behavior.Builder().apply(initializer).build()
