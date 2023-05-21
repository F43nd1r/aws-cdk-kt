package com.faendir.awscdkkt.services.emrserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication

@Generated
public
    fun imageConfigurationInputProperty(initializer: CfnApplication.ImageConfigurationInputProperty.Builder.() -> Unit
    = {}): CfnApplication.ImageConfigurationInputProperty =
    CfnApplication.ImageConfigurationInputProperty.builder().apply(initializer).build()
