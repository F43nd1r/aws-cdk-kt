package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun eksSecretProperty(initializer: CfnJobDefinition.EksSecretProperty.Builder.() -> Unit =
    {}): CfnJobDefinition.EksSecretProperty =
    CfnJobDefinition.EksSecretProperty.builder().apply(initializer).build()
