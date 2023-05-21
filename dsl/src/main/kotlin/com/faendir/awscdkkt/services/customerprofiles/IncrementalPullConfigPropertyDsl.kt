package com.faendir.awscdkkt.services.customerprofiles

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@Generated
public
    fun incrementalPullConfigProperty(initializer: CfnIntegration.IncrementalPullConfigProperty.Builder.() -> Unit
    = {}): CfnIntegration.IncrementalPullConfigProperty =
    CfnIntegration.IncrementalPullConfigProperty.builder().apply(initializer).build()
