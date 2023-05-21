package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicyOptions

@Generated
public fun removalPolicyOptions(initializer: RemovalPolicyOptions.Builder.() -> Unit = {}):
    RemovalPolicyOptions = RemovalPolicyOptions.builder().apply(initializer).build()
