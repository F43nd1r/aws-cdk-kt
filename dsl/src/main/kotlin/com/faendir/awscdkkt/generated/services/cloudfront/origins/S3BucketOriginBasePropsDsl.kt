package com.faendir.awscdkkt.generated.services.cloudfront.origins

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.S3BucketOriginBaseProps

@Generated
public fun buildS3BucketOriginBaseProps(initializer: @AwsCdkDsl
    S3BucketOriginBaseProps.Builder.() -> Unit = {}): S3BucketOriginBaseProps =
    S3BucketOriginBaseProps.Builder().apply(initializer).build()
