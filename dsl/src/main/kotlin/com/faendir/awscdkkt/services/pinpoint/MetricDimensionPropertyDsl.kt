package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@Generated
public
    fun metricDimensionProperty(initializer: CfnCampaign.MetricDimensionProperty.Builder.() -> Unit
    = {}): CfnCampaign.MetricDimensionProperty =
    CfnCampaign.MetricDimensionProperty.builder().apply(initializer).build()
