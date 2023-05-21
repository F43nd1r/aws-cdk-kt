package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy

@Generated
public
    fun fairsharePolicyProperty(initializer: CfnSchedulingPolicy.FairsharePolicyProperty.Builder.() -> Unit
    = {}): CfnSchedulingPolicy.FairsharePolicyProperty =
    CfnSchedulingPolicy.FairsharePolicyProperty.builder().apply(initializer).build()
