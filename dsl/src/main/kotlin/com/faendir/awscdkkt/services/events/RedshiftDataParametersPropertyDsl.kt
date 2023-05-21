package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public
    fun redshiftDataParametersProperty(initializer: CfnRule.RedshiftDataParametersProperty.Builder.() -> Unit
    = {}): CfnRule.RedshiftDataParametersProperty =
    CfnRule.RedshiftDataParametersProperty.builder().apply(initializer).build()
