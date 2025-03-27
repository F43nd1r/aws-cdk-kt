package com.faendir.awscdkkt.generated.services.codepipeline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.Condition

@Generated
public fun buildCondition(initializer: @AwsCdkDsl Condition.Builder.() -> Unit = {}): Condition =
    Condition.Builder().apply(initializer).build()
