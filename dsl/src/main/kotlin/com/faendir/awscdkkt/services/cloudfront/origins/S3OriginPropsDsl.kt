@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront.origins

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.S3OriginProps

public fun s3OriginProps(initializer: S3OriginProps.Builder.() -> Unit): S3OriginProps =
    S3OriginProps.builder().apply(initializer).build()
