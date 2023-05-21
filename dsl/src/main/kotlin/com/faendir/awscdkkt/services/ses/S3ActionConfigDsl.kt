package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.S3ActionConfig

@Generated
public fun s3ActionConfig(initializer: S3ActionConfig.Builder.() -> Unit = {}): S3ActionConfig =
    S3ActionConfig.builder().apply(initializer).build()
