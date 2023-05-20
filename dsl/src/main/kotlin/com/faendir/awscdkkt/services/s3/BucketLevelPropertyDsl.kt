@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnStorageLens

public fun bucketLevelProperty(initializer: CfnStorageLens.BucketLevelProperty.Builder.() -> Unit):
    CfnStorageLens.BucketLevelProperty =
    CfnStorageLens.BucketLevelProperty.builder().apply(initializer).build()
