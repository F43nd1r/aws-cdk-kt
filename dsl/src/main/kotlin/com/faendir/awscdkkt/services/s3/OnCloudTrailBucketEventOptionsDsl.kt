package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions

@Generated
public
    fun onCloudTrailBucketEventOptions(initializer: OnCloudTrailBucketEventOptions.Builder.() -> Unit
    = {}): OnCloudTrailBucketEventOptions =
    OnCloudTrailBucketEventOptions.builder().apply(initializer).build()
