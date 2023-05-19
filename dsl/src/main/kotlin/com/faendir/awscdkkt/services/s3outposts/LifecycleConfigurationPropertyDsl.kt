@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnBucket

public
    fun lifecycleConfigurationProperty(initializer: CfnBucket.LifecycleConfigurationProperty.Builder.() -> Unit):
    CfnBucket.LifecycleConfigurationProperty =
    CfnBucket.LifecycleConfigurationProperty.builder().apply(initializer).build()
