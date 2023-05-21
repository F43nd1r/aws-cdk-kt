package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy

@Generated
public
    fun shareAttributesProperty(initializer: CfnSchedulingPolicy.ShareAttributesProperty.Builder.() -> Unit
    = {}): CfnSchedulingPolicy.ShareAttributesProperty =
    CfnSchedulingPolicy.ShareAttributesProperty.builder().apply(initializer).build()
