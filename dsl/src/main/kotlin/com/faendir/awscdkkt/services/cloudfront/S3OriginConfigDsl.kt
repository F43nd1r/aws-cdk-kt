package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.S3OriginConfig

@Generated
public fun s3OriginConfig(initializer: S3OriginConfig.Builder.() -> Unit = {}): S3OriginConfig =
    S3OriginConfig.builder().apply(initializer).build()
