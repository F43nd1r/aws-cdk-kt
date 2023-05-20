@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3.deployment

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.deployment.SourceConfig

public fun sourceConfig(initializer: SourceConfig.Builder.() -> Unit): SourceConfig =
    SourceConfig.builder().apply(initializer).build()
