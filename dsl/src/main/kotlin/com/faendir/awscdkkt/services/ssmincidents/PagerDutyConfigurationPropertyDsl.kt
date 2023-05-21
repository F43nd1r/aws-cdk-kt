package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@Generated
public
    fun pagerDutyConfigurationProperty(initializer: CfnResponsePlan.PagerDutyConfigurationProperty.Builder.() -> Unit
    = {}): CfnResponsePlan.PagerDutyConfigurationProperty =
    CfnResponsePlan.PagerDutyConfigurationProperty.builder().apply(initializer).build()
