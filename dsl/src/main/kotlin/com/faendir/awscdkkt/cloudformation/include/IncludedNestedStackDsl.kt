package com.faendir.awscdkkt.cloudformation.include

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudformation.include.IncludedNestedStack

@Generated
public fun includedNestedStack(initializer: IncludedNestedStack.Builder.() -> Unit = {}):
    IncludedNestedStack = IncludedNestedStack.builder().apply(initializer).build()
