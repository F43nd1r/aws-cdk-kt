package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public
    fun filterCriteriaProperty(initializer: CfnEventSourceMapping.FilterCriteriaProperty.Builder.() -> Unit
    = {}): CfnEventSourceMapping.FilterCriteriaProperty =
    CfnEventSourceMapping.FilterCriteriaProperty.builder().apply(initializer).build()
