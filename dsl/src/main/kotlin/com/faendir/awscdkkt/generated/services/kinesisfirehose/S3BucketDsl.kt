package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.S3Bucket
import software.amazon.awscdk.services.s3.IBucket

@Generated
public fun buildS3Bucket(bucket: IBucket, initializer: @AwsCdkDsl S3Bucket.Builder.() -> Unit = {}): S3Bucket = S3Bucket.Builder.create(bucket).apply(initializer).build()
