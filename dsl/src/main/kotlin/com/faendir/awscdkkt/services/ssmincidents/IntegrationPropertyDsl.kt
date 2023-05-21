package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@Generated
public fun integrationProperty(initializer: CfnResponsePlan.IntegrationProperty.Builder.() -> Unit =
    {}): CfnResponsePlan.IntegrationProperty =
    CfnResponsePlan.IntegrationProperty.builder().apply(initializer).build()
