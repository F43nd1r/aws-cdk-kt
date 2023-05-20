@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnService
import software.amazon.awscdk.services.ecs.CfnServiceProps
import software.constructs.Construct

public fun Construct.cfnService(
  id: String,
  props: CfnServiceProps,
  initializer: CfnService.() -> Unit = {},
): CfnService = CfnService(this, id, props).apply(initializer)

public fun Construct.cfnService(id: String, initializer: CfnService.() -> Unit = {}): CfnService =
    CfnService(this, id).apply(initializer)
