@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnFilter

public
    fun findingCriteriaProperty(initializer: CfnFilter.FindingCriteriaProperty.Builder.() -> Unit):
    CfnFilter.FindingCriteriaProperty =
    CfnFilter.FindingCriteriaProperty.builder().apply(initializer).build()
