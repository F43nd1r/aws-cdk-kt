package com.faendir.awscdkkt.services.athena

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnWorkGroup

@Generated
public
    fun workGroupConfigurationProperty(initializer: CfnWorkGroup.WorkGroupConfigurationProperty.Builder.() -> Unit
    = {}): CfnWorkGroup.WorkGroupConfigurationProperty =
    CfnWorkGroup.WorkGroupConfigurationProperty.builder().apply(initializer).build()
