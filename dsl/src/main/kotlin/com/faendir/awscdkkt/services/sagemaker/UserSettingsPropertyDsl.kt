@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

public
    fun userSettingsProperty(initializer: CfnUserProfile.UserSettingsProperty.Builder.() -> Unit):
    CfnUserProfile.UserSettingsProperty =
    CfnUserProfile.UserSettingsProperty.builder().apply(initializer).build()
