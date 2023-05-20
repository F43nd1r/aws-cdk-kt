@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

public fun s3BucketSourceProperty(initializer: CfnTable.S3BucketSourceProperty.Builder.() -> Unit):
    CfnTable.S3BucketSourceProperty =
    CfnTable.S3BucketSourceProperty.builder().apply(initializer).build()
