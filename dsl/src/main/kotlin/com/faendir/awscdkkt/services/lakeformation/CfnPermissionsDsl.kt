@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lakeformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnPermissions
import software.amazon.awscdk.services.lakeformation.CfnPermissionsProps
import software.constructs.Construct

public fun Construct.cfnPermissions(
  id: String,
  props: CfnPermissionsProps,
  initializer: CfnPermissions.() -> Unit = {},
): CfnPermissions = CfnPermissions(this, id, props).apply(initializer)
