package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@Generated
public
    fun pagerDutyIncidentConfigurationProperty(initializer: CfnResponsePlan.PagerDutyIncidentConfigurationProperty.Builder.() -> Unit
    = {}): CfnResponsePlan.PagerDutyIncidentConfigurationProperty =
    CfnResponsePlan.PagerDutyIncidentConfigurationProperty.builder().apply(initializer).build()
