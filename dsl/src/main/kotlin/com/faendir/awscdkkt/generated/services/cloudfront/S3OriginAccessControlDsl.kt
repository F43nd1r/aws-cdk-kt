package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.S3OriginAccessControl
import software.amazon.awscdk.services.cloudfront.S3OriginAccessControlProps
import software.constructs.Construct

@Generated
public fun Construct.s3OriginAccessControl(id: String, initializer: @AwsCdkDsl
    S3OriginAccessControl.() -> Unit = {}): S3OriginAccessControl = S3OriginAccessControl(this,
    id).apply(initializer)

@Generated
public fun Construct.s3OriginAccessControl(
  id: String,
  props: S3OriginAccessControlProps,
  initializer: @AwsCdkDsl S3OriginAccessControl.() -> Unit = {},
): S3OriginAccessControl = S3OriginAccessControl(this, id, props).apply(initializer)

@Generated
public fun Construct.buildS3OriginAccessControl(id: String, initializer: @AwsCdkDsl
    S3OriginAccessControl.Builder.() -> Unit = {}): S3OriginAccessControl =
    S3OriginAccessControl.Builder.create(this, id).apply(initializer).build()
