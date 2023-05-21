package com.faendir.awscdkkt.services.sso

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnPermissionSet

@Generated
public
    fun customerManagedPolicyReferenceProperty(initializer: CfnPermissionSet.CustomerManagedPolicyReferenceProperty.Builder.() -> Unit
    = {}): CfnPermissionSet.CustomerManagedPolicyReferenceProperty =
    CfnPermissionSet.CustomerManagedPolicyReferenceProperty.builder().apply(initializer).build()
