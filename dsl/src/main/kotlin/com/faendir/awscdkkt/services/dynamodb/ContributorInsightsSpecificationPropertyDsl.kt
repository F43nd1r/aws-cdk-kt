package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public
    fun contributorInsightsSpecificationProperty(initializer: CfnTable.ContributorInsightsSpecificationProperty.Builder.() -> Unit
    = {}): CfnTable.ContributorInsightsSpecificationProperty =
    CfnTable.ContributorInsightsSpecificationProperty.builder().apply(initializer).build()
