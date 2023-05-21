package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnSpace

@Generated
public fun spaceSettingsProperty(initializer: CfnSpace.SpaceSettingsProperty.Builder.() -> Unit =
    {}): CfnSpace.SpaceSettingsProperty =
    CfnSpace.SpaceSettingsProperty.builder().apply(initializer).build()
