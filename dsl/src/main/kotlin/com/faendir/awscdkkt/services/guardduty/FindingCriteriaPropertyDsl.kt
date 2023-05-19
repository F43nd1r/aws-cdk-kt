@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnFilter

public
    fun findingCriteriaProperty(initializer: CfnFilter.FindingCriteriaProperty.Builder.() -> Unit):
    CfnFilter.FindingCriteriaProperty =
    CfnFilter.FindingCriteriaProperty.builder().apply(initializer).build()
