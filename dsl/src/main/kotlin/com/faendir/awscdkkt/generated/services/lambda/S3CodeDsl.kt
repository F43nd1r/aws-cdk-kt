package com.faendir.awscdkkt.generated.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import software.amazon.awscdk.services.lambda.S3Code
import software.amazon.awscdk.services.s3.IBucket

@Generated
public fun s3Code(bucket: IBucket, key: String): S3Code = S3Code(bucket, key)

@Generated
public fun s3Code(
  bucket: IBucket,
  key: String,
  objectVersion: String,
): S3Code = S3Code(bucket, key, objectVersion)
