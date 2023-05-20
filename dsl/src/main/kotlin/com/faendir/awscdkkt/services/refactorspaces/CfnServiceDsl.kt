@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.refactorspaces

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.refactorspaces.CfnService
import software.amazon.awscdk.services.refactorspaces.CfnServiceProps
import software.constructs.Construct

public fun Construct.cfnService(
  id: String,
  props: CfnServiceProps,
  initializer: CfnService.() -> Unit = {},
): CfnService = CfnService(this, id, props).apply(initializer)
