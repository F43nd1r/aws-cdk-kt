@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnStorageLens

public fun bucketLevelProperty(initializer: CfnStorageLens.BucketLevelProperty.Builder.() -> Unit):
    CfnStorageLens.BucketLevelProperty =
    CfnStorageLens.BucketLevelProperty.builder().apply(initializer).build()
