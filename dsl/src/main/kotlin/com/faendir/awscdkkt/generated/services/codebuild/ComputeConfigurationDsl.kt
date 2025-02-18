package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.ComputeConfiguration

@Generated
public fun buildComputeConfiguration(initializer: @AwsCdkDsl ComputeConfiguration.Builder.() -> Unit
    = {}): ComputeConfiguration = ComputeConfiguration.Builder().apply(initializer).build()
