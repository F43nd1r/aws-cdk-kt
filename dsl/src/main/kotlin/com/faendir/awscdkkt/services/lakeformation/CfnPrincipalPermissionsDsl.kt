@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
