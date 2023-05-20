@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

public fun s3KeyFilterProperty(initializer: CfnBucket.S3KeyFilterProperty.Builder.() -> Unit):
    CfnBucket.S3KeyFilterProperty =
    CfnBucket.S3KeyFilterProperty.builder().apply(initializer).build()
