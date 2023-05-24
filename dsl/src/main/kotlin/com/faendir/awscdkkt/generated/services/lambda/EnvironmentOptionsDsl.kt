package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.EnvironmentOptions

@Generated
public fun buildEnvironmentOptions(initializer: @AwsCdkDsl EnvironmentOptions.Builder.() -> Unit):
    EnvironmentOptions = EnvironmentOptions.Builder().apply(initializer).build()
