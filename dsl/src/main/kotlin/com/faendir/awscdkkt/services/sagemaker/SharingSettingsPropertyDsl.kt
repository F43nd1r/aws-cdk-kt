package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

@Generated
public
    fun sharingSettingsProperty(initializer: CfnUserProfile.SharingSettingsProperty.Builder.() -> Unit
    = {}): CfnUserProfile.SharingSettingsProperty =
    CfnUserProfile.SharingSettingsProperty.builder().apply(initializer).build()
