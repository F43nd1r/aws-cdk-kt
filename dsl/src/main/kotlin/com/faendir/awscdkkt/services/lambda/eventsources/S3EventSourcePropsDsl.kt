@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps

public fun s3EventSourceProps(initializer: S3EventSourceProps.Builder.() -> Unit):
    S3EventSourceProps = S3EventSourceProps.builder().apply(initializer).build()
