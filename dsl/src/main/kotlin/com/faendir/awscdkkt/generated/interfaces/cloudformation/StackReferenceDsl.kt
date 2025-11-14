package com.faendir.awscdkkt.generated.interfaces.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.cloudformation.StackReference

@Generated
public fun buildStackReference(initializer: @AwsCdkDsl StackReference.Builder.() -> Unit = {}): StackReference = StackReference.Builder().apply(initializer).build()
