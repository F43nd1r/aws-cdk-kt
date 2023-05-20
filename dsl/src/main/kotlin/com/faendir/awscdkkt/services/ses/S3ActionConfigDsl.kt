@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.S3ActionConfig

public fun s3ActionConfig(initializer: S3ActionConfig.Builder.() -> Unit): S3ActionConfig =
    S3ActionConfig.builder().apply(initializer).build()
