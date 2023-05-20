@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.BucketCacheOptions

public fun bucketCacheOptions(initializer: BucketCacheOptions.Builder.() -> Unit):
    BucketCacheOptions = BucketCacheOptions.builder().apply(initializer).build()
