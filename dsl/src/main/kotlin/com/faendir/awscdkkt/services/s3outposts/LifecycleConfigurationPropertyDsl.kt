@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnBucket

public
    fun lifecycleConfigurationProperty(initializer: CfnBucket.LifecycleConfigurationProperty.Builder.() -> Unit):
    CfnBucket.LifecycleConfigurationProperty =
    CfnBucket.LifecycleConfigurationProperty.builder().apply(initializer).build()
