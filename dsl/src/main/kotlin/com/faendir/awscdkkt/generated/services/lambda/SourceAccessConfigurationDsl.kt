package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.SourceAccessConfiguration

@Generated
public fun buildSourceAccessConfiguration(initializer: @AwsCdkDsl
    SourceAccessConfiguration.Builder.() -> Unit): SourceAccessConfiguration =
    SourceAccessConfiguration.Builder().apply(initializer).build()
