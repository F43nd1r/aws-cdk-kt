package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.S3EventSource
import software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps
import software.amazon.awscdk.services.s3.Bucket

@Generated
public fun s3EventSource(bucket: Bucket, props: S3EventSourceProps): S3EventSource =
    S3EventSource(bucket, props)

@Generated
public fun buildS3EventSource(bucket: Bucket, initializer: @AwsCdkDsl
    S3EventSource.Builder.() -> Unit): S3EventSource =
    S3EventSource.Builder.create(bucket).apply(initializer).build()
