package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions

@Generated
public
    fun onCloudTrailImagePushedOptions(initializer: OnCloudTrailImagePushedOptions.Builder.() -> Unit
    = {}): OnCloudTrailImagePushedOptions =
    OnCloudTrailImagePushedOptions.builder().apply(initializer).build()
