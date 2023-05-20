@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

public
    fun versioningConfigurationProperty(initializer: CfnBucket.VersioningConfigurationProperty.Builder.() -> Unit):
    CfnBucket.VersioningConfigurationProperty =
    CfnBucket.VersioningConfigurationProperty.builder().apply(initializer).build()
