package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@Generated
public
    fun inAppMessageBodyConfigProperty(initializer: CfnCampaign.InAppMessageBodyConfigProperty.Builder.() -> Unit
    = {}): CfnCampaign.InAppMessageBodyConfigProperty =
    CfnCampaign.InAppMessageBodyConfigProperty.builder().apply(initializer).build()
