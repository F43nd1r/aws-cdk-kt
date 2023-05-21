package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public fun s3BucketSourceProperty(initializer: CfnTable.S3BucketSourceProperty.Builder.() -> Unit =
    {}): CfnTable.S3BucketSourceProperty =
    CfnTable.S3BucketSourceProperty.builder().apply(initializer).build()
