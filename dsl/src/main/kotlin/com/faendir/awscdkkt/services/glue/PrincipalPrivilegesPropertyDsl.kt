package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDatabase

@Generated
public
    fun principalPrivilegesProperty(initializer: CfnDatabase.PrincipalPrivilegesProperty.Builder.() -> Unit
    = {}): CfnDatabase.PrincipalPrivilegesProperty =
    CfnDatabase.PrincipalPrivilegesProperty.builder().apply(initializer).build()
