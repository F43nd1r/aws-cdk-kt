@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sso

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnPermissionSet

public
    fun permissionsBoundaryProperty(initializer: CfnPermissionSet.PermissionsBoundaryProperty.Builder.() -> Unit):
    CfnPermissionSet.PermissionsBoundaryProperty =
    CfnPermissionSet.PermissionsBoundaryProperty.builder().apply(initializer).build()
