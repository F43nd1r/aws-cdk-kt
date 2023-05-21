package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun securityContextProperty(initializer: CfnJobDefinition.SecurityContextProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.SecurityContextProperty =
    CfnJobDefinition.SecurityContextProperty.builder().apply(initializer).build()
