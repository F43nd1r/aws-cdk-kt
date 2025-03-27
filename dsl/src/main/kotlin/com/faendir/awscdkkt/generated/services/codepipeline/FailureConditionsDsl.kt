package com.faendir.awscdkkt.generated.services.codepipeline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.FailureConditions

@Generated
public fun buildFailureConditions(initializer: @AwsCdkDsl FailureConditions.Builder.() -> Unit =
    {}): FailureConditions = FailureConditions.Builder().apply(initializer).build()
