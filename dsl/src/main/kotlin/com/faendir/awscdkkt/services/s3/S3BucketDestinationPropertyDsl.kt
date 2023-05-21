package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnStorageLens

@Generated
public
    fun s3BucketDestinationProperty(initializer: CfnStorageLens.S3BucketDestinationProperty.Builder.() -> Unit
    = {}): CfnStorageLens.S3BucketDestinationProperty =
    CfnStorageLens.S3BucketDestinationProperty.builder().apply(initializer).build()
