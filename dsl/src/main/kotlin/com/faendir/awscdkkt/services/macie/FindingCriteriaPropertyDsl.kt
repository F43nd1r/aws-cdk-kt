@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.macie

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnFindingsFilter

public
    fun findingCriteriaProperty(initializer: CfnFindingsFilter.FindingCriteriaProperty.Builder.() -> Unit):
    CfnFindingsFilter.FindingCriteriaProperty =
    CfnFindingsFilter.FindingCriteriaProperty.builder().apply(initializer).build()
