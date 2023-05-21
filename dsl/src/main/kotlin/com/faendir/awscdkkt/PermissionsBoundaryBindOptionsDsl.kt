package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.PermissionsBoundaryBindOptions

@Generated
public
    fun permissionsBoundaryBindOptions(initializer: PermissionsBoundaryBindOptions.Builder.() -> Unit
    = {}): PermissionsBoundaryBindOptions =
    PermissionsBoundaryBindOptions.builder().apply(initializer).build()
