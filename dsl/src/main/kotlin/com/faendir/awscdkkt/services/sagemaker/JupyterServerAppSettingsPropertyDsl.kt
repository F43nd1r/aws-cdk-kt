package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

@Generated
public
    fun jupyterServerAppSettingsProperty(initializer: CfnUserProfile.JupyterServerAppSettingsProperty.Builder.() -> Unit
    = {}): CfnUserProfile.JupyterServerAppSettingsProperty =
    CfnUserProfile.JupyterServerAppSettingsProperty.builder().apply(initializer).build()
