package com.faendir.awscdkkt.services.healthlake

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

@Generated
public
    fun preloadDataConfigProperty(initializer: CfnFHIRDatastore.PreloadDataConfigProperty.Builder.() -> Unit
    = {}): CfnFHIRDatastore.PreloadDataConfigProperty =
    CfnFHIRDatastore.PreloadDataConfigProperty.builder().apply(initializer).build()
