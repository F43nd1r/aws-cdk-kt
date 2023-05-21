package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps

@Generated
public fun s3EventSourceProps(initializer: S3EventSourceProps.Builder.() -> Unit = {}):
    S3EventSourceProps = S3EventSourceProps.builder().apply(initializer).build()
