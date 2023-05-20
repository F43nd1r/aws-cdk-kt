@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment

public
    fun roleMappingProperty(initializer: CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder.() -> Unit):
    CfnIdentityPoolRoleAttachment.RoleMappingProperty =
    CfnIdentityPoolRoleAttachment.RoleMappingProperty.builder().apply(initializer).build()
