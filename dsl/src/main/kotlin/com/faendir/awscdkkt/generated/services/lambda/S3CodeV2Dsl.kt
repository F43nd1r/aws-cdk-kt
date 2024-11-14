package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.S3CodeV2
import software.amazon.awscdk.services.s3.IBucket

@Generated
public fun buildS3CodeV2(
  bucket: IBucket,
  key: String,
  initializer: @AwsCdkDsl S3CodeV2.Builder.() -> Unit = {},
): S3CodeV2 = S3CodeV2.Builder.create(bucket, key).apply(initializer).build()
