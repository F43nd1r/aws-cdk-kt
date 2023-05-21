package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnJobTemplate

@Generated
public
    fun retryCriteriaProperty(initializer: CfnJobTemplate.RetryCriteriaProperty.Builder.() -> Unit =
    {}): CfnJobTemplate.RetryCriteriaProperty =
    CfnJobTemplate.RetryCriteriaProperty.builder().apply(initializer).build()
