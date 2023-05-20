@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.macie

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnFindingsFilter

public
    fun findingCriteriaProperty(initializer: CfnFindingsFilter.FindingCriteriaProperty.Builder.() -> Unit):
    CfnFindingsFilter.FindingCriteriaProperty =
    CfnFindingsFilter.FindingCriteriaProperty.builder().apply(initializer).build()
