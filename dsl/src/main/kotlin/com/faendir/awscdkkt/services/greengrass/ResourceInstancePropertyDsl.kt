package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion

@Generated
public
    fun resourceInstanceProperty(initializer: CfnResourceDefinitionVersion.ResourceInstanceProperty.Builder.() -> Unit
    = {}): CfnResourceDefinitionVersion.ResourceInstanceProperty =
    CfnResourceDefinitionVersion.ResourceInstanceProperty.builder().apply(initializer).build()
