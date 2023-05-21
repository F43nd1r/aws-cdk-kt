package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance

@Generated
public
    fun processorFeatureProperty(initializer: CfnDBInstance.ProcessorFeatureProperty.Builder.() -> Unit
    = {}): CfnDBInstance.ProcessorFeatureProperty =
    CfnDBInstance.ProcessorFeatureProperty.builder().apply(initializer).build()
