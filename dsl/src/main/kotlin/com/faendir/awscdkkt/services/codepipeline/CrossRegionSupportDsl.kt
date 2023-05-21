package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CrossRegionSupport

@Generated
public fun crossRegionSupport(initializer: CrossRegionSupport.Builder.() -> Unit = {}):
    CrossRegionSupport = CrossRegionSupport.builder().apply(initializer).build()
