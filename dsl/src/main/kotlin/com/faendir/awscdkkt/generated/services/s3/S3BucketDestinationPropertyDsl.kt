package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnStorageLens

@Generated
public fun buildS3BucketDestinationProperty(initializer: @AwsCdkDsl
    CfnStorageLens.S3BucketDestinationProperty.Builder.() -> Unit = {}):
    CfnStorageLens.S3BucketDestinationProperty =
    CfnStorageLens.S3BucketDestinationProperty.Builder().apply(initializer).build()
