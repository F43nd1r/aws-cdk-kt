package com.faendir.awscdkkt.generated.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import software.amazon.awscdk.services.apigateway.S3ApiDefinition
import software.amazon.awscdk.services.s3.IBucket

@Generated
public fun s3ApiDefinition(bucket: IBucket, key: String): S3ApiDefinition = S3ApiDefinition(bucket,
    key)

@Generated
public fun s3ApiDefinition(
  bucket: IBucket,
  key: String,
  objectVersion: String,
): S3ApiDefinition = S3ApiDefinition(bucket, key, objectVersion)
