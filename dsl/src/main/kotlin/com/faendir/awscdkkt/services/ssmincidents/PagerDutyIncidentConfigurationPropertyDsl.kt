@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

public
    fun pagerDutyIncidentConfigurationProperty(initializer: CfnResponsePlan.PagerDutyIncidentConfigurationProperty.Builder.() -> Unit):
    CfnResponsePlan.PagerDutyIncidentConfigurationProperty =
    CfnResponsePlan.PagerDutyIncidentConfigurationProperty.builder().apply(initializer).build()
