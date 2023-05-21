package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.SourceAccessConfiguration

@Generated
public fun sourceAccessConfiguration(initializer: SourceAccessConfiguration.Builder.() -> Unit =
    {}): SourceAccessConfiguration = SourceAccessConfiguration.builder().apply(initializer).build()
