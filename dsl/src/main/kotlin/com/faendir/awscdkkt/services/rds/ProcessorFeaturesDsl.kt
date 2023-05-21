package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ProcessorFeatures

@Generated
public fun processorFeatures(initializer: ProcessorFeatures.Builder.() -> Unit = {}):
    ProcessorFeatures = ProcessorFeatures.builder().apply(initializer).build()
