package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster

@Generated
public fun stepConfigProperty(initializer: CfnCluster.StepConfigProperty.Builder.() -> Unit = {}):
    CfnCluster.StepConfigProperty =
    CfnCluster.StepConfigProperty.builder().apply(initializer).build()
