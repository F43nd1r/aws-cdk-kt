package com.faendir.awscdkkt.generated.services.cloudfront.origins

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.S3StaticWebsiteOrigin
import software.amazon.awscdk.services.s3.IBucket

@Generated
public fun buildS3StaticWebsiteOrigin(bucket: IBucket, initializer: @AwsCdkDsl S3StaticWebsiteOrigin.Builder.() -> Unit = {}): S3StaticWebsiteOrigin = S3StaticWebsiteOrigin.Builder.create(bucket).apply(initializer).build()
