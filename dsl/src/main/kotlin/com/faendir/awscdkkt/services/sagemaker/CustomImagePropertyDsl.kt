package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

@Generated
public fun customImageProperty(initializer: CfnUserProfile.CustomImageProperty.Builder.() -> Unit =
    {}): CfnUserProfile.CustomImageProperty =
    CfnUserProfile.CustomImageProperty.builder().apply(initializer).build()
