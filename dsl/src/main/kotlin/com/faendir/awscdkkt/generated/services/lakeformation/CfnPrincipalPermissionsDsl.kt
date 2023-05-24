package com.faendir.awscdkkt.generated.services.lakeformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPrincipalPermissions(id: String, props: CfnPrincipalPermissionsProps):
    CfnPrincipalPermissions = CfnPrincipalPermissions(this, id, props)

@Generated
public fun Construct.cfnPrincipalPermissions(
  id: String,
  props: CfnPrincipalPermissionsProps,
  initializer: @AwsCdkDsl CfnPrincipalPermissions.() -> Unit,
): CfnPrincipalPermissions = CfnPrincipalPermissions(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPrincipalPermissions(id: String, initializer: @AwsCdkDsl
    CfnPrincipalPermissions.Builder.() -> Unit): CfnPrincipalPermissions =
    CfnPrincipalPermissions.Builder.create(this, id).apply(initializer).build()
