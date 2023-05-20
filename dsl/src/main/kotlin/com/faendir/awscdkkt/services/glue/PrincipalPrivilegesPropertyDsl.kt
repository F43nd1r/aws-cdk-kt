@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDatabase

public
    fun principalPrivilegesProperty(initializer: CfnDatabase.PrincipalPrivilegesProperty.Builder.() -> Unit):
    CfnDatabase.PrincipalPrivilegesProperty =
    CfnDatabase.PrincipalPrivilegesProperty.builder().apply(initializer).build()
