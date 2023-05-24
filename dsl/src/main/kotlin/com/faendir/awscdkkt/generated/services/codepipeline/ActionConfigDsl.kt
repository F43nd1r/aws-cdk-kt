package com.faendir.awscdkkt.generated.services.codepipeline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.ActionConfig

@Generated
public fun buildActionConfig(initializer: @AwsCdkDsl ActionConfig.Builder.() -> Unit): ActionConfig
    = ActionConfig.Builder().apply(initializer).build()
