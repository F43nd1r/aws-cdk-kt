package com.faendir.awscdkkt.services.ce

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ce.CfnAnomalySubscription

@Generated
public
    fun resourceTagProperty(initializer: CfnAnomalySubscription.ResourceTagProperty.Builder.() -> Unit
    = {}): CfnAnomalySubscription.ResourceTagProperty =
    CfnAnomalySubscription.ResourceTagProperty.builder().apply(initializer).build()
