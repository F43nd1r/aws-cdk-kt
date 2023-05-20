@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnServiceAction
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps
import software.constructs.Construct

public fun Construct.cfnServiceAction(
  id: String,
  props: CfnServiceActionProps,
  initializer: CfnServiceAction.() -> Unit = {},
): CfnServiceAction = CfnServiceAction(this, id, props).apply(initializer)
