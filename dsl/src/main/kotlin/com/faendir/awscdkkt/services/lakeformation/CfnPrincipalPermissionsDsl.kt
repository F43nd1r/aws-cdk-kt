@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lakeformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps
import software.constructs.Construct

public fun Construct.cfnPrincipalPermissions(
  id: String,
  props: CfnPrincipalPermissionsProps,
  initializer: CfnPrincipalPermissions.() -> Unit = {},
): CfnPrincipalPermissions = CfnPrincipalPermissions(this, id, props).apply(initializer)
