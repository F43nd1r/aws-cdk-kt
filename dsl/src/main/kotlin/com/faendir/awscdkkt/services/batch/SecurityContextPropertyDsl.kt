@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

public
    fun securityContextProperty(initializer: CfnJobDefinition.SecurityContextProperty.Builder.() -> Unit):
    CfnJobDefinition.SecurityContextProperty =
    CfnJobDefinition.SecurityContextProperty.builder().apply(initializer).build()
