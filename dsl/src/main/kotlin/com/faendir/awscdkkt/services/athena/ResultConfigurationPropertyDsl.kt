package com.faendir.awscdkkt.services.athena

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnWorkGroup

@Generated
public
    fun resultConfigurationProperty(initializer: CfnWorkGroup.ResultConfigurationProperty.Builder.() -> Unit
    = {}): CfnWorkGroup.ResultConfigurationProperty =
    CfnWorkGroup.ResultConfigurationProperty.builder().apply(initializer).build()
