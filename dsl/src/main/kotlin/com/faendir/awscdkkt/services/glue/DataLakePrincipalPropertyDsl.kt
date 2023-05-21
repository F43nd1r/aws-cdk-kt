package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDatabase

@Generated
public
    fun dataLakePrincipalProperty(initializer: CfnDatabase.DataLakePrincipalProperty.Builder.() -> Unit
    = {}): CfnDatabase.DataLakePrincipalProperty =
    CfnDatabase.DataLakePrincipalProperty.builder().apply(initializer).build()
