package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@Generated
public
    fun messageConfigurationProperty(initializer: CfnCampaign.MessageConfigurationProperty.Builder.() -> Unit
    = {}): CfnCampaign.MessageConfigurationProperty =
    CfnCampaign.MessageConfigurationProperty.builder().apply(initializer).build()
