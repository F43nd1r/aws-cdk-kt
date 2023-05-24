package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.DestinationConfig

@Generated
public fun buildDestinationConfig(initializer: @AwsCdkDsl DestinationConfig.Builder.() -> Unit):
    DestinationConfig = DestinationConfig.Builder().apply(initializer).build()
