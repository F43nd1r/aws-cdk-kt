package com.faendir.awscdkkt.services.lakeformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

@Generated
public
    fun dataLakePrincipalProperty(initializer: CfnPrincipalPermissions.DataLakePrincipalProperty.Builder.() -> Unit
    = {}): CfnPrincipalPermissions.DataLakePrincipalProperty =
    CfnPrincipalPermissions.DataLakePrincipalProperty.builder().apply(initializer).build()
