@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps

public fun s3EventSourceProps(initializer: S3EventSourceProps.Builder.() -> Unit):
    S3EventSourceProps = S3EventSourceProps.builder().apply(initializer).build()
