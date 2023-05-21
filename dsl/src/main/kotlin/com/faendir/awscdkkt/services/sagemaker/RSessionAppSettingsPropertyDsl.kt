package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnDomain

@Generated
public
    fun rSessionAppSettingsProperty(initializer: CfnDomain.RSessionAppSettingsProperty.Builder.() -> Unit
    = {}): CfnDomain.RSessionAppSettingsProperty =
    CfnDomain.RSessionAppSettingsProperty.builder().apply(initializer).build()
