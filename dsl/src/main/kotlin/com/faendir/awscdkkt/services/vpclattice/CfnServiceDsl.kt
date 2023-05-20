@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnService
import software.amazon.awscdk.services.vpclattice.CfnServiceProps
import software.constructs.Construct

public fun Construct.cfnService(
  id: String,
  props: CfnServiceProps,
  initializer: CfnService.() -> Unit = {},
): CfnService = CfnService(this, id, props).apply(initializer)

public fun Construct.cfnService(id: String, initializer: CfnService.() -> Unit = {}): CfnService =
    CfnService(this, id).apply(initializer)
