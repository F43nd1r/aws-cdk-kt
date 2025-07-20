package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.S3EventSource
import software.amazon.awscdk.services.s3.Bucket

@Generated
public fun buildS3EventSource(bucket: Bucket, initializer: @AwsCdkDsl S3EventSource.Builder.() -> Unit = {}): S3EventSource = S3EventSource.Builder.create(bucket).apply(initializer).build()
