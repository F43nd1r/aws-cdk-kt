package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnLaunchConfiguration

@Generated
public
    fun metadataOptionsProperty(initializer: CfnLaunchConfiguration.MetadataOptionsProperty.Builder.() -> Unit
    = {}): CfnLaunchConfiguration.MetadataOptionsProperty =
    CfnLaunchConfiguration.MetadataOptionsProperty.builder().apply(initializer).build()
