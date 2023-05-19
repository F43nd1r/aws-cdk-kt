@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

public
    fun pagerDutyIncidentConfigurationProperty(initializer: CfnResponsePlan.PagerDutyIncidentConfigurationProperty.Builder.() -> Unit):
    CfnResponsePlan.PagerDutyIncidentConfigurationProperty =
    CfnResponsePlan.PagerDutyIncidentConfigurationProperty.builder().apply(initializer).build()
