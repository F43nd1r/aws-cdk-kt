package com.faendir.awscdkkt.services.customerprofiles

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

@Generated
public
    fun serviceNowSourcePropertiesProperty(initializer: CfnIntegration.ServiceNowSourcePropertiesProperty.Builder.() -> Unit
    = {}): CfnIntegration.ServiceNowSourcePropertiesProperty =
    CfnIntegration.ServiceNowSourcePropertiesProperty.builder().apply(initializer).build()
