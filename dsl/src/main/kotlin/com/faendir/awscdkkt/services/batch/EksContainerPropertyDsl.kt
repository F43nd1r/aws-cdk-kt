package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun eksContainerProperty(initializer: CfnJobDefinition.EksContainerProperty.Builder.() -> Unit =
    {}): CfnJobDefinition.EksContainerProperty =
    CfnJobDefinition.EksContainerProperty.builder().apply(initializer).build()
