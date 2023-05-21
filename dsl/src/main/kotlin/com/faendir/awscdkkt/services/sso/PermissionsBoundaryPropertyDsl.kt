package com.faendir.awscdkkt.services.sso

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnPermissionSet

@Generated
public
    fun permissionsBoundaryProperty(initializer: CfnPermissionSet.PermissionsBoundaryProperty.Builder.() -> Unit
    = {}): CfnPermissionSet.PermissionsBoundaryProperty =
    CfnPermissionSet.PermissionsBoundaryProperty.builder().apply(initializer).build()
