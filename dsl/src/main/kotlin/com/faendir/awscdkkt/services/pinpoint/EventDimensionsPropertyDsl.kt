package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@Generated
public
    fun eventDimensionsProperty(initializer: CfnCampaign.EventDimensionsProperty.Builder.() -> Unit
    = {}): CfnCampaign.EventDimensionsProperty =
    CfnCampaign.EventDimensionsProperty.builder().apply(initializer).build()
