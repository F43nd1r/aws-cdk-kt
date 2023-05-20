@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnTrail

public
    fun insightSelectorProperty(initializer: CfnTrail.InsightSelectorProperty.Builder.() -> Unit):
    CfnTrail.InsightSelectorProperty =
    CfnTrail.InsightSelectorProperty.builder().apply(initializer).build()
