package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigurationAggregator

@Generated
public
    fun organizationAggregationSourceProperty(initializer: CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder.() -> Unit
    = {}): CfnConfigurationAggregator.OrganizationAggregationSourceProperty =
    CfnConfigurationAggregator.OrganizationAggregationSourceProperty.builder().apply(initializer).build()
