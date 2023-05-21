package com.faendir.awscdkkt.services.emrserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication

@Generated
public
    fun initialCapacityConfigProperty(initializer: CfnApplication.InitialCapacityConfigProperty.Builder.() -> Unit
    = {}): CfnApplication.InitialCapacityConfigProperty =
    CfnApplication.InitialCapacityConfigProperty.builder().apply(initializer).build()
