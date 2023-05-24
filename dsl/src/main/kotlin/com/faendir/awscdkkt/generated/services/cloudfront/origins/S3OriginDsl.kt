package com.faendir.awscdkkt.generated.services.cloudfront.origins

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.S3Origin
import software.amazon.awscdk.services.s3.IBucket

@Generated
public fun buildS3Origin(bucket: IBucket, initializer: @AwsCdkDsl S3Origin.Builder.() -> Unit):
    S3Origin = S3Origin.Builder.create(bucket).apply(initializer).build()
