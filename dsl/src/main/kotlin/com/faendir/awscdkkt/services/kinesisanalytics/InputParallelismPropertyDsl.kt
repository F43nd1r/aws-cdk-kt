package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun inputParallelismProperty(initializer: CfnApplicationV2.InputParallelismProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.InputParallelismProperty =
    CfnApplicationV2.InputParallelismProperty.builder().apply(initializer).build()
