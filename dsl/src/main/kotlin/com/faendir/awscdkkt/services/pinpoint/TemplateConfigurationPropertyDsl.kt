package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@Generated
public
    fun templateConfigurationProperty(initializer: CfnCampaign.TemplateConfigurationProperty.Builder.() -> Unit
    = {}): CfnCampaign.TemplateConfigurationProperty =
    CfnCampaign.TemplateConfigurationProperty.builder().apply(initializer).build()
