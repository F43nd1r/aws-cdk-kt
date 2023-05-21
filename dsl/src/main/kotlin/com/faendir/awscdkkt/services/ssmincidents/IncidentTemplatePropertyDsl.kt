package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@Generated
public
    fun incidentTemplateProperty(initializer: CfnResponsePlan.IncidentTemplateProperty.Builder.() -> Unit
    = {}): CfnResponsePlan.IncidentTemplateProperty =
    CfnResponsePlan.IncidentTemplateProperty.builder().apply(initializer).build()
