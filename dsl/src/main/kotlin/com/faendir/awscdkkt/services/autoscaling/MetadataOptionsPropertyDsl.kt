@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration

public
    fun metadataOptionsProperty(initializer: CfnLaunchConfiguration.MetadataOptionsProperty.Builder.() -> Unit):
    CfnLaunchConfiguration.MetadataOptionsProperty =
    CfnLaunchConfiguration.MetadataOptionsProperty.builder().apply(initializer).build()
