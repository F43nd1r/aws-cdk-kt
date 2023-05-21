package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow

@Generated
public
    fun incrementalPullConfigProperty(initializer: CfnFlow.IncrementalPullConfigProperty.Builder.() -> Unit
    = {}): CfnFlow.IncrementalPullConfigProperty =
    CfnFlow.IncrementalPullConfigProperty.builder().apply(initializer).build()
