package com.faendir.awscdkkt.services.s3.deployment

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.SourceConfig

@Generated
public fun sourceConfig(initializer: SourceConfig.Builder.() -> Unit = {}): SourceConfig =
    SourceConfig.builder().apply(initializer).build()
