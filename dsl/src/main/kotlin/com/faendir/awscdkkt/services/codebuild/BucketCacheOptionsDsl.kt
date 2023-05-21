package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.BucketCacheOptions

@Generated
public fun bucketCacheOptions(initializer: BucketCacheOptions.Builder.() -> Unit = {}):
    BucketCacheOptions = BucketCacheOptions.builder().apply(initializer).build()
