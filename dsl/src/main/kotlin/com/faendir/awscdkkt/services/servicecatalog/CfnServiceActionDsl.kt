@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
