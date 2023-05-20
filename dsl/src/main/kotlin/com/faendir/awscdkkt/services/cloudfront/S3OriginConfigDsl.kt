@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.S3OriginConfig

public fun s3OriginConfig(initializer: S3OriginConfig.Builder.() -> Unit): S3OriginConfig =
    S3OriginConfig.builder().apply(initializer).build()
