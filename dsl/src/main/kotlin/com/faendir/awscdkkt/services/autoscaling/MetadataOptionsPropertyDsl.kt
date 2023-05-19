@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration

public
    fun metadataOptionsProperty(initializer: CfnLaunchConfiguration.MetadataOptionsProperty.Builder.() -> Unit):
    CfnLaunchConfiguration.MetadataOptionsProperty =
    CfnLaunchConfiguration.MetadataOptionsProperty.builder().apply(initializer).build()
