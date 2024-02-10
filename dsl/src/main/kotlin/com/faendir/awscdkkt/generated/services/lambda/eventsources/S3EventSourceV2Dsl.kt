package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.S3EventSourceV2
import software.amazon.awscdk.services.s3.IBucket

@Generated
public fun buildS3EventSourceV2(bucket: IBucket, initializer: @AwsCdkDsl
    S3EventSourceV2.Builder.() -> Unit = {}): S3EventSourceV2 =
    S3EventSourceV2.Builder.create(bucket).apply(initializer).build()
