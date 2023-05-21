package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnFilter

@Generated
public fun findingCriteriaProperty(initializer: CfnFilter.FindingCriteriaProperty.Builder.() -> Unit
    = {}): CfnFilter.FindingCriteriaProperty =
    CfnFilter.FindingCriteriaProperty.builder().apply(initializer).build()
