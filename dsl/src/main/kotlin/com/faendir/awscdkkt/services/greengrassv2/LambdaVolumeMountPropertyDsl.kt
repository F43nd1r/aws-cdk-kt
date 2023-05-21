package com.faendir.awscdkkt.services.greengrassv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

@Generated
public
    fun lambdaVolumeMountProperty(initializer: CfnComponentVersion.LambdaVolumeMountProperty.Builder.() -> Unit
    = {}): CfnComponentVersion.LambdaVolumeMountProperty =
    CfnComponentVersion.LambdaVolumeMountProperty.builder().apply(initializer).build()
