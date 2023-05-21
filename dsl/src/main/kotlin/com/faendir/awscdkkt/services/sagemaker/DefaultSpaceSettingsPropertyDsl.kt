package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnDomain

@Generated
public
    fun defaultSpaceSettingsProperty(initializer: CfnDomain.DefaultSpaceSettingsProperty.Builder.() -> Unit
    = {}): CfnDomain.DefaultSpaceSettingsProperty =
    CfnDomain.DefaultSpaceSettingsProperty.builder().apply(initializer).build()
