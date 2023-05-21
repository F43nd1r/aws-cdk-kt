package com.faendir.awscdkkt.services.macie

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnFindingsFilter

@Generated
public
    fun findingCriteriaProperty(initializer: CfnFindingsFilter.FindingCriteriaProperty.Builder.() -> Unit
    = {}): CfnFindingsFilter.FindingCriteriaProperty =
    CfnFindingsFilter.FindingCriteriaProperty.builder().apply(initializer).build()
