@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.PermissionsBoundaryBindOptions

public
    fun permissionsBoundaryBindOptions(initializer: PermissionsBoundaryBindOptions.Builder.() -> Unit):
    PermissionsBoundaryBindOptions =
    PermissionsBoundaryBindOptions.builder().apply(initializer).build()
