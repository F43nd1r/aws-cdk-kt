package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.SourceConfiguration

@Generated
public fun sourceConfiguration(initializer: SourceConfiguration.Builder.() -> Unit = {}):
    SourceConfiguration = SourceConfiguration.builder().apply(initializer).build()
