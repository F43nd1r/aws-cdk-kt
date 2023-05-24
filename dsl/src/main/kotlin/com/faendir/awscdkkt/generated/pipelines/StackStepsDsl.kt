package com.faendir.awscdkkt.generated.pipelines

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.StackSteps

@Generated
public fun buildStackSteps(initializer: @AwsCdkDsl StackSteps.Builder.() -> Unit): StackSteps =
    StackSteps.Builder().apply(initializer).build()
