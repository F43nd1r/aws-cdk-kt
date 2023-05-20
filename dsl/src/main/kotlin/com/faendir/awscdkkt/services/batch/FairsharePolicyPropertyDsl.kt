@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy

public
    fun fairsharePolicyProperty(initializer: CfnSchedulingPolicy.FairsharePolicyProperty.Builder.() -> Unit):
    CfnSchedulingPolicy.FairsharePolicyProperty =
    CfnSchedulingPolicy.FairsharePolicyProperty.builder().apply(initializer).build()
