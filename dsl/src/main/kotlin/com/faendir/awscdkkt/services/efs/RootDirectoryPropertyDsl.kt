package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnAccessPoint

@Generated
public
    fun rootDirectoryProperty(initializer: CfnAccessPoint.RootDirectoryProperty.Builder.() -> Unit =
    {}): CfnAccessPoint.RootDirectoryProperty =
    CfnAccessPoint.RootDirectoryProperty.builder().apply(initializer).build()
