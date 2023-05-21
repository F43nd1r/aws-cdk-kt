package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun ephemeralStorageProperty(initializer: CfnJobDefinition.EphemeralStorageProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.EphemeralStorageProperty =
    CfnJobDefinition.EphemeralStorageProperty.builder().apply(initializer).build()
