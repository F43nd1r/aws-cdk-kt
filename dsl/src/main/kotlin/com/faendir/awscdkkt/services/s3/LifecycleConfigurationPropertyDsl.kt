package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun lifecycleConfigurationProperty(initializer: CfnBucket.LifecycleConfigurationProperty.Builder.() -> Unit
    = {}): CfnBucket.LifecycleConfigurationProperty =
    CfnBucket.LifecycleConfigurationProperty.builder().apply(initializer).build()
