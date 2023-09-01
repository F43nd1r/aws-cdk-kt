package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ServerlessScalingOptions

@Generated
public fun buildServerlessScalingOptions(initializer: @AwsCdkDsl
    ServerlessScalingOptions.Builder.() -> Unit = {}): ServerlessScalingOptions =
    ServerlessScalingOptions.Builder().apply(initializer).build()
