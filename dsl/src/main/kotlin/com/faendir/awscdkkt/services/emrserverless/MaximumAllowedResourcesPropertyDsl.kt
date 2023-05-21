package com.faendir.awscdkkt.services.emrserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication

@Generated
public
    fun maximumAllowedResourcesProperty(initializer: CfnApplication.MaximumAllowedResourcesProperty.Builder.() -> Unit
    = {}): CfnApplication.MaximumAllowedResourcesProperty =
    CfnApplication.MaximumAllowedResourcesProperty.builder().apply(initializer).build()
