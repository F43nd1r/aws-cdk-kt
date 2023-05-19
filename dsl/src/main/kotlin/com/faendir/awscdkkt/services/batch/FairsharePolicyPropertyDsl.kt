@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy

public
    fun fairsharePolicyProperty(initializer: CfnSchedulingPolicy.FairsharePolicyProperty.Builder.() -> Unit):
    CfnSchedulingPolicy.FairsharePolicyProperty =
    CfnSchedulingPolicy.FairsharePolicyProperty.builder().apply(initializer).build()
