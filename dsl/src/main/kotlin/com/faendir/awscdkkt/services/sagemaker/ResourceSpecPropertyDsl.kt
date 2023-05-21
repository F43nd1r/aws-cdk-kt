package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

@Generated
public fun resourceSpecProperty(initializer: CfnUserProfile.ResourceSpecProperty.Builder.() -> Unit
    = {}): CfnUserProfile.ResourceSpecProperty =
    CfnUserProfile.ResourceSpecProperty.builder().apply(initializer).build()
