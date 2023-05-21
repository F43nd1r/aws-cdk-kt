package com.faendir.awscdkkt.services.xray

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.xray.CfnGroup

@Generated
public
    fun insightsConfigurationProperty(initializer: CfnGroup.InsightsConfigurationProperty.Builder.() -> Unit
    = {}): CfnGroup.InsightsConfigurationProperty =
    CfnGroup.InsightsConfigurationProperty.builder().apply(initializer).build()
