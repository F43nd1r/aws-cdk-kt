package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun resourceRequirementProperty(initializer: CfnJobDefinition.ResourceRequirementProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.ResourceRequirementProperty =
    CfnJobDefinition.ResourceRequirementProperty.builder().apply(initializer).build()
