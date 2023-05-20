@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDatabase

public
    fun principalPrivilegesProperty(initializer: CfnDatabase.PrincipalPrivilegesProperty.Builder.() -> Unit):
    CfnDatabase.PrincipalPrivilegesProperty =
    CfnDatabase.PrincipalPrivilegesProperty.builder().apply(initializer).build()
