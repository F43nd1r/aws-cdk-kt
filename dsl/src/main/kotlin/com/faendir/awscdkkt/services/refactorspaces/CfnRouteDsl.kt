@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.refactorspaces

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.refactorspaces.CfnRoute
import software.amazon.awscdk.services.refactorspaces.CfnRouteProps
import software.constructs.Construct

public fun Construct.cfnRoute(
  id: String,
  props: CfnRouteProps,
  initializer: CfnRoute.() -> Unit = {},
): CfnRoute = CfnRoute(this, id, props).apply(initializer)
