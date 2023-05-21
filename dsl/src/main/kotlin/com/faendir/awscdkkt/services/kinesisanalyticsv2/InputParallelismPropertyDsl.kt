package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@Generated
public
    fun inputParallelismProperty(initializer: CfnApplication.InputParallelismProperty.Builder.() -> Unit
    = {}): CfnApplication.InputParallelismProperty =
    CfnApplication.InputParallelismProperty.builder().apply(initializer).build()
