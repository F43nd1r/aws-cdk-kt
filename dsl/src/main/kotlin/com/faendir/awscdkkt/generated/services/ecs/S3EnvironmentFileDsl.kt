package com.faendir.awscdkkt.generated.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import software.amazon.awscdk.services.ecs.S3EnvironmentFile
import software.amazon.awscdk.services.s3.IBucket

@Generated
public fun s3EnvironmentFile(bucket: IBucket, key: String): S3EnvironmentFile =
    S3EnvironmentFile(bucket, key)

@Generated
public fun s3EnvironmentFile(
  bucket: IBucket,
  key: String,
  objectVersion: String,
): S3EnvironmentFile = S3EnvironmentFile(bucket, key, objectVersion)
